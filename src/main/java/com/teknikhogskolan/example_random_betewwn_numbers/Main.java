package com.teknikhogskolan.example_random_betewwn_numbers;

public class Main {

	public static void main(String[] args) {
		MyRandomMethods mrm = new MyRandomMethods();
		
		for (int i = 0; i < 30; i++) {
			System.out.println(mrm.randomBetween1And10() +", ");
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.println(mrm.randomBetween11And20() +", ");
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.println(mrm.randomBetween21And30() +", ");
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.println(mrm.randomBetween31And40() +", ");
		}
		System.out.println("");
		for (int i = 0; i < 30; i++) {
			System.out.println(mrm.randomBetween41And50() +", ");
		}
}
}
