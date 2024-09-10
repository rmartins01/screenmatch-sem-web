package br.com.alura.screenmatch.examples;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class ExemploFlatMap {
	
    public static void main(String[] args) {
    	
		/*
		 * O método flatMap é uma operação intermediária que é usada para transformar um
		 * Stream de coleções em um Stream de elementos. Aqui está um exemplo de como o
		 * flatMap é usado
		 */
		List<List<String>> list = 
				List.of(
						List.of("a", "b"),
						List.of("c", "d")
				);

//		List<String> of = List.of("A", "B", "C");
//		List<Integer> of2 = List.of(10, 5, 88, 44);
		
		Stream<String> stream = list.stream().flatMap(Collection::stream);

		stream.forEach(System.out::println);
		
    }
}