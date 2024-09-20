package models;

import java.util.Scanner;

public class Solidariedade {

	Scanner scan = new Scanner(System.in);
	
	//atributos teoria finalista
	
	private int menuSolidariedade;
	private String textoSolidariedade;

	//escolha do texto teoria finalista
		{
			{
		System.out.println("É hipótese de solidariedade em relação de consumo?\n");
		System.out.println("1 - Sim\n"
				+ "2 - Não\n");
				menuSolidariedade = scan.nextInt();
	
			if(menuSolidariedade == 1) {
				textoSolidariedade = "No contexto consumerista, o campo de incidência da responsabilidade civil ampliou-se, pois passou a atingir não apenas o fornecedor diretamente ligado ao evento danoso, mas toda a cadeia envolvida direta e indiretamente na atividade de risco prestada, tal como ocorreu no caso concreto. Ainda que cada fornecedor tenha uma maior ou menor participação nos eventos que deram causa aos danos reivindicados, por opção legislativa, o consumidor tem a faculdade de escolher os fornecedores solidários que irão integrar o polo passivo da ação, conforme sua comodidade e/ou conveniência, cabendo aos que se sentirem prejudicados ingressarem com as respectivas ações regressivas.";
			}
			else {
				textoSolidariedade = "";
			}
	}
}
		public String getTextoSolidariedade() {
			return textoSolidariedade;
		}

}