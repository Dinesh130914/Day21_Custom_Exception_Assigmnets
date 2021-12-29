package com.userexception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberException extends Exception {
	public MobileNumberException(String msg) 
	{
		super();
	}
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the mobile no");
		String mobileno = scanner.next();
		try {
		String pattern = "^[0-9]{2}[\s]{1}[0-9]{10}$";
		Pattern regex = Pattern.compile(pattern);
		Matcher inputmMatcher = regex.matcher(mobileno);

		if (!inputmMatcher.matches()) {
			throw new MobileNumberException("Invalid Mobile Number");
		} else {
			System.out.println("Valid Mobile number");
		}
		}catch(MobileNumberException e) 
		{
			e.printStackTrace();
		}
	}
}
