package com.functional.interfaces;

import java.util.function.Consumer;

class Movie {
	String name;

	public Movie(String name) {
		this.name = name;
	}

}

public class ConsumerChaining {

	public static void main(String[] args) {
		Consumer<Movie> c1 = m -> System.out.println(m.name + " released");
		Consumer<Movie> c2 = m -> System.out.println(m.name + " no openrings");
		Consumer<Movie> c3 = m -> System.out.println(m.name + "  storing in database");
		// you can either call this way or use the last two lines to call all 3
		// Consumers.
		c1.andThen(c2).andThen(c3).accept(new Movie("Pokiri"));

		// Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
		// cc.accept(new Movie("Bahubali"));
	}

}
