package com.qa.calculator;

public class Runner {

	public static void main(String[] args) {
		// Addition
		Calculator add = (a, b) -> a + b;
		System.out.println(add.calculation(3, 5));

		// Subtraction
		Calculator subtract = (a, b) -> a - b;
		System.out.println(subtract.calculation(10, 4));

		// Multiplication
		Calculator multiply = (a, b) -> a * b;
		System.out.println(multiply.calculation(3, 7));

		// Division
		Calculator divide = (a, b) -> a / b;
		System.out.println(divide.calculation(402, 6));
	}

}
