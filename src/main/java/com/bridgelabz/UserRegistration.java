package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FirstName = "^[A-Z][a-z]{2,}";
	private static final String LastName = "^[A-Z][a-z]{2,}";
	private static final String EmailRegex = "^[A-Za-z0-9_-]+([.][A-Za-z0-9_-]+)@[A-Za-z]+[A-Za-z]+([.][A-Za-z]+)";

	public boolean userFirstName(String firstName) {

		Pattern pattern = Pattern.compile(FirstName);
		Matcher matcher = pattern.matcher(firstName);

		return matcher.matches();

	}

	public static boolean userLastName(String lastName) {

		Pattern pattern = Pattern.compile(LastName);
		Matcher matcher = pattern.matcher(lastName);

		return matcher.matches();

	}

	public boolean userEmail(String email) {

		Pattern pattern = Pattern.compile(EmailRegex);
		Matcher matcher = pattern.matcher(email);

		return matcher.matches();
	}
}
