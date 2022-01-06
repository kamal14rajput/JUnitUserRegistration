package com.bridgelabz;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Rajput");
		assertTrue(isValid);
	}

	@Test
	public void givenLastName_WhenFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("rajput");
		assertFalse(null, isValid);

	}

	@Test
	public void givenLastName_WhenEmptyString_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("");
		assertFalse(isValid);

	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("ra");
		assertFalse(isValid);

	}

	@Test
	public void givenLastName_WhenHavingNumber_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("4535");
		assertFalse(isValid);

	}

	@Test
	public void givenLastName_WhenHavingSpecialChar_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("r#@t");
		assertFalse(isValid);

	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userEmail("kamal@gmail.com");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenEmail_WhenEmptyString_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userEmail("");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenEmail_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userEmail("fshg");
		Assert.assertFalse(isValid);

	}
	@Test
	public void givenPhoneNo_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userPhoneNo("918806547659");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenPhoneNo_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userPhoneNo("9188064");
		Assert.assertFalse(isValid);

	}

	@Test
	public void givenPassword_WhenOnespecialcharacter_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userPassword("pasW8rrd#");
	    Assert.assertTrue( isValid);
	}
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userPassword("Pass");
		Assert.assertFalse(isValid);
	    
	}
	@Test
	public void givenPassword_WhenNospecialcharacter_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userPassword("Password");
		Assert.assertFalse(isValid);
	    
	}
	
}
