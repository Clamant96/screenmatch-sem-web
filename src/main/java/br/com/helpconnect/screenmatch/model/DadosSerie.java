package br.com.helpconnect.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // ignora as propriedades que nao foram passadas no DadosSeries, ou seja, so traz os dados que vc quer
public record DadosSerie(
		@JsonAlias("Title") String titulo, 
		@JsonAlias("totalSeasons") Integer totalTemporadas, 
		@JsonAlias("imdbRating") String avaliacao) {

}
