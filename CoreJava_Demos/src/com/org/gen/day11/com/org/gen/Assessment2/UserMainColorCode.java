package com.org.gen.Assessment2;

public class UserMainColorCode {

	public static int validateColorCode(String code) {
		int res = -1;
		String s2 = code.substring(1, code.length());
		if (code.length() == 7)
			if (code.charAt(0) == '#')
				for (int i = 0; i < s2.length(); i++) {
					char c = s2.charAt(i);
					if (c != '#') {
						if (s2.matches("[A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}"))
							res = 1;
						else {
							res = -1;
							break;
						}
					}
				}

		return res;
	}
}
