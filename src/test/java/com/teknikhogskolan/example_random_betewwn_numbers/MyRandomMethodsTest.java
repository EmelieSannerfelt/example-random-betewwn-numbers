package com.teknikhogskolan.example_random_betewwn_numbers;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyRandomMethodsTest {
	MyRandomMethods mrm = new MyRandomMethods();

	@Test
	public void testbetween1And10() {
		int result = mrm.randomBetween1And10();
		assertTrue((result >= 1) && (result <=10));
	}
	
	@Test
	public void testbetween11And20() {
		int result = mrm.randomBetween11And20();
		assertTrue((result >= 11) && (result <=20));
	}
	
	@Test
	public void testbetween21And30() {
		int result = mrm.randomBetween21And30();
		assertTrue((result >= 21) && (result <=30));
	}
	
	@Test
	public void testbetween31And40() {
		int result = mrm.randomBetween31And40();
		assertTrue((result >= 31) && (result <=40));
