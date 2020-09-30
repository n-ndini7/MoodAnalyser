package com.capgemini;

import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
	@Test
	public void moodAnalysis() throws NullPointerException {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		// for null input 
		String mood = moodAnalyser.analyseMood();
		ExpectedException x = ExpectedException.none();
		x.expect(NullPointerException.class);
		Assert.assertEquals("Wrong input entered. Exception thrown!!", mood);
	}


}
