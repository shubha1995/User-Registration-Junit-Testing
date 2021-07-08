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
	// Check First Name

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

	// Check Last Name

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

	// Check Email

	@Test
	public void givenEmail_WhenEmail_is_Valid_ShouldReturn() {

		boolean actual = userReg.isEmail("ssbhaumik.dmr@gmail.com.in");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenEmail_WhenEmail_does_not_contain_Special_char_ShouldReturn() {

		boolean actual = userReg.isEmail("ssbhaumikdmrgmailcomin");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenEmail_WhenEmail_Should_not_End_with_Number_ShouldReturn() {

		boolean actual = userReg.isEmail("ssbhaumik.dmr@gmail.com.in12");
		Assert.assertFalse(actual);
	}

	// Check Mobile Format

	@Test
	public void givenmobileNo_WhenMobileNo_is_Valid_ShouldReturn() {

		boolean actual = userReg.isMobileNo("91 7005803672");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenmobileNo_WhenMobileNo_contain_char_ShouldReturn() {

		boolean actual = userReg.isMobileNo("91 700580367a");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenmobileNo_WhenMobileNo_contain_more_then_one_space_ShouldReturn() {

		boolean actual = userReg.isMobileNo("91  7005803672");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenmobileNo_WhenMobileNo_Contain_More_Then_Ten_Digit_ShouldReturn() {

		boolean actual = userReg.isMobileNo("91 700580367233");
		Assert.assertFalse(actual);
	}

	// Check Password Rule 1

	@Test
	public void givenpassword_WhenPassword_is_Valid_ShouldReturn() {

		boolean actual = userReg.isPassword("abcdefgh");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenpassword_WhenPassword_is_Less_then_8_char_ShouldReturn() {

		boolean actual = userReg.isPassword("abcdefg");
		Assert.assertFalse(actual);
	}
	
	@Test
	public void givenpassword_WhenPassword_contain_number_char_ShouldReturn() {

		boolean actual = userReg.isPassword("abcdefgh7i");
		Assert.assertFalse(actual);
	}
	
	// Check Password Rule 2

	@Test
	public void givenpassword1_WhenPassword1_is_Valid_ShouldReturn() {

		boolean actual = userReg.isPassword1("Abcdefgh");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenpassword1_WhenPassword1_Contain_Lower_Case_ShouldReturn() {

		boolean actual = userReg.isPassword1("abcdefghi");
		Assert.assertFalse(actual);
	}
	

}
