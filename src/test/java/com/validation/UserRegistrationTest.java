package com.validation;

import org.junit.Before;
import org.junit.Test;
import org.junit.*;


public class UserRegistrationTest {
	UserReg userReg;

	@Before
	public void setUp() {
		userReg = new UserReg();

	}
	//Check First Name 
	
	@Test
	public void givenName_WhenFirstNameCaptial_ShouldReturn() {

		boolean actual = userReg.isFirstName("Shubha");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenFirstName_FirstCharacter_IsInLowerCase() {

		boolean actual = userReg.isFirstName("shubha");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstName_SpecialCharacter_IsThere_OrNot() {

		boolean actual = userReg.isFirstName("Shubha@");
		Assert.assertFalse(actual);
	}

	
	@Test
	public void givenName_WhenFirstName_HaveNumbers() {

		boolean actual = userReg.isFirstName("Shubha123");
		Assert.assertFalse(actual);
	}
	
	//Check Last Name 
	
	@Test
	public void givenName_WhenLastNameCaptial_ShouldReturn() {

		boolean actual = userReg.isLastName("Bhaumik");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenLastName_FirstCharacter_IsInLowerCase() {

		boolean actual = userReg.isLastName("bhaumik");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenLastName_SpecialCharacter_IsThere_OrNot() {

		boolean actual = userReg.isLastName("Bhaumik@");
		Assert.assertFalse(actual);
	}

	
	@Test
	public void givenName_WhenLastName_HaveNumbers() {

		boolean actual = userReg.isLastName("Bhaumik123");
		Assert.assertFalse(actual);
	}

}
