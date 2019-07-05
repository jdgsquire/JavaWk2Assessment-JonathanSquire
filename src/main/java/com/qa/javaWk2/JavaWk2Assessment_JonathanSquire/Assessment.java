package com.qa.javaWk2.JavaWk2Assessment_JonathanSquire;

public class Assessment {
	
	public static void main(String[] args) {
		App a = new App();

		a.p[0] = (int) (Math.random() * 21);
		a.p[1] = (int) (Math.random() * 21);
		a.pOrigin = a.p;
		a.introText();
		while (a.kCount < 3) {
			a.p = Finders.findKeys(a.keyA, a.keyB, a.keyC, a.p, a.kCount);
			a.checkKeys();

		}
		while (!a.p.equals(a.pOrigin)) {
			a.p = Finders.findHome(a.pOrigin, a.p);
		}
		a.arriveHome();
	}
}
