package com.qa.javaWk2.JavaWk2Assessment_JonathanSquire;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AssessmentTest {
	
	Assessment a = new Assessment();
	
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