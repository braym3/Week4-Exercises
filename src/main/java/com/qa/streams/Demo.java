package com.qa.streams;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		// Given the following List of names, using a stream, have it print "Hello " in
		// front of each name besides "James".
		List<String> names = Arrays.asList("Michael", "Dean", "James", "Chris");

		names.stream().filter(name -> !name.equals("James")).forEach(System.out::println);
	}

}
