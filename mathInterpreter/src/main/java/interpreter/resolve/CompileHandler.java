package interpreter.resolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CompileHandler {
	private List<String> numberStack = new ArrayList<String>();
	private Stack<String> operatorsSatck = new Stack<String>();
	private boolean hasDot = false;
	private StringBuffer postfix = new StringBuffer();
	private String str;
	private String[] strCacha;

	public CompileHandler(String str) {
		this.str = str;
		exPretreatment();
		operatorsSatck.push("#");
	}

	public String handl() {
		Pretreatment();
		exPretreatment();
		for (int i = 0; i < strCacha.length; i++) {
			String s = strCacha[i];
			if (s.equals("*")) {
				if (strCacha[i + 1].equals("*")) {
					s = "**";
					i++;
				}
			} else if (s.equals("/")) {
				if (strCacha[i + 1].equals("/")) {
					s = "//";
					i++;
				}
			}
			if (PostfixUtil.isNumber(s)) {
				numberStack.add(s);
			} else if (PostfixUtil.isOperators(s)) {
				build();
				if (s.equals(")")) {
					String getS = this.operatorsSatck.pop();
					while (!getS.equals("(")) {
						build(getS);
						getS = this.operatorsSatck.pop();
					}
				} else if (s.equals("(")) {
					this.operatorsSatck.push(s);
				} else if (PostfixUtil.getPriority(s) <= PostfixUtil.getPriority(this.operatorsSatck.peek())) {
					while (PostfixUtil.getPriority(s) <= PostfixUtil.getPriority(this.operatorsSatck.peek()) && !this.operatorsSatck.isEmpty()) {
						String pop = this.operatorsSatck.pop();
						build(pop);
					}
					this.operatorsSatck.push(s);
				} else if (PostfixUtil.getPriority(s) > PostfixUtil.getPriority(this.operatorsSatck.peek())) {
					this.operatorsSatck.push(s);
				}
			} else if (s.equals(".") && !hasDot) {
				hasDot = true;
				numberStack.add(s);
			} else if (s.trim().isEmpty()) {
				continue;
			} else {
				System.out.println(s);
				throw new RuntimeException();
			}
		}
		build();
		while (!this.operatorsSatck.isEmpty()) {
			String pop = this.operatorsSatck.pop();
			if (!pop.equals("#"))
				build(pop);
		}
		return postfix.toString();
	}

	private void exPretreatment() {
		this.str = str.replaceAll(" ", "");
		this.strCacha = this.str.split("");
	}

	private void Pretreatment() {
		List<Integer> leftParenthesis = new ArrayList<Integer>();
		leftParenthesis.add(0);
		StringBuffer pretreatmentStringBuffer = new StringBuffer();
		boolean dot = true;
		for (int i = 0; i < strCacha.length; i++) {
			String thisStr = strCacha[i];
			// 数字，正常处理
			if (PostfixUtil.isNumber(thisStr)) {
				if (i > 0 && !PostfixUtil.isNumber(strCacha[i - 1])) {
					dot = true;
					if (PostfixUtil.getBrackets(strCacha[i - 1]) == 1)
						pretreatmentStringBuffer.append("*");
				}
				pretreatmentStringBuffer.append(thisStr);
				// a类运算符，查看前一位是否为数字，非数字补0
			} else if (PostfixUtil.isaClassOfOperators(thisStr)) {
				if (i == 0 || !PostfixUtil.isNumber(strCacha[i - 1])) {
					pretreatmentStringBuffer.append("(0");
					pretreatmentStringBuffer.append(thisStr);
					addEnd(leftParenthesis);
				} else {
					pretreatmentStringBuffer.append(thisStr);
				}
				// b类运算符，不能为计算式开头，不支持+*,+/,-*,-/，不支持*/或者/*，不支持连续三个运算符
			} else if (PostfixUtil.isbClassOfOperators(thisStr)) {
				// 不能为计算式开头
				if (i == 0) {
					firstStringEx(thisStr);
				} else if (!PostfixUtil.isNumber(strCacha[i - 1]) && i == 1) {
					firstStringEx(strCacha[i - 1] + thisStr);
					// 不支持+*,+/,-*,-/
				} else if (PostfixUtil.isaClassOfOperators(strCacha[i - 1])) {
					stringEx(strCacha[i - 1] + thisStr);
					// 不支持*/或者/*
				} else if (PostfixUtil.isbClassOfOperators(strCacha[i - 1])) {
					if (!strCacha[i - 1].equals(thisStr))
						stringEx(strCacha[i - 1] + thisStr);
					else
						pretreatmentStringBuffer.append(thisStr);
					// 不支持连续三个运算符
				} else if (i > 1 && !PostfixUtil.isNumber(strCacha[i - 2]) && !PostfixUtil.isNumber(strCacha[i - 1])) {
					stringEx(strCacha[i - 2] + strCacha[i - 1] + thisStr);
				} else {
					pretreatmentStringBuffer.append(thisStr);
				}
				// "9("转为"9*(",
			} else if (PostfixUtil.getBrackets(thisStr) != 0) {
				Integer brackets = PostfixUtil.getBrackets(thisStr);
				// (
				if (brackets < 0) {
					if (i > 0 && PostfixUtil.isNumber(strCacha[i - 1])) {
						pretreatmentStringBuffer.append("*");
					}
					pretreatmentStringBuffer.append(thisStr);
					leftParenthesis.add(0);
					// )
				} else {
					if (i == 0) {
						firstStringEx(thisStr);
					} else if (!PostfixUtil.isNumber(strCacha[i - 1])) {
						stringEx(strCacha[i - 1] + thisStr);
					} else {
						addRightParenthesis(pretreatmentStringBuffer, leftParenthesis);
						pretreatmentStringBuffer.append(thisStr);
					}
				}
			} else if (thisStr.equals(".") && dot) {
				dot = false;
				pretreatmentStringBuffer.append(thisStr);
			} else {
				stringEx(thisStr);
			}
		}
		addRightParenthesis(pretreatmentStringBuffer, leftParenthesis);
		this.str = pretreatmentStringBuffer.toString();
	}

	private void addEnd(List<Integer> list) {
		int index = list.size() - 1;
		Integer newEnd = list.get(index) + 1;
		list.set(index, newEnd);
	}

	private void addRightParenthesis(StringBuffer buffer, List<Integer> list) {
		int index = list.size() - 1;
		Integer end = list.get(index);
		list.remove(index);
		for (; end > 0; end--) {
			buffer.append(")");
		}
	}

	private void build(String s) {
		this.postfix.append(" ");
		this.postfix.append(s);
	}

	private void build() {
		this.hasDot = false;
		if (this.numberStack.isEmpty())
			return;
		this.postfix.append(" ");
		for (String s : this.numberStack)
			this.postfix.append(s);
		this.numberStack.clear();
	}

	private void firstStringEx(String str) {
		throw new RuntimeException("运算字符串解析错误,首字符不能为\"" + str + "\"");
	}

	private void stringEx(String str) {
		throw new RuntimeException("运算字符串解析错误,无法解析在\"" + str + "\"");
	}
}
