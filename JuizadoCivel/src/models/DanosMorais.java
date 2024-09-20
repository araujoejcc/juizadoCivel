package models;

import java.util.Scanner;

public class DanosMorais {
	
	Scanner scan = new Scanner(System.in);
	
	//atributos dos Danos Morais
	
	private boolean temDanosMorais;
	private int escolhaDanosMorais;
	private int menuDanosMorais;
	private String textoDanosMorais;

	//existência de danos morais
		{
		System.out.println("Tem pedido de danos morais? \n"
				+ "1 - Sim \n"
				+ "2 - Não");
		escolhaDanosMorais = scan.nextInt();
		
		while (escolhaDanosMorais < 1 || escolhaDanosMorais > 2) {
			System.out.println("Opção inválida. Tente novamente.");
			System.out.println("Tem pedido de danos morais? \n"
					+ "1 - Sim \n"
					+ "2 - Não");
			escolhaDanosMorais = scan.nextInt();
		}
		if (escolhaDanosMorais == 1){
			temDanosMorais = true;
		}
		else if (escolhaDanosMorais == 2) {
			temDanosMorais = false;
		}
		else {
			System.out.println("Escolha inválida");
		}
		
		//escolha do texto danos morais
		{
		
		if (temDanosMorais == true) {
		System.out.println("Escolha o modelo a ser utilizado: \n");
		System.out.println("1 - Dano moral improcedente (mero dissabor). \n"
				+ "2 - Dano moral improcedente (cobrança sem inscrição). \n"
				+ "3 - Dano moral procedente (perda do tempo útil). \n"
				+ "4 - Dano moral procedente (cadeia geral de eventos). \n"
				+ "5 - Dano moral procedente (corte de serviço essencial) \n"
				+ "6 - Dano moral procedente (inscrição indevida)\n"
				+ "7 - Dano moral improcedente (inscrição anterior)\n"
				+ "8 - Dano moral procedente (desconto em contracheque/conta\n");
				
				menuDanosMorais = scan.nextInt();
	
			if(menuDanosMorais == 1) {
				textoDanosMorais = "Contudo, não se mostra pertinente o pleito de dano moral. \r\n"
						+ "O simples descumprimento de dever legal ou contratual, por caracterizar mero aborrecimento, em princípio, não configura dano moral, salvo se da infração (legal ou contratual) advém circunstância que atente ou viole os atributos do direito da personalidade (CC, art. 12). \r\n"
						+ "Tal exegese, na verdade, segue a diretriz da jurisprudência consolidada do Superior Tribunal de Justiça - STJ, o qual sempre destacou que salvo circunstância excepcional que coloque a parte em situação de extraordinária angústia ou humilhação, não há dano moral, pois o dissabor inerente à expectativa frustrada decorrente de inadimplemento contratual ou legal se insere no cotidiano das relações e não implica, por si só, lesão à honra ou violação da dignidade da pessoa humana. \r\n"
						+ "Embora não desejável, destaque-se, e capaz sim de provocar aborrecimento, irritação, dissabor e até contratempos, o fato alegado pelo autor não tem o condão, isolado e exclusivamente, de provocar o dano moral postulado, tal como orienta o Egrégio STJ. \r\n"
						+ "Numa breve síntese, o descumprimento do dever contratual ou legal, não imprime, por si só, qualquer atentado contra os atributos do direito da personalidade do consumidor (nome, honra, saúde, integridade física etc.), razão pela qual descabe a pretensão indenizatória perseguida.";
			}
			else if(menuDanosMorais == 2) {
				textoDanosMorais = "De outro lado, não se mostra pertinente o pleito de dano moral, na linha do enunciado da súmula 169 do TJPE: “Não configura dano moral a mera cobrança indevida ao consumidor, sem a efetiva inscrição em cadastro restritivo de crédito, desde que inexista má-fé”.\r\n"
						+ "O simples descumprimento de dever legal ou contratual, por caracterizar mero aborrecimento, em princípio, não configura dano moral, salvo se da infração (legal ou contratual) advém circunstância que atente ou viole os atributos do direito da personalidade (CC, art. 12).\r\n"
						+ "Tal exegese, na verdade, segue a diretriz da jurisprudência consolidada do Superior Tribunal de Justiça - STJ, o qual sempre destacou que salvo circunstância excepcional que coloque a parte em situação de extraordinária angústia ou humilhação, não há dano moral, pois o dissabor inerente à expectativa frustrada decorrente de inadimplemento contratual ou legal se insere no cotidiano das relações e não implica, por si só, lesão à honra ou violação da dignidade da pessoa humana.\r\n"
						+ "Embora não desejável, destaque-se, e capaz sim de provocar aborrecimento, irritação, dissabor e até contratempos, o fato alegado pelo autor não tem o condão, isolado e exclusivamente, de provocar o dano moral postulado, tal como orienta o Egrégio STJ.\r\n"
						+ "Numa breve síntese, o descumprimento do dever contratual ou legal, não imprime, por si só, qualquer atentado contra os atributos do direito da personalidade do consumidor (nome, honra, saúde, integridade física etc.), razão pela qual descabe a pretensão indenizatória perseguida.";
			}
			else if(menuDanosMorais == 3) {
				textoDanosMorais = "Diante do quadro fático e probatório aqui evidenciado, o conflito atrai a incidência da “teoria do desvio produtivo do consumidor”, também denominada de “teoria da perda de tempo útil do consumidor”, tendo em vista que o demandante foi privado de tempo relevante para dedicar-se ao exercício de atividades que melhor lhe aprouvesse, submetendo-se, em função do episódio em cotejo, a intermináveis percalços para a solução de problemas oriundos da má prestação do serviço (STJ, dentre outros: Resp. 1.634.851/RJ), configurando assim dano indenizável que não merece passar impune (CDC, art. 6º, inciso VI c/c CC, arts. 186 e 927). \r\n"
						+ "Inexistindo critérios objetivos para a fixação da indenização por dano moral, cabe ao Poder Judiciário arbitrar uma quantia que seja compatível com (1) a reprovabilidade da conduta ilícita, (2) a intensidade e duração do sofrimento experimentado pela vítima, (3) a capacidade econômica do causador do dano, bem como (4) as condições sociais e econômicas do ofendido, sem prejuízo de outras circunstâncias mais que se fizerem presentes. \r\n"
						+ "Considerando, pois, as circunstâncias acima descritas, fixo os danos morais no valor de R$ ______________ (______________), que entendo como adequado ao caso em apreço, de modo a atender o postulado da proporcionalidade, sem promover ou estimular o enriquecimento sem causa.";
			}
			else if(menuDanosMorais == 4) {
				textoDanosMorais = "Por outro lado, diante do quadro fático e probatório aqui evidenciado, é nítido que toda a cadeia de eventos relatada pela parte autora e demonstrada nos autos, trouxe aflição e angústia ao demandante, de modo a interferir seriamente no seu equilíbrio e bem-estar, o que foge à normalidade do aborrecimento corriqueiro do dia a dia, e é capaz de agredir os atributos do direito de personalidade (CC, art. 12 c/c CDC, art. 6º, inciso VI), a ponto de legitimar uma indenização a título de dano moral. \r\n"
						+ "Em outras palavras, a falha na prestação do serviço, no caso concreto, teve a inegável capacidade lesiva de promover uma perturbação psíquico-emocional na autora, caracterizando o que a doutrina e a jurisprudência rotulam de dano moral “in re ipsa”. \r\n"
						+ "Inexistindo critérios objetivos para a fixação da indenização por dano moral, cabe ao Poder Judiciário arbitrar uma quantia que seja compatível com (1) a reprovabilidade da conduta ilícita, (2) a intensidade e duração do sofrimento experimentado pela vítima, (3) a capacidade econômica do causador do dano, bem como (4) as condições sociais e econômicas do ofendido, sem prejuízo de outras circunstâncias mais que se fizerem presentes. \r\n"
						+ "Considerando, pois, as circunstâncias acima descritas, fixo os danos morais no valor de R$ ________________ (___________________), que entendo como adequado ao caso em apreço, de modo a atender o postulado da proporcionalidade, sem promover ou estimular o enriquecimento sem causa do autor.";
			}
			else if(menuDanosMorais == 5) {
				textoDanosMorais = "Por outro lado, diante do quadro fático e probatório aqui evidenciado, é nítido que a manutenção da suspensão do fornecimento de serviço essencial por débito indevido, foi capaz de trazer aflição e angústia ao autor, de modo a interferir seriamente no seu equilíbrio e bem-estar, o que foge à normalidade do aborrecimento corriqueiro do dia a dia, e agredir os atributos do direito de personalidade (CC, art. 12 c/c CDC, art. 6º, inciso VI), a ponto de legitimar uma indenização a título de dano moral.\r\n"
						+ "Em outras palavras, a falha na prestação do serviço, no caso concreto, teve a inegável capacidade lesiva de promover uma perturbação psíquico-emocional na autora, caracterizando o que a doutrina e a jurisprudência rotulam de dano moral “in re ipsa”.\r\n"
						+ "Inexistindo critérios objetivos para a fixação da indenização por dano moral, cabe ao Poder Judiciário arbitrar uma quantia que seja compatível com (1) a reprovabilidade da conduta ilícita, (2) a intensidade e duração do sofrimento experimentado pela vítima, (3) a capacidade econômica do causador do dano, bem como (4) as condições sociais e econômicas do ofendido, sem prejuízo de outras circunstâncias mais que se fizerem presentes.\r\n"
						+ "Considerando, pois, as circunstâncias acima descritas, fixo os danos morais no valor de R$ ________________ (_______________), que entendo como adequado ao caso em apreço, de modo a atender o postulado da proporcionalidade, sem promover ou estimular o enriquecimento sem causa do autor.";
			}
			else if(menuDanosMorais == 6) {
				textoDanosMorais = "Diante do quadro fático e probatório aqui evidenciado, é nítido que a inclusão indevida do nome do demandante nos “Bancos de Dados e Cadastro de Consumidores trouxe aflição e angústia ao autor, de modo a interferir seriamente no seu equilíbrio e bem-estar, o que foge à normalidade do aborrecimento corriqueiro do dia a dia, e é capaz de agredir os atributos do direito de personalidade (CC, art. 12 c/c CDC, art. 6º, inciso VI), a ponto de legitimar uma indenização a título de dano moral.\r\n"
						+ "Em outras palavras, a falha na prestação do serviço, no caso concreto, teve a inegável capacidade lesiva de promover uma perturbação psíquico-emocional no autor, caracterizando o que a doutrina e a jurisprudência rotulam de dano moral “in re ipsa”.\r\n"
						+ "Inexistindo critérios objetivos para a fixação da indenização por dano moral, cabe ao Poder Judiciário arbitrar uma quantia que seja compatível com (1) a reprovabilidade da conduta ilícita, (2) a intensidade e duração do sofrimento experimentado pela vítima, (3) a capacidade econômica do causador do dano, bem como (4) as condições sociais e econômicas do ofendido, sem prejuízo de outras circunstâncias mais que se fizerem presentes.\r\n"
						+ "Considerando, pois, as circunstâncias acima descritas, bem assim o valor atribuído ao pedido, fixo os danos morais no valor de R$ __________________ (____________), que entendo como adequado ao caso em apreço, de modo a atender o postulado da proporcionalidade, sem promover ou estimular o enriquecimento sem causa.";
			}
			else if(menuDanosMorais == 7) {
				textoDanosMorais = "De outro lado, é nítido que a inscrição do nome do consumidor nos órgãos de restrição ao crédito foi capaz de trazer aflição e angústia ao autor, de modo a interferir seriamente no seu equilíbrio e bem-estar, o que foge à normalidade do aborrecimento corriqueiro do dia a dia, e agredir os atributos do direito de personalidade (CC, art. 12 c/c CDC, art. 6º, inciso VI), a ponto de legitimar uma indenização a título de dano moral.\r\n"
						+ "Em outras palavras, a falha na prestação do serviço, no caso concreto, teve a inegável capacidade lesiva de promover uma perturbação psíquico-emocional no autor, caracterizando o que a doutrina e a jurisprudência rotulam de dano moral “in re ipsa”.\r\n"
						+ "Contudo, o autor possui anotação prévia nos órgãos de restrição ao crédito, ressaltando-se o fato que inexiste qualquer demonstração, ainda que indiciária, acerca de eventual questionamento judicial, questionamento ou declaração de invalidade, razão pela qual, segundo a jurisprudência do Colendo STJ: “Da anotação irregular em cadastro de proteção ao crédito, não cabe indenização por dano moral, quando preexistente legítima inscrição, ressalvado o direito ao cancelamento” (Súmula 385).";
			}
			else if(menuDanosMorais == 8) {
				textoDanosMorais = "Diante do quadro fático e probatório aqui evidenciado, é nítido que a realização de descontos indevidos na conta corrente/contracheque da parte, comprometendo sua capacidade financeira de arcar com outros compromissos, trouxe aflição e angústia ao autor, de modo a interferir seriamente no seu equilíbrio e bem-estar, o que foge à normalidade do aborrecimento corriqueiro do dia a dia, e é capaz de agredir os atributos do direito de personalidade (CC, art. 12 c/c CDC, art. 6º, inciso VI), a ponto de legitimar uma indenização a título de dano moral.\r\n"
						+ "Em outras palavras, a falha na prestação do serviço, no caso concreto, teve a inegável capacidade lesiva de promover uma perturbação psíquico-emocional no autor, caracterizando o que a doutrina e a jurisprudência rotulam de dano moral “in re ipsa”.\r\n"
						+ "Inexistindo critérios objetivos para a fixação da indenização por dano moral, cabe ao Poder Judiciário arbitrar uma quantia que seja compatível com (1) a reprovabilidade da conduta ilícita, (2) a intensidade e duração do sofrimento experimentado pela vítima, (3) a capacidade econômica do causador do dano, bem como (4) as condições sociais e econômicas do ofendido, sem prejuízo de outras circunstâncias mais que se fizerem presentes.\r\n"
						+ "Considerando, pois, as circunstâncias acima descritas, bem assim o valor atribuído ao pedido, fixo os danos morais no valor de R$ __________________ (____________), que entendo como adequado ao caso em apreço, de modo a atender o postulado da proporcionalidade, sem promover ou estimular o enriquecimento sem causa.";
			}
	}
}
}
		public String getTextoDanosMorais() {
			return textoDanosMorais;
		}

}