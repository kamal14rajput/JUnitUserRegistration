package com.bridgelabz;



import org.junit.Assert;
import org.junit.Test;

public class JUnitUserRegistration {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Kamal");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("kamal");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenFirstName_WhenEmptyString_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("ka");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenFirstName_WhenHavingNumber_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("734");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenFirstName_WhenHavingSpecialChar_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Kam@#");
		Assert.assertFalse(isValid);

	}
}

