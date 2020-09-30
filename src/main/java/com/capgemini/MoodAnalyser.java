package com.capgemini;

import java.util.*;

//Refactor TC 1..2 - test case for happy mood
public class MoodAnalyser {
	public static Scanner sc;
	public static String message;
	public MoodAnalyser() {
		
	}
	public MoodAnalyser(String message) {
		this.message=message;
	}
	public String analyseMood() {
		if (message.contains("Happy")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter your mood: ");
		String message = sc.nextLine();
		MoodAnalyser obj = new MoodAnalyser(message);
		System.out.println(obj.analyseMood());
	}

}


