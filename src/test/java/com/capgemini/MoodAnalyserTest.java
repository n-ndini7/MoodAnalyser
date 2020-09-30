package com.capgemini;

import static org.junit.Assert.*;
import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
	@Test
	public void moodAnalysis() {
		MoodAnalyser obj = new MoodAnalyser(null);
		try {
			obj.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	public void TestMoodAnalysisEnteredEmpty() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
		moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
