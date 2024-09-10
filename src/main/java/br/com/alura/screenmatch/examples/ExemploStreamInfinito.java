package br.com.alura.screenmatch.examples;

import java.util.stream.Stream;

public class ExemploStreamInfinito {

	public static void main(String[] args) {

    	Stream.iterate(15, n -> n + 1)
        .limit(10)
        .forEach(System.out::println);
	}
}