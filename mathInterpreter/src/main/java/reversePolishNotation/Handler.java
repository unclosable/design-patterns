package reversePolishNotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import behavioral_patterns.interpreter.src.PostfixStringHandler;

public class Handler {
	private List<String> numberStack = new ArrayList<String>();
	private Stack<String> operatorsSatck = new Stack<String>();
	private boolean hasDot = false;
	private StringBuffer postfix = new StringBuffer();
	private int operatorsTop;
	private String str;

	public Handler(String str) {
		this.str = str;
		operatorsTop = -1;
	}

	public String handl() {
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
					if (this.operatorsSatck.isEmpty())
						this.operatorsTop = 0;
					else
						this.operatorsTop = PostfixUtil.getPriority(this.operatorsSatck.peek());
				} else if (s.equals("(")) {
					this.operatorsSatck.push(s);
					this.operatorsTop = PostfixUtil.getPriority(s);
				} else if (PostfixUtil.getPriority(s) <= this.operatorsTop) {
					build(this.operatorsSatck.pop());
					this.operatorsSatck.push(s);
					this.operatorsTop = PostfixUtil.getPriority(s);
				} else if (PostfixUtil.getPriority(s) > this.operatorsTop) {
					this.operatorsSatck.push(s);
					this.operatorsTop = PostfixUtil.getPriority(s);
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
		while (!this.operatorsSatck.isEmpty())
			build(this.operatorsSatck.pop());
		return postfix.toString();
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
		String classicStr = "1.1-1.2*2";
		Handler handler = new Handler(classicStr);
		String postFix = handler.handl();
		System.out.println("后缀式：" + postFix);
		System.out.println("计算结果：" + PostfixStringHandler.handler(postFix));
	}

}
