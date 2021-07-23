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
	public void givenName_WhenFirstNameCaptial_ShouldReturn_True() {

		boolean actual = userReg.isFirstName("Shubha");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenFirstName_FirstCharacter_IsInLowerCase_ShouldReturn_False() {

		boolean actual = userReg.isFirstName("shubha");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstName_SpecialCharacter_IsThere_OrNot_ShouldReturn_False() {

		boolean actual = userReg.isFirstName("Shubha@");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstName_HaveNumbers_ShouldReturn_False() {

		boolean actual = userReg.isFirstName("Shubha123");
		Assert.assertFalse(actual);
	}

	// Check Last Name

	@Test
	public void givenName_WhenLastNameCaptial_ShouldReturn_True() {

		boolean actual = userReg.isLastName("Bhaumik");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenLastName_FirstCharacter_IsInLowerCase_ShouldReturn_False() {

		boolean actual = userReg.isLastName("bhaumik");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenLastName_SpecialCharacter_IsThere_OrNot_ShouldReturn_False() {

		boolean actual = userReg.isLastName("Bhaumik@");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenLastName_HaveNumbers_ShouldReturn_False() {

		boolean actual = userReg.isLastName("Bhaumik123");
		Assert.assertFalse(actual);
	}

	// Check Email

	@Test
	public void givenEmail_WhenEmail_is_Valid_ShouldReturn_True() {

		boolean actual = userReg.isEmail("ssbhaumik.dmr@gmail.com.in");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenEmail_WhenEmail_tld_can_not_staret_with_dot_ShouldReturn_False() {

		boolean actual = userReg.isEmail("ssbhaumikdmr@.gmailcom.in");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenEmail_WhenEmail_first_character_can_not_start_dot_with_ShouldReturn_False() {

		boolean actual = userReg.isEmail("ssbhaumikdmr@.gmail.com.in");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenEmail_WhenEmail_tld_must_contain_atlist_two_letteers_ShouldReturn_False() {

		boolean actual = userReg.isEmail("ssbhaumikdmr@.gmail.com.in");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenEmail_WhenEmail_does_not_contain_Special_char_ShouldReturn_False() {

		boolean actual = userReg.isEmail("ssbhaumikdmrgmailcomin");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenEmail_WhenEmail_Should_not_End_with_Number_ShouldReturn_False() {

		boolean actual = userReg.isEmail("ssbhaumik.dmr@gmail.com.in12");
		Assert.assertFalse(actual);
	}

	// Check Mobile Format

	@Test
	public void givenmobileNo_WhenMobileNo_is_Valid_ShouldReturn_True() {

		boolean actual = userReg.isMobileNo("91 7005803672");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenmobileNo_WhenMobileNo_contain_char_ShouldReturn_False() {

		boolean actual = userReg.isMobileNo("91 700580367a");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenmobileNo_WhenMobileNo_contain_more_then_one_space_ShouldReturn_False() {

		boolean actual = userReg.isMobileNo("91  7005803672");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenmobileNo_WhenMobileNo_Contain_More_Then_Ten_Digit_ShouldReturn_False() {

		boolean actual = userReg.isMobileNo("91 700580367233");
		Assert.assertFalse(actual);
	}

	// Check Password Rule 1

	@Test
	public void givenpassword_WhenPassword_is_Valid_ShouldReturn_True() {

		boolean actual = userReg.isPassword("abcdefgh");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenpassword_WhenPassword_is_Less_then_8_char_ShouldReturn_False() {

		boolean actual = userReg.isPassword("abcdefg");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenpassword_WhenPassword_contain_number_char_ShouldReturn_False() {

		boolean actual = userReg.isPassword("abcdefgh7i");
		Assert.assertFalse(actual);
	}

	// Check Password Rule 2

	@Test
	public void givenpassword1_WhenPassword1_is_Valid_ShouldReturn_True() {

		boolean actual = userReg.isPassword1("Abcdefgh");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenpassword1_WhenPassword1_Contain_Lower_Case_ShouldReturn_False() {

		boolean actual = userReg.isPassword1("abcdefgh");
		Assert.assertFalse(actual);
	}

	// Check Password Rule 3

	@Test
	public void givenpassword2_WhenPassword2_is_Valid_ShouldReturn_True() {

		boolean actual = userReg.isPassword2("Abcdefgh12");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenpassword2_WhenPassword2_does_not_have_digit_ShouldReturn_False() {

		boolean actual = userReg.isPassword2("Abcdefghi");
		Assert.assertFalse(actual);
	}

	// Check Password Rule 4

	@Test
	public void givenpassword3_WhenPassword3_is_Valid_ShouldReturn_True() {

		boolean actual = userReg.isPassword3("Abcdefgh12@12");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenpassword3_WhenPassword3_have_Lessthen_8_digit_ShouldReturn_False() {

		boolean actual = userReg.isPassword3("Abcdefg");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenpassword3_WhenPassword3_have_only_character_ShouldReturn_False() {

		boolean actual = userReg.isPassword3("Abcdefgijkl");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenpassword3_WhenPassword3_dont_have_specialCharacter_ShouldReturn_False() {

		boolean actual = userReg.isPassword3("Abc@defgijkl");
		Assert.assertFalse(actual);
	}

}
