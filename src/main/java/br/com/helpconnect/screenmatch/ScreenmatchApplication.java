package br.com.helpconnect.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.helpconnect.screenmatch.model.DadosSerie;
import br.com.helpconnect.screenmatch.service.ConsumoAPI;
import br.com.helpconnect.screenmatch.service.ConverterDados;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		
		System.out.println(json);
		
		// json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
		
		// System.out.println(json);
		
		ConverterDados converter = new ConverterDados();
		DadosSerie dados = converter.obterDados(json, DadosSerie.class);
		
		System.out.println(dados);
		
	}

}
