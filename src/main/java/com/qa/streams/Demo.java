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

	}

}
