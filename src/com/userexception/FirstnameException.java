package com.userexception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FirstnameException extends Exception{
	public FirstnameException (String msg)
	{
		super(msg);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first name : ");
		try {
			String namePattern = "^[A-Z]{1}[a-z]{3,5}$";
			Pattern regex = Pattern.compile(namePattern);
			String inputStr = sc.nextLine();
			Matcher firstNameMatcher = regex.matcher(inputStr);
			sc.close();
			if(!firstNameMatcher.matches()) 
			{
				throw new FirstnameException("Invalid First Name");
			}else 
			{
				System.out.println("Valid Name");
			}
		}

		catch (FirstnameException e) {
			e.printStackTrace();
		}
	}
}
