package com.ssd.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {
	public static void main(String[] args) {
		String AadhaarNumber="             ";
		System.out.println(Validation.isValidAadhaarNumber(AadhaarNumber));
	}
	public static boolean validateLetters(String txt) {
	    String regx = "^[a-zA-Z ]+$";
	    Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(txt);
	    return matcher.find();

	}
	
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		public static boolean validate(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		        return matcher.matches();
		}
		
		public static boolean validatePhoneNo(String txt) {
		String regex = "^\\d{10}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(txt);
		return	matcher.matches(); 
		
		}
		
		
		
		 public static boolean isValidAadhaarNumber(String txt) {

		        String regex = "^[2-9]{1}[0-9]{11}$";
		        Pattern pattern = Pattern.compile(regex);
		        Matcher matcher = pattern.matcher(txt);
			    return matcher.matches();
		 
		 }

}
