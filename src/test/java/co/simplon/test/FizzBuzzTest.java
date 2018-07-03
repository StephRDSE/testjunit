package co.simplon.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void testNumbers1And1() {
		int min = 1;
		int max = 1;
		assertEquals("1", FizzBuzz.fizzBuzz(min,max));
	}
	@Test
	public void testNumbers2And2() {
		int min = 2;
		int max = 2;
		assertEquals("2", FizzBuzz.fizzBuzz(min,max));
	}
	@Test
	public void testNumbers3And3() {
		int min = 3;
		int max = 3;
		assertEquals("fizz", FizzBuzz.fizzBuzz(min,max));
	}
	@Test
	public void testNumbers5And5() {
		int min = 5;
		int max = 5;
		assertEquals("buzz", FizzBuzz.fizzBuzz(min,max));
	}
	@Test
	public void testNumbers15And15() {
		int min = 15;
		int max = 15;
		assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(min,max));
	}
	@Test
	public void testNumbers1And2() {
		int min = 1;
		int max = 2;
		assertEquals("1" + "2", FizzBuzz.fizzBuzz(min,max));
	}
	@Test
	public void testNumbers1And3() {
		int min = 1;
		int max = 3;
		assertEquals("1" + "2" + "fizz", FizzBuzz.fizzBuzz(min,max));
	}
	@Test
	public void testNumbers1And5() {
		int min = 1;
		int max = 5;
		assertEquals("1" + "2" + "fizz" + "4" + "buzz", FizzBuzz.fizzBuzz(min,max));
	}

}
