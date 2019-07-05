package com.qa.javaWk2.JavaWk2Assessment_JonathanSquire;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AssessmentTest {
	
	App a = new App();
	DistanceCalculator d = new DistanceCalculator();
	
	@Before
	public void init() {

	}
	
	@Test
	public void testHello() {
		assertTrue(a.hello("hello"));
	}

	@Test
	public void testHelloFail() {
		assertFalse(a.hello("yolo"));
	}
}

// @Test
// public void testIntroText() {
// assertTrue(a.introText());
// }
//
// @Test
// public void testDistanceA() {
// assertNotNull(d.calcDistA());
// }
//
// @Test
// public void testDistanceB() {
// assertNotNull(d.calcDistB());
// }
//
// @Test
// public void testDistanceC() {
// assertNotNull(d.calcDistC());
// }
//
// @Test
// public void testClosestKey() {
// assertNotNull(d.closestKey());
// }
//
// }