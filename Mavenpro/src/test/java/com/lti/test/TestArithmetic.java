package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import coom.lti.code.Arithmetic;

public class TestArithmetic {
	    private Arithmetic arth;
		
		@Before
		public void init() {
			arth = new Arithmetic();
		}
		
		
		@Test
		public void testSum() {
			assertEquals(0,arth.sum(4, 6));
		}
		
		@Test
		public void testSub() {
			assertEquals(500, arth.sub(5, 10));
		}
		
		@Test
		public void testmult() {
			assertEquals(500, arth.mult(5, 10));
		}
		
	
	
}