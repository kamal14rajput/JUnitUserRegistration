package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FirstName = "^[A-Z][a-z]{2,}";
	private static final String LastName = "^[A-Z][a-z]{2,}";
	private static final String EmailRegex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";
	private static final String PhoneNoRegex = "^[0-9]{2}[0-9]{10}";
	private static final String PasswordRegex= ("^(?=.*[@#$%^&+=])(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$");


	public boolean userFirstName(String firstName) throws UserDefineException {

		Pattern pattern = Pattern.compile(FirstName);
		Matcher matcher = pattern.matcher(firstName);
		if(!matcher.matches()) {
			throw new UserDefineException("Enter a valid pattern");
		}
		return matcher.matches();

	}

	public static boolean userLastName(String lastName) throws UserDefineException {

		Pattern pattern = Pattern.compile(LastName);
		Matcher matcher = pattern.matcher(lastName);
		if(!matcher.matches()) {
			throw new UserDefineException("Enter a valid pattern");
		}
		
		return matcher.matches();

	}

	public static boolean userEmail(String email) throws UserDefineException
	{

		Pattern pattern = Pattern.compile(EmailRegex);
		Matcher matcher = pattern.matcher(email);
		if(!matcher.matches()) {
			throw new UserDefineException("Enter a valid pattern");
		}
		
		return matcher.matches();
	}

	public boolean userPhoneNo(String phone) throws UserDefineException {
		
		Pattern pattern = Pattern.compile(PhoneNoRegex);
		Matcher matcher = pattern.matcher(phone);
		if(!matcher.matches()) {
			throw new UserDefineException("Enter a valid pattern");
		}
		return matcher.matches();
	}

	public boolean userPassword(String password) throws UserDefineException {
		
		Pattern pattern = Pattern.compile(PasswordRegex);
		Matcher matcher = pattern.matcher(password);
		if(!matcher.matches()) {
			throw new UserDefineException("Enter a valid pattern");
		}
		
		return matcher.matches();
	}
}
