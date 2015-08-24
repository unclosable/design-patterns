package reversePolishNotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import behavioral_patterns.interpreter.src.PostfixStringHandler;

public class CompileHandler {
	private List<String> numberStack = new ArrayList<String>();
	private Stack<String> operatorsSatck = new Stack<String>();
	private boolean hasDot = false;
	private StringBuffer postfix = new StringBuffer();
	private String str;

	public CompileHandler(String str) {
		this.str = str;
		operatorsSatck.push("#");
	}

	public String handl() {
		Pretreatment();
		String[] strs = str.split("");
		for (int i = 0; i < strs.length; i++) {
			String s = strs[i];
			if (s.equals("*")) {
				if (strs[i + 1].equals("*")) {
					s = "**";
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

	private void Pretreatment() {
		String[] strs = str.split("");
		List<Integer> LeftParenthesis = new ArrayList<Integer>();
		LeftParenthesis.add(0);
		// int idx = 0;
		StringBuffer re = new StringBuffer();
		for (int i = 0; i < strs.length; i++) {
			String thisStr = strs[i];
			if (PostfixUtil.isfirstLevelOperators(thisStr) && (i == 0 || PostfixUtil.isLevelOperators(strs[i - 1]))) {
				re.append("(0" + thisStr);
				LeftParenthesis.set(LeftParenthesis.size() - 1, LeftParenthesis.get(LeftParenthesis.size() - 1) + 1);
				// idx++;
			} else if (LeftParenthesis.get(LeftParenthesis.size() - 1) > 0 && PostfixUtil.isNumber(thisStr) && (i < strs.length - 1 && PostfixUtil.isLevelOperators(strs[i + 1]))) {
				re.append(thisStr);
				for (int j = LeftParenthesis.get(LeftParenthesis.size() - 1); j > 0; j--) {
					re.append(")");
					LeftParenthesis.set(LeftParenthesis.size() - 1, 0);
				}
			} else if (i != 0 && thisStr.equals("(") && PostfixUtil.isNumber(strs[i - 1])) {
				re.append("*(");
				LeftParenthesis.add(0);
			} else if (i != 0 && PostfixUtil.isNumber(thisStr) && strs[i - 1].equals(")")) {
				re.append("*" + thisStr);
			} else if (PostfixUtil.issecondLevelOperators(thisStr)
					&& ((i < 1 || (!strs[i - 1].equals("*") && PostfixUtil.isLevelOperators(strs[i - 1]))) || (i > 1 && PostfixUtil.isLevelOperators(strs[i - 1]) && PostfixUtil
							.isLevelOperators(strs[i - 2])))) {
				throw new RuntimeException();
			} else {
				re.append(thisStr);
				if (thisStr.equals("("))
					LeftParenthesis.add(0);
				else if (thisStr.equals(")"))
					LeftParenthesis.remove(LeftParenthesis.size() - 1);
				for (int j = LeftParenthesis.get(LeftParenthesis.size() - 1); j > 0; j--) {
					re.append(")");
					LeftParenthesis.set(LeftParenthesis.size() - 1, 0);
				}
			}
		}
		for (int j = LeftParenthesis.get(LeftParenthesis.size() - 1); j > 0; j--) {
			re.append(")");
			LeftParenthesis.set(LeftParenthesis.size() - 1, 0);
		}
		System.out.println("中间解析：" + re.toString());
		this.str = re.toString();
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

	public static void main(String[] args) {
		String[] testStrings = { "(2+3)4", "(1+2)", "3(1+2)", "2*-3", "2**-3", "-(22-10)", "1.22+3", "3.33*4.12/5.22", "3.1(2/3.4)", "3.1*2/3.4", "2*3+4", "-2(3+4)", "-2*-3", "-(22-10*(1-1)-3+-2)",
				"1+++2", "1----2", "4/2", "4-3" };
		for (String s : testStrings) {
			System.out.println("-----------------------------");
			System.out.println("测试字符：" + s);
			CompileHandler handler = new CompileHandler(s);
			String postFix = null;
			try {
				postFix = handler.handl();
			} catch (Exception e) {
				System.out.println("后缀式解析出错，退出");
				e.printStackTrace();
			}
			System.out.println("后缀式：" + postFix);
			try {
				System.out.println("计算结果：" + PostfixStringHandler.handler(postFix));

			} catch (Exception e) {
				System.out.println("计算出错，退出");
			}
		}
	}

}
