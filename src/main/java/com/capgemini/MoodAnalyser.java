package com.capgemini;

import java.util.*;

//UC2 - throw handle exception for null input 
public class MoodAnalyser {
	public static Scanner sc;
	public static String message;
	public MoodAnalyser() {
		
	}
	public MoodAnalyser(String message) {
		this.message=message;
	}
	public String analyseMood() {
		try {
		if (message.contains("Sad")) 
			return "SAD";
			else  
			return "HAPPY";
		}
		catch(NullPointerException e) {
			System.out.println("Wrong input entered. Exception thrown!!");
			return "HAPPY";
		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter your mood: ");
		String message = null;
		MoodAnalyser obj = new MoodAnalyser(message);
		System.out.println(obj.analyseMood());
	}

}


