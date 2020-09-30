package com.capgemini;

import com.capgemini.MoodAnalyserException.ExceptionType;
import java.util.*;

//UC2 - throw handle exception for null input 
public class MoodAnalyser {
	public static Scanner sc;
	public static String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood() throws MoodAnalyserException {
		try {
			if (message.length() == 0)
				throw new MoodAnalyserException(ExceptionType.ENTERED_EMPTY, "Mood cannot be empty!!");
			message = message.toLowerCase();
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		} catch (NullPointerException e) {
			throw new MoodAnalyserException(ExceptionType.ENTERED_NULL, "Mood cannot be null!!");
		}

	}
}
