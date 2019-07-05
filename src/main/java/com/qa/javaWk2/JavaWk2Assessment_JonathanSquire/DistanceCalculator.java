package com.qa.javaWk2.JavaWk2Assessment_JonathanSquire;

public class DistanceCalculator {

	public static Integer closestKey(Integer[] keyA, Integer[] keyB, Integer[] keyC, Integer[] p) {
		Integer ad = calcDistA(keyA, p);
		Integer bd = calcDistB(keyB, p);
		Integer cd = calcDistC(keyC, p);
		return Math.min(ad, Math.min(bd, cd));
	}

	public static Integer calcDistA(Integer[] keyA, Integer[] p) {
		Integer a1 = p[0] - keyA[0];
		Integer a2 = p[1] - keyA[1];
		Integer aDist = (int) Math.hypot(a1, a2);
		return aDist;
	}

	public static Integer calcDistB(Integer[] keyB, Integer[] p) {
		Integer b1 = p[0] - keyB[0];
		Integer b2 = p[1] - keyB[1];
		Integer bDist = (int) Math.hypot(b1, b2);
		return bDist;
	}

	public static Integer calcDistC(Integer[] keyC, Integer[] p) {
		Integer c1 = p[0] - keyC[0];
		Integer c2 = p[1] - keyC[1];
		Integer cDist = (int) Math.hypot(c1, c2);
		return cDist;
	}

	public static Integer calcDistHome(Integer[] pOrigin, Integer[] p) {
		Integer h1 = p[0] - pOrigin[0];
		Integer h2 = p[1] - pOrigin[1];
		Integer distHome = (int) Math.hypot(h1, h2);
		return distHome;
	}

}
