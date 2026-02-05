package com.terra.app.string;

public class ValidParenthesis {

	public static void main(String[] args) {
		String inputStr = "({[]}";
		System.out.println(checkValidParenthesisOrNot(inputStr));
	}

	private static boolean checkValidParenthesisOrNot(String inputStr) {

		while (true) {
			if (inputStr.contains("()")) {
				inputStr.replace("()", "");
				return true;
			} else if (inputStr.contains("{}")) {
				inputStr.replace("{}", "");
				return true;

			} else if (inputStr.contains("[]")) {
				inputStr.replace("[]", "");
				return true;
			} else {
				inputStr.isEmpty();
				return false;

			}
		}
	}

}
