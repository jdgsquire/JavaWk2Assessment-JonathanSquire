package com.qa.javaWk2.JavaWk2Assessment_JonathanSquire;

public class Strings {

	private static String[] gameStrings = {
			"Your eyes blink open and the bright sunlight burns temporarily blinds you...",
			"...as your eyes become accustomed to the brightness, something doesnt feel right...",
			"...where are you?...", "...a foreboding swamp surrounds you on all sides...",
			"...it appears to go on for ever...", "...", "A small wooden box with three padlocks lies in front of you.",
			"On top of the wooden box are a small golden object and a folded piece of faded parchment.",
			"Which item shall you pick up first, the parchment or object?",
			"The object is dazzling. The fluid, vivd purple face appears to dance in front of you, green numbers fading in and out of existence.",
			"You pick up the other object.",
			"You unfold the note. In neat, but elegant, handwriting, you read a cryptic message:",
			"A great reward awaits you. Find the keys to discover your fate. My  compass will guide you.",
			"There is no name printed on the paper. Just a single letter 'M' written in glittering purple ink.",
			"The M dances off the page and floats towards the compass. A single number appears on the face:", };

	private static String[] endGameStrings = { "You did! you made it back!",
			"You open all three locks with the keys you've found...", "...and you gently lift the lid to reveal...",
			"There's a blinding flash of white light and you find youself lying back in your bed, just as the sun starts to peek over the horizon...",
			"...The trusty compass lies beside you...", "...you open it up to find it dull and faded.",
			"Maybe it was dream after all.", "Or was it?",
			"THANKS YOU FOR PLAYING OUR TEXT ADVENTURE. I HOPE YOU HAD FUN!" };

	private static String[] treasureStrings = { "A single uncut diamond! Nice One!", "A magic money tree!",
			"The result of the next election...", "A copy of 'The Nice and Accurate Prophecies of Agnes Nutter!'",
			"Harry Potter's Invisibility Cloak", "A tiny TARDIS",
			"A radioactive spider, which jumps onto your arm and bites!" };

	public static String[] getGameStrings() {
		return gameStrings;
	}

	public static String[] getEndGameStrings() {
		return endGameStrings;
	}

	public static String[] getTreasureStrings() {
		return treasureStrings;
	}

	private static Integer[] keyA = { 3, 5 };

	private static Integer[] keyB = { 6, 18 };
	private static Integer[] keyC = { 17, 13 };

	public static Integer[] getKeyA() {
		return keyA;
	}

	public static Integer[] getKeyB() {
		return keyB;
	}

	public static Integer[] getKeyC() {
		return keyC;
	}

	public static String[] keyCollect = {
			"Nice One! You found the first key! The compass will now direct you to another key.",
			"Awesome! You found the second key! Updating compass target...",
			"Epic!! You found all three keys! Follow the compass back to your home square to find your reward" };

	public static String[] getKeyCollect() {
		return keyCollect;
	}

}
