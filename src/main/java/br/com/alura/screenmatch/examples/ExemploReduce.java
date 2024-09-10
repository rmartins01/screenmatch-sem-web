package br.com.alura.screenmatch.examples;

import java.util.List;
import java.util.Optional;

public class ExemploReduce {

	public static void main(String[] args) {

		/*
		 * Stream.reduce() é uma operação terminal que é utilizada para reduzir o
		 * conteúdo de um Stream para um único valor
		 */
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		Optional<Integer> result = numbers.stream().reduce(Integer::sum);
		result.ifPresent(System.out::println); // prints 15
	}
}