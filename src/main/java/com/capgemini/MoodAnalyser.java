package com.capgemini;

import java.util.*;

//Refactor UC1 - default and parameterized constructors 
public class MoodAnalyser {
	public static Scanner sc;
	public static String message;
	public MoodAnalyser() {
		
	}
	public MoodAnalyser(String message) {
		this.message=message;
	}
	public String analyseMood() {
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
		MoodAnalyser obj = new MoodAnalyser(message);
		System.out.println(obj.analyseMood());
	}

}


