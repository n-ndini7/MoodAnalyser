package com.capgemini;

import java.util.*;

//TC1.1 - test for sad mood
public class MoodAnalyser {
	public static Scanner sc;

	public String analyseMood(String message) {
		if (message.contains("Sad")) {
			return "SAD";
		} else {
			return "HAPPY";
		}
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter your mood: ");
		String message = sc.nextLine();
		MoodAnalyser obj = new MoodAnalyser();
		System.out.println(obj.analyseMood(message));
	}

}


