package com.moodanalyser;

import com.exception.InvalidMoodException;

public class MoodAnalayser2 {
	public  static String moodanalyse(String mood) {
		
		try {
			if (mood == null || mood.isEmpty()) {
				throw new InvalidMoodException("Null Value Passed");
			}
		} catch (InvalidMoodException e) {
			
			e.printStackTrace();
			
			return "Happy";
		}

		return mood;
	}
	
	public static void main(String[] args) {
		
		try {
			
			moodanalyse(null);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
