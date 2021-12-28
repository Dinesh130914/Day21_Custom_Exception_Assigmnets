package com.moodanalyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class MoodAnalayser2Test {

	@Test
	void test() {
		MoodAnalayser2 uc2=new MoodAnalayser2();
		assertEquals("Happy",uc2.moodanalyse("Happy"));
		assertEquals("Sad",uc2.moodanalyse("Sad"));
		assertEquals("Happy",uc2.moodanalyse(null));
		assertEquals("Happy",uc2.moodanalyse(""));
	}

}
