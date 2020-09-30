package com.capgemini;

import java.util.*;

//UC1 - given a message , ability to analyse happy or sad mood
public class MoodAnalyser {
	public static Scanner sc;

	public String analyseMood(String message) {
		if (message.contains("Sad")) {
			return "Sad Mood";
		} else {
			return "Happy Mood";
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
