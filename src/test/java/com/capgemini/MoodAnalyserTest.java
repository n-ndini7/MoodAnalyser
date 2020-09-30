package com.capgemini;

import static org.junit.Assert.*;
import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
	@Test
	public void moodAnalysis() throws NullPointerException {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);

	}

	@Test
	public void moodAnalysis_throws_nullException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
		}
	}

}
