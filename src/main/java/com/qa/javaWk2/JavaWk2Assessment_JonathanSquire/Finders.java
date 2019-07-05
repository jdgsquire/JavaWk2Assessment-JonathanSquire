package com.qa.javaWk2.JavaWk2Assessment_JonathanSquire;

import java.util.Scanner;

public class Finders {

	public static Integer[] userCheck(Integer[] user) {
		Scanner s = new Scanner(System.in);
		String d = s.nextLine();
		if (d.equals("n") || d.toLowerCase().equals("north")) {
			user[0]--;
		} else if (d.equals("e") || d.toLowerCase().equals("east")) {
			user[1]++;
		} else if (d.equals("s") || d.toLowerCase().equals("south")) {
			user[0]++;
		} else if (d.equals("w") || d.toLowerCase().equals("west")) {
			user[1]--;
		} else {

		}
		return user;
	}

	public static Integer[] findKeys(Integer[] keyA, Integer[] keyB, Integer[] keyC, Integer[] p, Integer kCount) {
		System.out.println("The compass says: " + DistanceCalculator.closestKey(keyA, keyB, keyC, p) * 100 + " Metres");
		System.out.println("Enter a direction to move: north, east, south or west? ");
		p = userCheck(p);
		return p;
	}

	public static Integer[] findHome(Integer[] pOrigin, Integer[] p) {
		System.out.println("The compass says: " + DistanceCalculator.calcDistHome(pOrigin, p) * 100 + " Metres");
		System.out.println("Enter a direction to move: north, east, south or west? ");
		p = userCheck(p);
		return p;
	}
}
