package com.userexception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailException extends Exception {
	public EmailException(String msg) {
		super(msg);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email ID : ");
		String inputStr = sc.nextLine();
		
		try {
			String mailPattern = "^abc(.+)[A-Za-z0-9]+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
			Pattern regex = Pattern.compile(mailPattern);
			Matcher emailIDMatcher = regex.matcher(inputStr);
			sc.close();
			
			if (!emailIDMatcher.matches()) {
				throw new EmailException("Invalid Email Id");
			} else {
				System.out.println("valid mail id");
			}
			
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}
}
