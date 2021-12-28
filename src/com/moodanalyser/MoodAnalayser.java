package com.moodanalyser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodAnalayser {
	public static String analaysemood(String mood) 
	{
		System.out.println(mood);
		return mood;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Share your mood like Happy or Sad");
		String value = sc.next();
		analaysemood(value);
	}	
}
