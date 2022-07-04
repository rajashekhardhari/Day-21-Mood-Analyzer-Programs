package com.bridgelabz.jdbc.Day_21_Mood_Analyzer_Programs;

public class MoodAnalyserException extends Exception{
	
	enum ExceptionType {
		ENTERED_NULL, ENTERED_EMPTY
	}

	ExceptionType type;

	public MoodAnalyserException(ExceptionType type, String message) {

		super(message);
		this.type = type;
	}


}
