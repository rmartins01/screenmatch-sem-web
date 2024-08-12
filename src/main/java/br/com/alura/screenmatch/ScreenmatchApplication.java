package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		var api = new ConsumoApi();
		var json = api.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");

//		System.out.println(json);
//		System.out.println(json);
		
		ConverteDados conversor = new ConverteDados();
		
		DadosSerie dadosSerie = conversor.obterDados(json, DadosSerie.class);
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
				
		System.out.println(dadosSerie);
		System.out.println(dadosEpisodio);
	}

}
