package models;

import java.util.Scanner;

public class DanosMateriais {
	
	Scanner scan = new Scanner(System.in);
	
	
	private boolean temDanosMateriais;
	private int escolhaDanosMateriais;
	private int menuDanosMateriais;
	private String textoDanosMateriais;

		{
		System.out.println("Tem pedido de danos materiais? \n"
				+ "1 - Sim \n"
				+ "2 - Não");
		escolhaDanosMateriais = scan.nextInt();
		
		while (escolhaDanosMateriais < 1 || escolhaDanosMateriais > 2) {
			System.out.println("Opção inválida. Tente novamente.");
			System.out.println("Tem pedido de danos materiais? \n"
					+ "1 - Sim \n"
					+ "2 - Não");
			escolhaDanosMateriais = scan.nextInt();
		}
		if (escolhaDanosMateriais == 1){
			temDanosMateriais = true;
		}
		else if (escolhaDanosMateriais == 2) {
			temDanosMateriais = false;
		}
		//escolha do texto danos materiais
		{
		
		if (temDanosMateriais == true) {
		System.out.println("Escolha o modelo a ser utilizado: \n");
		System.out.println("1 - Dano material geral procedente. \n"
				+ "2 - Dano material em geral improcedente (não provado). \n"
				+ "3 - Lucro cessante improcedente (não provado). \n"
				+ "4 - Repetição do indébito simples (memória de cálculo). \n"
				+ "5 - Repetição do indébito simples");
				
				menuDanosMateriais = scan.nextInt();
	
			if(menuDanosMateriais == 1) {
				textoDanosMateriais = "Diante do quadro fático e jurídico, legítima, portanto, a pretensão do consumidor de receber ressarcimento de natureza patrimonial, no valor total de R$ ______________, conforme documentos apresentados (ID Num. _________________________) com correção monetária desde a data do desembolso e com juros de mora desde a citação (_____________ - CC, art. 405 – ID Num. ____________).";
			}
			else if(menuDanosMateriais == 2) {
				textoDanosMateriais = "Contudo, inexistindo prova, especialmente ante a falta de comprovantes _______________, ou outros documentos, ainda que indiciários, do efetivo prejuízo material (danos emergentes e/ou lucros cessantes) suportado pelo consumidor e diretamente vinculado à falha na prestação do serviço (CC, art. 403), não há como acolher o pleito indenizatório.";
			}
			else if(menuDanosMateriais == 3) {
				textoDanosMateriais = "Contudo, rejeito o pedido de lucros cessantes.\n"
						+ "			+ \"Para a configuração dos lucros cessantes, não basta a simples possibilidade de realização do lucro, mas, sim, uma probabilidade objetiva e circunstâncias concretas de que estes teriam se verificado sem a interferência do evento danoso, sempre observado o postulado da razoabilidade, à luz do disposto no art. 402 do Código Civil (“Salvo as exceções expressamente previstas em lei, as perdas e danos devidas ao credor abrangem, além do que ele efetivamente perdeu, o que razoavelmente deixou de lucrar”).\\r\\n\"\r\n"
						+ "			+ \"No âmbito doutrinário, Gustavo Tepedino, Heloísa Helena Barboza e Maria Celina Bodin de Moraes revisitam a matéria ressaltando que o lucro cessante:\\r\\n\"\r\n"
						+ "			+ \"“(...) não se confunde com o lucro imaginário ou simplesmente hipotético. O art. 402 serve-se do princípio da razoabilidade para a quantificação do lucro cessante, de modo que somente pode ser considerado o que razoavelmente se deixou de lucrar. Segundo Agostinho Alvim, a locução indica que, até prova em contrário, deva ser atribuído ao credor o valor que lucraria se os fatos se desenrolassem dentro do seu curso normal, tendo em vista os antecedentes (Da Inexecução, p. 188). (...) Não basta, pois, a simples possibilidade de realização de lucro, mas também não é indispensável a absoluta certeza de que se teria verificado sem a interferência do evento danoso. O que deve existir é uma probabilidade objetiva que resulte do curso normal das coisas e das circunstâncias do caso concreto (Aguiar Dias, Da Responsabilidade, vol. II, pp. 720 e 721)” (Código civil interpretado conforme a constituição da república, v. I, 3. ed. rev. e atual., Rio de Janeiro: Renovar, 2014, p. 733).\n"
						+ "			+ \"Nessa mesma linha é a jurisprudência do Colendo STJ (dentre outros: REsp 1.080.597/SP, REsp 615.203/MS e REsp 846.455/MS).\n"
						+ "			+ \"Em outros dizeres, não é possível acolher o pedido de lucros cessantes, pois as perdas e danos reclamam efetiva comprovação dos prejuízos suportados ou do que razoavelmente deixou de lucrar, ônus do qual o autor não se desincumbiu adequadamente (CC, art. 403 c/c CPC, art. 373, inciso I).";
			}
			else if(menuDanosMateriais == 4) {
				textoDanosMateriais = "Diante do quadro fático e probatório aqui evidenciado, legítima se apresenta a repetição do indébito, em sua forma simples, no tocante aos danos materiais postulados pelo autor, cujos valores serão apurados mediante a técnica processual disciplinada no § 2º do art. 509 e no parágrafo único do art. 786 do CPC c/c o inciso II do art. 52 da Lei. 9.099/1995, mediante a apresentação de memória discriminada do cálculo e extratos pertinentes, atualizados com correção monetária a partir de cada desembolso e, ainda, com juros de mora desde a citação (___________ – ID Num. ___________ - CC, art. 405). \\r\\n\"\r\n"
						+ "			+ \"Ademais, a repetição de indébito dar-se-á na forma simples porque o Colendo STJ, interpretando o art. 42 do CDC, destaca que a repetição em dobro do indébito somente é possível quando demonstrada a má-fé ou culpa grave na conduta do fornecedor, o que, no caso concreto, não foi possível aferir, pois não há elementos de convicção capazes de evidenciar a existência dos mencionados aspectos subjetivos.";
			}
			else if(menuDanosMateriais == 5) {
				textoDanosMateriais = "Diante do quadro fático e jurídico, legítima, portanto, a pretensão do consumidor à repetição do indébito, em sua forma simples, no valor total de R$ ______________, conforme documentos apresentados (ID Num. _________________________) com correção monetária desde a data do desembolso e com juros de mora desde a citação (_____________ - CC, art. 405 – ID Num. ____________).\\r\\n\"\r\n"
						+ "			+ \"Ademais, a repetição de indébito dar-se-á na forma simples porque o Colendo STJ, interpretando o art. 42 do CDC, destaca que a repetição em dobro do indébito somente é possível quando demonstrada a má-fé ou culpa grave na conduta do fornecedor, o que, no caso concreto, não foi possível aferir, pois não há elementos de convicção capazes de evidenciar a existência dos mencionados aspectos subjetivos.";
			}		
	}
}
}

		
		public String getTextoDanosMateriais() {
			return textoDanosMateriais;
		}

}