package reversePolishNotation;

import java.util.HashMap;
import java.util.Map;

public class PostfixUtil {
	private static final Map<String, Integer> priorityMap = new HashMap<String, Integer>();
	private static final Map<String, Integer> firstLevelPriorityMap = new HashMap<String, Integer>();
	private static final Map<String, Integer> secondLevelPriorityMap = new HashMap<String, Integer>();
	private static final Map<String, Integer> digitalMap = new HashMap<String, Integer>();
	static {
		priorityMap.put("#", -1);
		priorityMap.put("(", 0);
		priorityMap.put("+", 1);
		priorityMap.put("-", 1);
		priorityMap.put("*", 2);
		priorityMap.put("/", 2);
		priorityMap.put("**", 3);
		priorityMap.put(")", 3);
		firstLevelPriorityMap.put("+", 1);
		firstLevelPriorityMap.put("-", 1);
		secondLevelPriorityMap.put("*", 2);
		secondLevelPriorityMap.put("/", 2);
		secondLevelPriorityMap.put("**", 3);
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

	public static boolean isfirstLevelOperators(String c) {
		return firstLevelPriorityMap.get(c) != null;
	}

	public static boolean issecondLevelOperators(String c) {
		return secondLevelPriorityMap.get(c) != null;
	}

	public static boolean isLevelOperators(String c) {
		return secondLevelPriorityMap.get(c) != null || firstLevelPriorityMap.get(c) != null;
	}

	public static Integer getPriority(String c) {
		return priorityMap.get(c);
	}

	public static double getDigital(char... cs) {
		return 0;
	}

}
