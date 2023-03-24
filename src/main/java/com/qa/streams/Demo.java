package com.qa.streams;

import java.util.List;

public class Demo {

	public static void main(String[] args) {

		// Given the following List of names, using a stream, have it print "Hello " in
		// front of each name besides "James".
		List<String> names = List.of("Michael", "Dean", "James", "Chris");

		names.stream().filter(name -> !name.equals("James")).forEach(System.out::println);

		// Given the following List of Integers, using a stream, have it reduce and
		// print the product (all numbers multiplied together).
		List<Integer> nums = List.of(3, 4, 7, 8, 12);

		System.out.println(nums.stream().reduce((a, b) -> a * b).get());

		// Starting with a list of numbers, use streams to do the following:

		// Find the max value.
		System.out.println("\nMAX: ");
		System.out.println(nums.stream().reduce((nextNum, biggestSoFar) -> {
			if (nextNum > biggestSoFar)
				return nextNum;
			else
				return biggestSoFar;
		}).get());

		// Find the min value.
		System.out.println("\nMIN: ");
		System.out.println(nums.stream().reduce((nextNum, smallestSoFar) -> {
			if (nextNum < smallestSoFar)
				return nextNum;
			else
				return smallestSoFar;
		}).get());

		// Remove the odd numbers.
		System.out.println("\nREMOVE ODD: ");
		nums.stream().filter(num -> num % 2 == 0).forEach(System.out::println);

		// Remove the even numbers.
		System.out.println("\nREMOVE EVEN: ");
		nums.stream().filter(num -> num % 2 != 0).forEach(System.out::println);

		// Find the sum of the list.
		System.out.println("\nSUM: ");
		System.out.println(nums.stream().reduce((a, b) -> a + b).get());

		// Square every number in the list then remove the even numbers and then find
		// the min value.
		System.out.println("\nMIN ODD SQUARE: ");
		System.out
				.println(nums.stream().map(a -> a * a).filter(num -> num % 2 != 0).reduce((nextNum, smallestSoFar) -> {
					if (nextNum < smallestSoFar)
						return nextNum;
					else
						return smallestSoFar;
				}).get());

	}

}
