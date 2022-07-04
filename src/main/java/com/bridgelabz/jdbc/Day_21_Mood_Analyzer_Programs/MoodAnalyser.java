package com.bridgelabz.jdbc.Day_21_Mood_Analyzer_Programs;

public class MoodAnalyser {

	String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {

		if (this.message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

}
