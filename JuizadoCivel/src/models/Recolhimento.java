package models;

import java.util.Scanner;

public class Recolhimento {
	
Scanner scan = new Scanner(System.in);
	
	//atributos do Recolhimento de produto
	
	private boolean temRecolhimento;
	private int escolhaRecolhimento;
	private String textoRecolhimento;

	//existência de danos materiais
		{
		System.out.println("Há necessidade de recolhimento de produto? \n"
				+ "1 - Sim \n"
				+ "2 - Não");
		escolhaRecolhimento = scan.nextInt();
		
		if (escolhaRecolhimento == 1){
			temRecolhimento = true;
		}
		else if (escolhaRecolhimento == 2) {
			temRecolhimento = false;
		}
		else {
			System.out.println("Escolha inválida");
		}
		
		//informação do Recolhimento
		{
		
		if (temRecolhimento == true) {
		textoRecolhimento = "Fica facultado ao(s) fornecedor(s) recolher(em) o(s) produto(s) defeituoso(s), caso já não o tenha(m) feito, sem ônus para o(s) demandante(s), no prazo de 30 (trinta) dias, a contar do efetivo cumprimento da presente decisão, comunicando a este juízo e ao consumidor-demandante, antecipadamente, dia e horário, bem assim os eventuais responsáveis pela execução da remoção, cuja inércia ou inobservância será interpretada como abandono (CC, art. 1.275, inciso III).";
		}
		else {
		textoRecolhimento = "";
		}
}
}
		public String getTextoRecolhimento() {
			return textoRecolhimento;
		}


}
