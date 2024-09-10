package br.com.alura.screenmatch.examples;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

import br.com.alura.screenmatch.model.Aluno;

public class ExemploSummaryStatistics {
	
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Alice", LocalDate.of(2002, 10, 20)),
                new Aluno("Bob", LocalDate.of(1980, 8, 9)),
                new Aluno("Carlos", LocalDate.of(2001, 01, 28)),
                new Aluno("David", LocalDate.of(2003, 05, 12)),
                new Aluno("Eva", LocalDate.of(2005, 12, 03))
        );

        IntSummaryStatistics stats = alunos.stream()
                .mapToInt(Aluno::getIdade)
                .summaryStatistics();

        // Exibindo as estatísticas
        System.out.println("Idade média: " + stats.getAverage());
        System.out.println("Mínima idade: " + stats.getMin());
        System.out.println("Máxima idade: " + stats.getMax());
        System.out.println("Soma: " + stats.getSum());
        System.out.println("Total de alunos: " + stats.getCount());
    }
}