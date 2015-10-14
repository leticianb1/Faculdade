package VerticalDistance;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SetVariable {
	// Deve-se declarar as instâncias de variáveis no início da classe
	private String nickname;
	private String name;
	
	// Declare as variáveis o mais próximo possível de onde serão usadas
	@SuppressWarnings("unused")
	private static void readPreferences(String file) {
		InputStream is= null; // Declaração o quanto antes
		try {
			is= new FileInputStream(file);
		} catch (IOException e) {
			try {
				if (is != null)
				is.close();
			} catch (IOException e1) {
			}
		}
	}

	// Declare variáveis de controle para loops dentro da estrutura da iteração
	private int count(int min, int max) {
		int count= 0;
		for (int iterator = min; iterator <= max; iterator++) { // Declarando a variável iterator na estrutura de controle
			count += iterator;
		}
		return count;
	}

	// Em raros casos pode-se declarar uma variável no início de um bloco ou logo depois de um loop em uma função razoavelmente longa
	public void loop(List<String> itens) {
		for(String item : itens) {
			StringBuilder string = new StringBuilder("ITEM: ").append(item); // Declarando no início do loop
			System.out.println(string.toString());
		}
	}
	
	// Se uma função chama a outra, elas devem ficar verticalmente próximas, a que chamar deve ficar em cima da que for chamada
	public String getCountFromName() {
		String name = getName(); // Método logo abaixo
		int count = count(10,20);
		StringBuilder countFromName = new StringBuilder(name).append(count);
		return countFromName.toString();
	}
	
	public String getName() {
		return name;
	}
	
	// Se blocos de código possuem afinidade conceitual, como por exemplo utilizarem de uma mesma assinatura, estes devem ficar
	// próximos.
	public String getNicknameFormatted() {
		return getNicknameFormatted(nickname);
	}
	
	public static String getNicknameFormatted(String nickname) {
		StringBuilder nicknameFormatted = new StringBuilder("Nickname: ").append(nickname);
		return nicknameFormatted.toString();
	}
}
