package com.bridgelabz.jdbc.Day_21_Mood_Analyzer_Programs;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws Exception {

		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a Sad message");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws Exception {

		MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a Happy message");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {

		MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY", mood);

	}
}