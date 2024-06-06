package br.com.helpconnect.screenmatch.service;

public interface IConverterDados {
	// <T> T -> informado que o retorno vc nao sabe qual é
	// Class<T> classe -> informa o tipo de retorno que vc quer do JSON, como vc nao sabe pois ele é dinamico
	// vc retona nesse formato
	public <T> T obterDados(String json, Class<T> classe);
}
