package models;

import java.util.Scanner;

public class RelacaoJuridica {
	
	Scanner scan = new Scanner(System.in);
	
	//atributos relação jurídica
	
	private int menuRelacaoJuridica;
	private String textoRelacaoJuridica;

	//escolha do texto relação jurídica
		{
			{
		System.out.println("Escolha a relação jurídica: \n");
		System.out.println("1 - Fornecimento de energia elétrica\n"
				+ "2 - Transporte público de passageiros\n"
				+ "3 - Fornecimento de água\n"
				+ "4 - Relação geral de consumo\n"
				+ "5 - Vício do produto ou serviço\n"
				+ "6 - Voo internacional\n"
				+ "7 - Aluguel\n"
				+ "8 - Vinculação da oferta\n"
				+ "9 - Responsabilidade extracontratual civil\n"
				+ "10 - Responsabilidade contratual civil\n"
				+ "11 - Colisão de veículos\n"
				+ "12 - Plano de saúde (autogestão)\n");
				
				menuRelacaoJuridica = scan.nextInt();
	
			if(menuRelacaoJuridica == 1) {
				textoRelacaoJuridica = "A empresa demandada presta serviço público e, portanto, subordina-se ao regime jurídico da responsabilidade civil objetiva, na linha do que firmou o Supremo Tribunal Federal – STF, sob o regime de repercussão geral: “a responsabilidade civil das pessoas jurídicas de direito privado prestadoras de serviço público é objetiva relativamente a terceiros usuários e não-usuários do serviço, segundo decorre do art. 37, § 6º, da Constituição Federal” (RE 591.874, Rel. Min. Ricardo Lewandowski, Tribunal Pleno, DJ 18.12.2009). \r\n"
						+ "Em outras palavras, a responsabilidade civil decorrente da prestação do serviço público de fornecimento de energia elétrica realizado pelo demandado é objetiva e solidária, nos termos da conjugação do art. 37, § 6º, da Constituição Federal - CF e dos arts. 7º, parágrafo único, 14, 17 e 22, todos do Código de Defesa do Consumidor - CDC, sendo atribuído ao fornecedor, prepostos, empregados ou representantes autônomos o dever reparatório quando demonstrado o nexo causal entre o defeito do serviço e o acidente de consumo, do qual somente é passível de isenção quando houver culpa exclusiva do consumidor ou uma das causas excludentes de responsabilidade civil.";
			}
			else if(menuRelacaoJuridica == 2) {
				textoRelacaoJuridica = "A empresa demandada presta serviço público de transporte e, portanto, subordina-se ao regime jurídico da responsabilidade civil objetiva, na linha do que firmou o Supremo Tribunal Federal – STF, sob o regime de repercussão geral: “a responsabilidade civil das pessoas jurídicas de direito privado prestadoras de serviço público é objetiva relativamente a terceiros usuários e não-usuários do serviço, segundo decorre do art. 37, § 6º, da Constituição Federal” (RE 591.874, Rel. Min. Ricardo Lewandowski, Tribunal Pleno, DJ 18.12.2009).\r\n"
						+ "Em outras palavras, a responsabilidade civil decorrente do transporte público é objetiva e solidária, nos termos da conjugação do art. 37, § 6º, da Constituição Federal - CF e dos arts. 7º, parágrafo único, 14, 17 e 22, todos do Código de Defesa do Consumidor - CDC, sendo atribuído ao transportador, prepostos, empregados ou representantes autônomos o dever reparatório quando demonstrado o nexo causal entre o defeito do serviço e o acidente de consumo, do qual somente é passível de isenção quando houver culpa exclusiva do consumidor ou uma das causas excludentes de responsabilidade civil.";
			}
			else if(menuRelacaoJuridica == 3) {
				textoRelacaoJuridica = "A empresa demandada presta serviço público e, portanto, subordina-se ao regime jurídico da responsabilidade civil objetiva, na linha do que firmou o Supremo Tribunal Federal – STF, sob o regime de repercussão geral: “a responsabilidade civil das pessoas jurídicas de direito privado prestadoras de serviço público é objetiva relativamente a terceiros usuários e não-usuários do serviço, segundo decorre do art. 37, § 6º, da Constituição Federal” (RE 591.874, Rel. Min. Ricardo Lewandowski, Tribunal Pleno, DJ 18.12.2009).\r\n"
						+ "Em outras palavras, a responsabilidade civil decorrente da prestação do serviço público de fornecimento de água e coleta de esgotos realizados pelo demandado é objetiva e solidária, nos termos da conjugação do art. 37, § 6º, da Constituição Federal - CF e dos arts. 7º, parágrafo único, 14, 17 e 22, todos do Código de Defesa do Consumidor - CDC, sendo atribuído ao fornecedor, prepostos, empregados ou representantes autônomos o dever reparatório quando demonstrado o nexo causal entre o defeito do serviço e o acidente de consumo, do qual somente é passível de isenção quando houver culpa exclusiva do consumidor ou uma das causas excludentes de responsabilidade civil.";
			}
			else if(menuRelacaoJuridica == 4) {
				textoRelacaoJuridica = "A relação jurídica travada entre as partes subordina-se aos princípios e regras do Código de Defesa do Consumidor (CDC, artigos 2º, 3º, 7º, parágrafo único e 14), notadamente ao regime jurídico da responsabilidade civil objetiva. \r\n"
						+ "Como se sabe, a responsabilidade contratual decorrente da prestação de serviços é objetiva, nos termos do art. 14 do Código de Defesa do Consumidor - CDC, sendo atribuído ao fornecedor o dever reparatório quando demonstrado o nexo causal entre o defeito do serviço e o acidente de consumo, do qual somente é passível de isenção quando houver culpa exclusiva do consumidor ou uma das causas excludentes de responsabilidade civil. ";
			}
			else if(menuRelacaoJuridica == 5) {
				textoRelacaoJuridica = "A relação jurídica travada entre as partes subordina-se aos princípios e regras do Código de Defesa do Consumidor – CDC (CDC, arts. 2º, 3º, 7º, parágrafo único, 18 e 20), notadamente ao regime jurídico da responsabilidade civil objetiva. \r\n"
						+ "Nessa linha, a responsabilidade civil por vício do produto ou do serviço é objetiva, nos termos dos arts. 18 e 20 do Código de Defesa do Consumidor - CDC, naquilo que a doutrina rotula de “vício de qualidade-adequação”, sendo atribuído ao fornecedor o dever reparatório quando demonstrado o nexo causal entre o vício do produto ou serviço e os danos provocados, do qual somente é passível de isenção quando houver prova de uma das causas excludentes de responsabilidade civil. ";
			}
			else if(menuRelacaoJuridica == 6) {
				textoRelacaoJuridica = "A relação jurídica travada entre as partes subordina-se aos princípios e regras de convenções internacionais, e não pelo Código de Defesa do Consumidor, notadamente ao regime jurídico da Convenção de Montreal de 1999 (Decreto nº 5.910/2006), sucessora da Convenção de Varsóvia de 1929 e de Haia de 1955, consoante definiu o Supremo Tribunal Federal em sede de repercussão geral: \r\n"
						+ "“Recurso extraordinário com repercussão geral. 2. Extravio de bagagem. Dano material. Limitação. Antinomia. Convenção de Varsóvia. Código de Defesa do Consumidor. 3. Julgamento de mérito. É aplicável o limite indenizatório estabelecido na Convenção de Varsóvia e demais acordos internacionais subscritos pelo Brasil, em relação às condenações por dano material decorrente de extravio de bagagem, em voos internacionais. 5. Repercussão geral. Tema 210. Fixação da tese: ‘Nos termos do art. 178 da Constituição da República, as normas e os tratados internacionais limitadores da responsabilidade das transportadoras aéreas de passageiros, especialmente as Convenções de Varsóvia e Montreal, têm prevalência em relação ao Código de Defesa do Consumidor’. 6. Caso concreto. Acórdão que aplicou o Código de Defesa do Consumidor. Indenização superior ao limite previsto no art. 22 da Convenção de Varsóvia, com as modificações efetuadas pelos acordos internacionais posteriores. Decisão recorrida reformada, para reduzir o valor da condenação por danos materiais, limitando-o ao patamar estabelecido na legislação internacional. 7. Recurso a que se dá provimento” (RE 636.331/RJ, Tribunal Pleno, Rel. Min. Gilmar Mendes, DJe 10/11/2017). \r\n"
						+ "A responsabilidade decorrente da prestação de serviços de transporte internacional aéreo é objetiva, nos termos do artigo 19, da Convenção de Montreal, sendo o transportador isento de tal responsabilidade quando prova que ele e seus prepostos adotaram todas as medidas que eram razoavelmente necessárias para evitar o dano ocasionado pelo atraso, ou que lhes foi impossível adotar tais medidas. \r\n"
						+ "Por outro lado, a Convenção de Montreal previu ainda os limites de responsabilidade relacionados ao atraso de passageiros, especificando que “1. Em caso de dano causado por atraso no transporte de pessoas, como se especifica no Artigo 19, a responsabilidade do transportador se limita a 4.150 Direitos Especiais de Saque por passageiro” (artigo 22, item 1, da Convenção de Montreal), sendo esta a hipótese dos autos.";
			}
			else if(menuRelacaoJuridica == 7) {
				textoRelacaoJuridica = "A relação jurídica travada entre as partes subordina-se aos princípios e regras do Código Civil – CC e da Lei de Locações (Lei 8.245/1991).";
			}
			else if(menuRelacaoJuridica == 8) {
				textoRelacaoJuridica = "A relação jurídica travada entre as partes se subordina aos princípios e regras do Código de Defesa do Consumidor – CDC (CDC, arts. 2º e 3º), notadamente ao regime jurídico da responsabilidade civil objetiva (CDC, arts. 12 a 17), da oferta (CDC, arts. 30 a 35), da publicidade (CDC, arts. 36 a 38) e da proteção contratual (CDC, arts. 46 a 54). \r\n"
						+ "O princípio da vinculação da oferta reflete a imposição da transparência e da boa-fé nos métodos comerciais, na publicidade e nos contratos, nos termos do art. 30 do CDC (“Toda informação ou publicidade, suficientemente precisa, veiculada por qualquer forma ou meio de comunicação com relação a produtos e serviços oferecidos ou apresentados, obriga o fornecedor que a fizer veicular ou dela se utilizar e integra o contrato que vier a ser celebrado”). \r\n"
						+ "É inequívoco o caráter vinculativo da oferta, integrando o contrato, de modo que o fornecedor de produtos ou serviços se responsabiliza também pelas expectativas que a publicidade venha a despertar no consumidor, mormente quando veicula informação de produto ou serviço com a chancela de determinada característica ou marca, sendo a materialização do princípio da boa-fé objetiva, exigindo do anunciante os deveres anexos de lealdade, confiança, cooperação, proteção e informação, sob pena de responsabilidade civil. \r\n"
						+ "Em outras palavras, o Código de Defesa do Consumidor responsabiliza objetivamente o fornecedor do produto ou serviço que veicula publicidade enganosa, ou seja, basta que a informação publicitária seja falsa, inteira ou parcialmente, ou omita dados importantes, induzindo o consumidor ao erro para que se configure ato ilícito. ";
			}
			else if(menuRelacaoJuridica == 9) {
				textoRelacaoJuridica = "Cabe ressaltar que se trata de relação albergada pelo instituto da responsabilidade extracontratual ou aquiliana, nos exatos termos do art. 927, caput, c/c art. 186 do Código Civil - CC.\r\n"
						+ "A responsabilidade subjetiva consiste no dever imposto a alguém de indenizar outrem, por ter agido, o primeiro, de modo a confrontar o ordenamento jurídico – agir este que pode ser doloso ou culposo – causando, ao segundo, um dano material (danos emergentes e lucros cessantes) ou extrapatrimonial (dano moral e estético).";
			}
			else if(menuRelacaoJuridica == 10) {
				textoRelacaoJuridica = "Cabe ressaltar que se trata de relação albergada pelo instituto da responsabilidade contratual, nos exatos termos do art. 389 c/c art. 186 do Código Civil - CC. \r\n"
						+ "A responsabilidade contratual, ordinariamente, consiste no dever imposto ao contratante inadimplente de indenizar o outro contratante, por ter agido, o primeiro, de modo a confrontar o negócio jurídico pactuado – agir este que pode ser doloso ou culposo – causando, ao segundo, um dano material (danos emergentes e lucros cessantes) ou extrapatrimonial (dano moral e estético). ";
			}
			else if(menuRelacaoJuridica == 11) {
				textoRelacaoJuridica = "A relação jurídica travada entre as partes subordina-se aos princípios e regras do Código Civil – CC e do Código de Trânsito Brasileiro (Lei nº 9.503/1997).";
			}
			else if(menuRelacaoJuridica == 12) {
				textoRelacaoJuridica = "Cabe ressaltar que se trata de relação albergada pelo instituto da responsabilidade contratual, nos exatos termos do art. 389 c/c art. 186 do Código Civil – CC, bem assim observando-se a Súmula 608 do STJ: “Aplica-se o Código de Defesa do Consumidor aos contratos de plano de saúde, salvo os administrados por entidades de autogestão”.";
			}
	}
}
		public String getTextoRelacaoJuridica() {
			return textoRelacaoJuridica;
		}

}
