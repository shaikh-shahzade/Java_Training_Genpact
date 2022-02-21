package com.org.gen.Assessment2;

public class UserMainCode_ValidatePassword {

	static int validatePassword(String pass) {
		int res = -1;

		if (pass.length() >= 8) {
			if (pass.contains("#") || pass.contains("@") || pass.contains("_")) {
				char c = pass.charAt(0);
				if (Character.isAlphabetic(c)) {
					char dd = pass.charAt(pass.length() - 1);

					if ((Character.isAlphabetic(dd)) || (Character.isDigit(dd))) {
						if (pass.matches(".*[0-9]{1,}.*") || pass.matches(".*[a-zA-Z]{1,}.*")) {
							res = 1;
						}
					}
				}
			}
		}
		return res;
	}

}
