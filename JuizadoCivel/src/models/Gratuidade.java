package models;

import java.util.Scanner;

public class Gratuidade {

	
	Scanner scan = new Scanner(System.in);
	
	//atributos da Gratuidade
	
	private boolean temGratuidade;
	private int escolhaGratuidade;
	private int menuGratuidade;
	private String textoGratuidade;

	//existência de danos materiais
		{
		System.out.println("Tem pedido de gratuidade da justiça? \n"
				+ "1 - Sim \n"
				+ "2 - Não");
		escolhaGratuidade = scan.nextInt();
		
		if (escolhaGratuidade == 1){
			temGratuidade = true;
		}
		else if (escolhaGratuidade == 2) {
			temGratuidade = false;
		}
		else {
			System.out.println("Escolha inválida");
		}
		
		//escolha do texto da gratuidade
		{
		
		if (temGratuidade == true) {
		System.out.println("Escolha o modelo de gratuidade: \n");
		System.out.println("1 - Pessoa física\n"
				+ "2 - Pessoa jurídica\n");
				
				menuGratuidade = scan.nextInt();
	
			if(menuGratuidade == 1) {
				textoGratuidade = "Saliente-se que não há interesse processual no requerimento da justiça gratuita nesta fase processual, porquanto “O acesso ao Juizado Especial independerá, em primeiro grau de jurisdição, do pagamento de custas, taxas ou despesas” (Lei 9.099/1995, art. 54).  \r\n"
						+ "De toda sorte, fica o requerente, desde já, ciente e intimado de que, para fazer jus à gratuidade da justiça (CPC, art. 98), deverá no ato da postulação COMPROVAR, nos termos impostos pelo § 2º do art. 99 do CPC, o pressuposto constitucional (“LXXIV - o Estado prestará assistência jurídica integral e gratuita aos que comprovarem insuficiência de recursos”), INDICANDO e COLACIONANDO aos autos os seus recursos financeiros disponíveis (duas últimas declarações do Imposto de Renda, dois últimos contracheques; duas últimas contas de energia elétrica e de água, comprovante de residência etc.) e as suas respectivas despesas, inclusive DESTACANDO e JUSTIFICANDO a razão para a gratuidade, no caso concreto, não poder ser substituída pelo parcelamento das despesas processuais (CPC, § 6º do art. 98) ou “consistir na redução percentual de despesas processuais que o beneficiário tiver de adiantar no curso do procedimento” (CPC, § 5º do art. 98). ";
			}
			else if(menuGratuidade == 2) {
				textoGratuidade = "Saliente-se que não há interesse processual no requerimento da justiça gratuita nesta fase processual, porquanto “O acesso ao Juizado Especial independerá, em primeiro grau de jurisdição, do pagamento de custas, taxas ou despesas” (Lei 9.099/1995, art. 54).  \r\n"
						+ "De toda sorte, fica o requerente, desde já, ciente e intimado de que, para fazer jus à gratuidade da justiça (CPC, art. 98), deverá no ato da postulação COMPROVAR, nos termos impostos pelo § 2º do art. 99 do CPC, o pressuposto constitucional (“LXXIV - o Estado prestará assistência jurídica integral e gratuita aos que comprovarem insuficiência de recursos”), INDICANDO e COLACIONANDO aos autos os seus recursos financeiros disponíveis (duas últimas declarações do Imposto de Renda, notas fiscais e/ou comprovantes de venda, demonstrativos de receitas, declaração de receitas fornecidas por contador, etc.) e as suas respectivas despesas, inclusive DESTACANDO e JUSTIFICANDO a razão para a gratuidade, no caso concreto, não poder ser substituída pelo parcelamento das despesas processuais (CPC, § 6º do art. 98) ou “consistir na redução percentual de despesas processuais que o beneficiário tiver de adiantar no curso do procedimento” (CPC, § 5º do art. 98). ";
			}		
	}
}
}

		public String getTextoGratuidade() {
			return textoGratuidade;
		}

}