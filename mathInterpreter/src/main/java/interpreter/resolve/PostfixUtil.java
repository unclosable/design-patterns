package interpreter.resolve;

import java.util.HashMap;
import java.util.Map;

public class PostfixUtil {
	private static final Map<String, Integer> priorityMap = new HashMap<String, Integer>();
	private static final Map<String, Integer> aClassOfOperators = new HashMap<String, Integer>();
	private static final Map<String, Integer> bClassOfOperators = new HashMap<String, Integer>();
	private static final Map<String, Integer> cClassOfOperators = new HashMap<String, Integer>();
	private static final Map<String, Integer> classOfBrackets = new HashMap<String, Integer>();
	private static final Map<String, Integer> digitalMap = new HashMap<String, Integer>();
	static {
		priorityMap.put("#", -1);
		priorityMap.put("(", 0);
		priorityMap.put("+", 1);
		priorityMap.put("-", 1);
		priorityMap.put("*", 2);
		priorityMap.put("/", 2);
		priorityMap.put("**", 3);
		priorityMap.put("//", 3);
		priorityMap.put(")", 3);
		aClassOfOperators.put("+", 1);
		aClassOfOperators.put("-", 1);
		bClassOfOperators.put("*", 2);
		bClassOfOperators.put("/", 2);
		cClassOfOperators.put("**", 3);
		cClassOfOperators.put("//", 3);
		classOfBrackets.put(")", 1);
		classOfBrackets.put("(", -1);
		for (Integer i = 0; i < 10; i++) {
			digitalMap.put(Integer.toString(i), i);
		}
	}

	public static boolean isNumber(String c) {
		return digitalMap.get(c) != null;
	}

	public static boolean isOperators(String c) {
		return priorityMap.get(c) != null;
	}

	public static boolean isaClassOfOperators(String c) {
		return aClassOfOperators.get(c) != null;
	}

	public static boolean isbClassOfOperators(String c) {
		return bClassOfOperators.get(c) != null;
	}

	public static boolean iscClassOfOperators(String c) {
		return cClassOfOperators.get(c) != null;
	}

	public static Integer getBrackets(String c) {
		Integer re = classOfBrackets.get(c);
		if (re == null)
			re = 0;
		return re;
	}

	public static boolean isOperatableOperators(String c) {
		return aClassOfOperators.get(c) != null || bClassOfOperators.get(c) != null || cClassOfOperators.get(c) != null;
	}

	public static Integer getPriority(String c) {
		return priorityMap.get(c);
	}

	public static double getDigital(char... cs) {
		return 0;
	}

}
