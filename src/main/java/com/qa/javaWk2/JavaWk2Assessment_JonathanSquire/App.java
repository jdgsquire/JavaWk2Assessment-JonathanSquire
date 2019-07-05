package com.qa.javaWk2.JavaWk2Assessment_JonathanSquire;

import java.util.Scanner;

public class App {

	Integer[] p = { 0, 0 };
	Integer[] pOrigin = null;

	Integer kCount = 0;

	Integer[] keyA = Strings.getKeyA();
	Integer[] keyB = Strings.getKeyB();
	Integer[] keyC = Strings.getKeyC();

	String[] gameStrings = Strings.getGameStrings();
	String[] endGameStrings = Strings.getEndGameStrings();
	String[] treasureStrings = Strings.getTreasureStrings();

	public boolean hello(String s) {
		if (s.equals("hello")) {
			return true;
		} else {
			return false;
		}
	}

	public void introText() {
		System.out.println(p[0] + " " + p[1]);
		for (int i = 0; i < 9; i++) {
			String out = gameStrings[i];
			System.out.println(out);
			Holder.timer();
		}
		Scanner s = new Scanner(System.in);
		String x = s.nextLine();

		if (x.equals("object")) {
			for (int i = 9; i < gameStrings.length; i++) {
				System.out.println(gameStrings[i]);
				Holder.timer();
			}
		} else if (x.equals("parchment")) {
			for (int i = 11; i < 14; i++) {
				System.out.println(gameStrings[i]);
				Holder.timer();
			}
			System.out.println(gameStrings[10]);
			Holder.timer();
			System.out.println(gameStrings[9]);
			Holder.timer();
			System.out.println(gameStrings[gameStrings.length - 1]);
			Holder.timer();
		}
		return;
	}

	public void arriveHome() {
		for (int i = 0; i < 2; i++) {
			String out = endGameStrings[i];
			System.out.println(out);
			Holder.timer();
		}
		Integer o = (int) (Math.random() * (treasureStrings.length));
		System.out.println(treasureStrings[o - 1]);

		for (int i = 2; i < endGameStrings.length; i++) {
			String output = endGameStrings[i];
			System.out.println(output);
			Holder.timer();
		}
		return;
	}

	public void checkKeys() {
		if (p.equals(keyA) || p.equals(keyB) || p.equals(keyC)) {
			String[] out = Strings.getKeyCollect();
			System.out.println(out[kCount - 1]);
			kCount++;
		}
		if (p.equals(keyA)) {
			keyA = null;
		}
		if (p.equals(keyB)) {
			keyB = null;
		}
		if (p.equals(keyB)) {
			keyC = null;
		}
		return;
	}
}