package com.capgemini;

import org.hamcrest.CoreMatchers;
import org.junit.*;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
	@Test
	public void moodAnalysis() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Sad Mood");
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}
}
