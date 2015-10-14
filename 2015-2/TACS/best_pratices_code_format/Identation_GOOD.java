package br.com.eagle.vnd.domain;

public class Identation_GOOD {
	
	private Integer fatorial(Integer valor) {
		Integer resultado = 1;
		for (int i = 1; i < valor; i++) {
			resultado *= i;
		}
		return resultado;
	}
}
