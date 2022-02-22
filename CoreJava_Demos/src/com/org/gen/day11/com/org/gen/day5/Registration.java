package com.org.gen.day5;

import java.util.*;

public class Registration {

	List<String> registrationName = Arrays.asList("xyz", "abc");

	public void validate(String name) throws NameNotFoundExcetion {
		// TODO Auto-generated method stub

		if (registrationName.contains(name))
			throw new NameNotFoundExcetion(" Not in list");

	}

}
