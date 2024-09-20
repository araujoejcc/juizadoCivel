package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Preliminares {
	
Scanner scan = new Scanner(System.in);
		
	private boolean temPreliminares;
	private int escolhaPreliminares;
	private int menuPreliminares;
	private List <String> textoPreliminares = new ArrayList<>(); 
	
	
	//existência de preliminares
		{
		System.out.println("Tem preliminares/Prejudiciais? \n"
				+ "1 - Sim \n"
				+ "2 - Não");
		escolhaPreliminares = scan.nextInt();
		
		while (escolhaPreliminares < 1 || escolhaPreliminares > 2) {
			System.out.println("Opção inválida. Tente novamente.");
			System.out.println("Tem preliminares/Prejudiciais? \n"
					+ "1 - Sim \n"
					+ "2 - Não");
			escolhaPreliminares = scan.nextInt();
		}
		if (escolhaPreliminares == 1){
			temPreliminares = true;
		}
		else if (escolhaPreliminares == 2) {
			temPreliminares = false;
		}
		{
			if (temPreliminares == true) {

				System.out.println("Escolha o modelo a ser utilizado: \n");
				System.out.println("1 - Incompetência Perícia.");
				menuPreliminares = scan.nextInt();
				
				if (menuPreliminares == 1) {
					textoPreliminares.add(
							"REJEITO a preliminar de incompetência pela necessidade de perícia, pois, segundo o ENUNCIADO 54 do FONAJE: “A menor complexidade da causa para a fixação da competência é aferida pelo objeto da prova e não em face do direito material.\n");
				}
			}
			}
		}
//	private String incompetenciaTerritorial = "REJEITO a preliminar de incompetência territorial, porquanto nas ações de natureza consumerista e indenização dela decorrente, a regra de competência territorial nos Juizados Especiais Cíveis é flexível, de modo que caberá ao autor escolher o foro de domicílio do réu (artigo 4º, inciso I da Lei 9.099/95), do autor (hipossuficiência jurídica manifesta) ou até mesmo do local onde a obrigação deva ser satisfeita (art. 4º, inciso II da Lei nº 9.099/95).";
//	private String incompetenciaCrime = "REJEITO a preliminar de incompetência para julgar fato criminoso, dada a independência existente entre a responsabilidade civil e a criminal, bem assim somente na hipótese de a sentença penal absolutória fundamentar-se na inexistência do fato ou na negativa de autoria estaria impedida a discussão no juízo cível.";
//	private String carenciaAcao = "REJEITO a preliminar de carência de ação, porquanto as condições da ação devem ser aferidas tomando como pressuposto, provisoriamente, apenas em juízo de admissibilidade da demanda, as próprias afirmações ou alegações contidas na petição inicial, dispensando-se qualquer atividade probatória.";
//	private String faltaInteresse = "REJEITO a preliminar de falta de interesse de agir, porquanto as condições da ação devem ser aferidas tomando como pressuposto, provisoriamente, apenas em juízo de admissibilidade da demanda, as próprias afirmações ou alegações contidas na petição inicial, dispensando-se qualquer atividade probatória.";
//	private String ilegitimidade = "REJEITO a preliminar de ilegitimidade, porquanto as condições da ação devem ser aferidas tomando como pressuposto, provisoriamente, apenas em juízo de admissibilidade da demanda, as próprias afirmações ou alegações contidas na petição inicial, dispensando-se qualquer atividade probatória.";
//	private String inepcia = "REJEITO a preliminar de inépcia arguida, uma vez que houve a narrativa dos fatos e foi devidamente delimitado o pedido autoral, permitindo a compreensão do conflito e o exercício do contraditório e da ampla defesa.";
//	private String decadencia = "REJEITO a preliminar de decadência arguida, uma vez que a pretensão deduzida pelo consumidor em juízo - devolução das quantias pagas e indenização - está sujeita às regras de prescrição do CDC (CDC, art. 27).";
//	private String coisaJulgada = "REJEITO a preliminar de coisa julgada, uma vez que não se trata de ação idêntica às apontadas pelo réu (___________________ e _______________________), pois não há entre os processos identidade ou conexão em relação à pretensão de reparação.";
//	private String intervencaoTerceiros = "REJEITO o pedido de segredo de justiça, uma vez que o caso concreto, não revela nenhuma das hipóteses de sigilo previstas pela Lei adjetiva civil.";
//	private String segredoJustica = "REJEITO o pedido de segredo de justiça, uma vez que o caso concreto, não revela nenhuma das hipóteses de sigilo previstas pela Lei adjetiva civil.";
//	private String prescricaoTrienal = "REJEITO a prejudicial de prescrição trienal arguida, uma vez que a pretensão deduzida pelo consumidor em juízo - devolução das quantias pagas e indenização - está sujeita às regras de prescrição quinquenal do CDC (CDC, art. 27).";
		public List<String> getTextoPreliminares() {
			return textoPreliminares;
		}
	
}