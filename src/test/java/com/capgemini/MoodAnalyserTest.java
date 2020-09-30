package com.capgemini;

import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
	@Test
	public void moodAnalysis() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}

}
