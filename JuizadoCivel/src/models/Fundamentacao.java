package models;

import java.util.Scanner;

public class Fundamentacao {

	Scanner scan = new Scanner(System.in);
	
	//atributos fundamentação
	
	private int menuFundamentacao;
	private String textoFundamentacao;

	//escolha do texto fundamentação
		{
			{
		System.out.println("Escolha a fundamentação: \n");
		System.out.println("1 - Falha na prestação do serviço (procedente) \n"
				+ "2 - Falha na prestação do serviço (improcedente)\n"
				+ "3 - Vício de produto (procedente)\n"
				+ "4 - Vício de produto (procedente - oxidação)\n"
				+ "5 - Vício de produto (improcedente - não oportuniza reparo)\n"
				+ "6 - Dever de informação (procedente)\n"
				+ "7 - Dever de informação (improcedente)\n"
				+ "8 - Vinculação da oferta (procedente)\n"
				+ "9 - Vinculação da oferta (improcedente)\n"
				+ "10 - Cobrança por estimativa de carga (procedente/repetitivo)\n"
				+ "11 - Extravio/dano bagagem voo internacional (procedente)\n"
				+ "12 - Atraso/cancelamento voo internacional (procedente)\n"
				+ "13 - Colisão (improcedente - dinâmica não comprovada)\n"
				+ "14 - Autor não comprova fatos mínimos (improcedente)\n"
				+ "15 - Tarifas bancárias (repetitivo)\n"
				+ "16 - Extinção (necessidade de perícia)\n"
				+ "17 - Fraude (improcedente - culpa exclusiva do autor)\n"
				+ "18 - Contratação mediante fraude (procedente)\n"
				+ "19 - Contratação efetiva (improcedente)\n");
				
				menuFundamentacao = scan.nextInt();
	
			if(menuFundamentacao == 1) {
				textoFundamentacao = "Assim, para impedir o êxito da presente demanda indenizatória, caberia ao demandado provar as excludentes de responsabilidade civil, ou seja: (1) que, tendo prestado o serviço, o defeito alegado inexistiu; (2) culpa exclusiva do autor ou de terceiro; ou (3) a ocorrência do denominado “fortuito externo”, ônus probatório este, todavia, do qual não se desincumbiu. \r\n"
						+ "De outro lado, para o sucesso da demanda de que se cuida, caberia ao autor demonstrar tão somente os danos postulados e a relação de causalidade entre eles e o serviço defeituoso realizado. Com efeito, as alegações do consumidor (ID ________________), além de ser verossímil, segundo as regras ordinárias de experiência e pela observação do que ordinariamente acontece (CDC, art. 6º, inciso VIII, c/c CPC, art. 375), acabou sendo evidenciada, nos autos, no momento em que o fornecedor defendeu a licitude de sua atuação, sem, contudo, acostar documentos e/ou outros meios de provas capazes de corroborar com suas alegações e, desse modo, afastar os fatos e provas trazidos pelo autor, o que, em outras palavras, demonstra a existência de falha na prestação do serviço. Ora, sendo induvidosa a (i) a falha na prestação do serviço, bem assim a (ii) presença de um liame de causa e efeito entre a deficiência do serviço ofertado pelo demandado e os danos reivindicados pelo demandante, não há como negar a caracterização, em tese, da responsabilidade civil.";
			}
			else if(menuFundamentacao == 2) {
				textoFundamentacao = "Assim, para impedir o êxito da presente demanda indenizatória, caberia ao demandado provar as excludentes de responsabilidade civil, ou seja: (1) que, tendo prestado o serviço, o defeito alegado inexistiu; (2) culpa exclusiva do autor ou de terceiro; ou (3) a ocorrência do denominado “fortuito externo”. \r\n"
						+ "De outro lado, para o sucesso da demanda de que se cuida, caberia ao autor demonstrar tão somente os danos postulados e a relação de causalidade entre eles e o serviço defeituoso realizado. \r\n"
						+ "Os elementos probatórios trazidos aos autos revelam que não houve falha na prestação de serviços por parte da demandada.  \r\n"
						+ "Na linha do disposto no art. 373 do CPC, os fatos constitutivos são os fatos afirmados na petição inicial pelo autor, cabendo a ele prová-los.  \r\n"
						+ "Em contrapartida, ao réu cabe provar a existência de fatos impeditivos, modificativos ou extintivos do direito do autor.  \r\n"
						+ "O ônus da prova é, portanto, o encargo, atribuído pela lei a cada uma das partes, de demonstrar a ocorrência dos fatos de seu próprio interesse para as decisões a serem proferidas no processo.  \r\n"
						+ "Logo, caberia ao autor demonstrar, por todas as formas em direito admitidas, ainda que minimamente, a existência do fato ocorrido, ônus que não se desincumbiu, inexistindo nos autos provas suficientes, ainda que indiciárias, e acerca dos fatos alegados na inicial.\r\n"
						+ " \r\n"
						+ "De outro modo, não se revela crível a imposição automática ao demandado, mediante inversão, do ônus probatório de eventual fato negativo sem a existência de indícios mínimos do ocorrido, notadamente porque o demandado demonstrou a regularidade da prestação do serviço. \r\n"
						+ "Essa impossibilidade decorre da própria natureza da prova, que geralmente se concentra em demonstrar a existência de algo, ao invés de sua inexistência.  \r\n"
						+ "Nesse sentido, Ada Pellegrini Grinover, afirma que \"a prova de fatos negativos exige a demonstração da inexistência de algo, o que, em muitos casos, pode revelar-se impraticável ou excessivamente dispendioso em termos probatórios\". (GRINOVER, Ada Pellegrini. Teoria Geral do Processo. São Paulo: Malheiros Editores, 2017). \r\n"
						+ "Numa breve síntese: não comprovados ainda que minimamente (CPC, art. 373, I) a existência dos danos postulados, a improcedência da demanda é de rigor.";
			}
			else if(menuFundamentacao == 3) {
				textoFundamentacao = "Assim, para impedir o êxito da presente demanda indenizatória, caberia ao fornecedor provar: (1) que o vício alegado inexistia; (2) que o vício deduzido existia, porém foi sanado no prazo legal; (3) culpa exclusiva do autor ou de terceiro; ou (4) a ocorrência do denominado “fortuito externo”, ônus probatório este, todavia, do qual não se desincumbiu. \r\n"
						+ "De outro lado, para o sucesso da demanda de que se cuida, caberia ao autor demonstrar tão somente os danos postulados e a relação de causalidade entre eles e o alegado “vício de qualidade-adequação”. \r\n"
						+ "Assim, havendo vício de qualidade-adequação do produto e não sendo o defeito sanado no prazo de 30 (trinta) dias, cabe ao consumidor optar pela substituição do bem, restituição do preço ou abatimento proporcional, nos termos do art. 18, § 1º, incisos I, II, e III, todos do CDC.";
			}
			else if(menuFundamentacao == 4) {
				textoFundamentacao = "Assim, para impedir o êxito da presente demanda indenizatória, caberia ao fornecedor provar: (1) que o vício alegado inexistia; (2) que o vício deduzido existia, porém foi sanado no prazo legal; (3) culpa exclusiva do autor ou de terceiro; ou (4) a ocorrência do denominado “fortuito externo”, ônus probatório este, todavia, do qual não se desincumbiu. \r\n"
						+ "De outro lado, para o sucesso da demanda de que se cuida, caberia ao autor demonstrar tão somente os danos postulados e a relação de causalidade entre eles e o alegado “vício de qualidade-adequação”. \r\n"
						+ "Assim, havendo vício de qualidade-adequação do produto e não sendo o defeito sanado no prazo de 30 (trinta) dias, cabe ao consumidor optar pela substituição do bem, restituição do preço ou abatimento proporcional, nos termos do art. 18, § 1º, incisos I, II, e III, todos do CDC. \r\n"
						+ "Ademais, alguns procedimentos que seriam suscetíveis de ensejar a oxidação do aparelho, segundo os respectivos fabricantes – tais como levá-lo à praia ou usar capas plásticas de proteção – exigiriam informações mais detalhadas ao consumidor por serem desconhecidos do homem médio, sob pena de responsabilidade civil do fornecedor por vício de informação (CDC, art. 6º, III).\r\n"
						+ "Assim, não bastaria ao demandado consignar no laudo a afirmação de mau uso do aparelho pelo consumidor, mas sim especificar em que consistiu, e, principalmente, se o consumidor utilizou inadequadamente o produto (celular) segundo o senso comum do homem médio (por exemplo, imergindo-o em substância líquida), o que não restou demonstrado nos autos (CPC, art. 373, II).";
			}
			else if(menuFundamentacao == 5) {
				textoFundamentacao = "Assim, para impedir o êxito da presente demanda indenizatória, caberia ao fornecedor provar: (1) que o vício alegado inexistia; (2) que o vício deduzido existia, porém foi sanado no prazo legal; (3) culpa exclusiva do autor ou de terceiro; ou (4) a ocorrência do denominado “fortuito externo”. \r\n"
						+ "Na linha do disposto no art. 373, inciso I, do CPC, os fatos constitutivos são os fatos afirmados na petição inicial pelo autor, cabendo a ele prová-los. \r\n"
						+ "Em contrapartida, ao réu cabe provar a existência de fatos impeditivos, modificativos ou extintivos do direito do autor. \r\n"
						+ "O ônus da prova é, portanto, o encargo, atribuído pela lei a cada uma das partes, de demonstrar a ocorrência dos fatos de seu próprio interesse para as decisões a serem proferidas no processo. \r\n"
						+ "Com efeito, as provas produzidas durante a instrução processual, não foram adequadas nem convincentes no sentido de demonstrar, ainda que de forma indiciária, a existência do vício apontado, bem assim que o consumidor procurou a assistência técnica para resolução do problema, ônus que incumbia ao demandante (art. 373, inciso I, do CPC) e do qual não se desincumbiu.\r\n"
						+ "Os vícios de qualidade por inadequação dão ensejo, primeiro, ao direito do fornecedor ou equiparado a corrigir o vício manifestado, mantendo-se íntegro o contrato firmado entre as partes.\r\n"
						+ "Isso porque a escolha quanto a alguma das soluções elencadas pela lei consumerista deve ser exercida no prazo decadencial do art. 26 do CDC, contado, por sua vez, após o transcurso do prazo trintídio para conserto do bem pelo fornecedor. \r\n"
						+ "Toda a construção acerca da tutela dos vícios redibitórios, seja sob o enfoque civilista, seja sob o enfoque consumerista, diz respeito a viabilizar a manutenção do contrato e de seu sinalagma original, e isso faz sentido porque os vícios, embora desconhecidos, são contemporâneos ao contrato ou preexistentes.\r\n"
						+ "Entender de modo diverso seria admitir que, exercida a preferência do consumidor e transcorrido o prazo decadencial, o adquirente lançasse mão de instrumento diverso para, ao fim e ao cabo, atingir o mesmo objetivo perdido exclusivamente em razão de sua desídia.\r\n"
						+ "Noutros termos, seria desnaturar a garantia desenhada por lei que, embora destinada precipuamente à proteção do adquirente e, em especial, do consumidor, não perde o caráter geral de garantir previsibilidade e segurança às relações jurídicas, resguardando expectativas mútuas legítimas.\r\n"
						+ "Numa breve síntese: não comprovados, ainda que minimamente (CPC, art. 373, I), a existência do vício e a concessão da oportunidade de reparo ao fornecedor, a improcedência da demanda é de rigor.";
			}
			else if(menuFundamentacao == 6) {
				textoFundamentacao = "Assim, para impedir o êxito da presente demanda indenizatória, caberia aos demandados provar as excludentes de responsabilidade civil, ou seja: (1) que, tendo prestado o serviço, o defeito alegado inexistiu; (2) culpa exclusiva do autor ou de terceiro; ou (3) a ocorrência do denominado “fortuito externo”, ônus probatório este, todavia, do qual não se desincumbiram.\r\n"
						+ "De outro lado, para o sucesso da demanda de que se cuida, caberia ao autor demonstrar tão somente os danos postulados e a relação de causalidade entre eles e o serviço defeituoso realizado.\r\n"
						+ "Com efeito, a alegação do consumidor de que (1) ________________, (2) que _______________, além de ser verossímil, segundo as regras ordinárias de experiência e pela observação do que ordinariamente acontece (CDC, art. 6º, inciso VIII, c/c CPC, art. 375), acabou sendo evidenciada, nos autos, no momento em que o fornecedor defendeu a licitude de sua atuação, sem, contudo, acostar documentos e/ou outros meios de provas capazes de corroborar com suas alegações e, desse modo, afastar os fatos e provas trazidos pelo autor, estes que demonstram o descumprimento da oferta encaminhada, o que, em outras palavras, demonstra a existência de falha na prestação do serviço. \r\n"
						+ "Nos termos do art. 6º, inciso III, do CDC, constitui direito básico do consumidor “a informação adequada e clara sobre os diferentes produtos e serviços, com especificação correta de quantidade, características, composição, qualidade e preço, bem como sobre os riscos que apresentem”. \r\n"
						+ "O referido dispositivo legal é reflexo do princípio da transparência, que alcança o negócio em sua essência, na medida em que a informação repassada ao consumidor integra o próprio conteúdo do contrato. \r\n"
						+ "Trata-se, portanto, de dever intrínseco ao negócio e que deve estar presente não apenas na formação do contrato, mas também durante toda a sua execução. \r\n"
						+ "O direito à informação visa a assegurar ao consumidor uma escolha consciente, permitindo que suas expectativas em relação ao produto ou serviço sejam de fato atingidas, manifestando o que vem sendo denominado de “consentimento informado” ou “vontade qualificada”. \r\n"
						+ "Muito oportuna, nesse ponto, a lição de Cláudia Lima Marques, no sentido de que o dever de informar não se restringe à fase pré-contratual, incluindo o dever “de informar durante o transcorrer da relação (...), pois, se não sabe dos riscos naquele momento, não pode decidir sobre a continuação do vínculo ou o tipo de prestação futura”. A referida autora conclui que “informar é mais do que cumprir com o dever anexo de informação: é cooperar e ter cuidado com o parceiro contratual, evitando os danos morais e agindo com lealdade (pois é o fornecedor que detém a informação) e boa-fé” (Comentários ao código de defesa do consumidor. 2. ed., São Paulo: RT, 2006, pp. 178-179). \r\n"
						+ "Nesse contexto, o art. 14 do CDC imputa ao fornecedor a responsabilidade, independentemente de culpa, pela reparação dos danos causados aos consumidores por “informações insuficientes ou inadequadas sobre sua fruição e riscos”. \r\n"
						+ "Na hipótese específica dos autos, exsurge claramente a responsabilidade objetiva do fornecedor pelo descumprimento do específico dever de ________________. \r\n"
						+ "Em síntese, não é possível concluir que a informação prestada tenha sido efetivamente satisfatória, o que afronta, a toda evidência, o dever de informação, previsto no artigo 6º, inciso III, do Código de Defesa do Consumidor - CDC e caracteriza falha na prestação dos serviços. \r\n"
						+ "Ora, sendo induvidosa (i) a falha na prestação de serviço, bem assim a (ii) presença de um liame de causa e efeito entre a deficiência do serviço ofertado e os danos reivindicados pelo autor, não há como negar a caracterização, em tese, da responsabilidade civil. ";
			}
			else if(menuFundamentacao == 7) {
				textoFundamentacao = "Assim, para impedir o êxito da presente demanda indenizatória, caberia ao demandado provar as excludentes de responsabilidade civil, ou seja: (1) que, tendo prestado o serviço, o defeito alegado inexistiu; (2) culpa exclusiva do autor ou de terceiro; ou (3) a ocorrência do denominado “fortuito externo”. De outro lado, para o sucesso da demanda de que se cuida, caberia ao autor demonstrar tão somente os danos postulados e a relação de causalidade entre eles e o serviço defeituoso realizado. Nos termos do art. 6º, inciso III, do CDC, constitui direito básico do consumidor “a informação adequada e clara sobre os diferentes produtos e serviços, com especificação correta de quantidade, características, composição, qualidade e preço, bem como sobre os riscos que apresentem”.  O referido dispositivo legal é reflexo do princípio da transparência, que alcança o negócio em sua essência, na medida em que a informação repassada ao consumidor integra o próprio conteúdo do contrato.  Trata-se, portanto, de dever intrínseco ao negócio e que deve estar presente não apenas na formação do contrato, mas também durante toda a sua execução.  O direito à informação visa a assegurar ao consumidor uma escolha consciente, permitindo que suas expectativas em relação ao produto ou serviço sejam de fato atingidas, manifestando o que vem sendo denominado de “consentimento informado” ou “vontade qualificada”. Muito oportuna, nesse ponto, a lição de Cláudia Lima Marques, no sentido de que o dever de informar não se restringe à fase pré-contratual, incluindo o dever “de informar durante o transcorrer da relação (...), pois, se não sabe dos riscos naquele momento, não pode decidir sobre a continuação do vínculo ou o tipo de prestação futura”. A referida autora conclui que “informar é mais do que cumprir com o dever anexo de informação: é cooperar e ter cuidado com o parceiro contratual, evitando os danos morais e agindo com lealdade (pois é o fornecedor que detém a informação) e boa-fé” (Comentários ao código de defesa do consumidor. 2. ed., São Paulo: RT, 2006, pp. 178-179). Nesse contexto, o art. 14 do CDC imputa ao fornecedor a responsabilidade, independentemente de culpa, pela reparação dos danos causados aos consumidores por “informações insuficientes ou inadequadas sobre sua fruição e riscos”. No contexto fático e do acervo probatório dos autos, revelou-se que o demandante foi efetiva e adequadamente informado acerca de todos os termos contratuais, sendo certa sua concordância prévia, ou seja, não se pode reconhecer, no caso concreto, ofensa ao princípio do dever de informação.\r\n"
						+ "Numa breve síntese, não comprovado pelo demandante (CPC, art. 373, I), ainda que minimamente, a inobservância dos preceitos informativos do consumidor a improcedência da demanda é de rigor.";
			}
			else if(menuFundamentacao == 8) {
				textoFundamentacao = "Assim, para impedir o êxito da presente demanda indenizatória, caberia ao demandado provar as excludentes de responsabilidade civil, ou seja: (1) que, tendo prestado o serviço, o defeito alegado inexistiu; (2) culpa exclusiva do autor ou de terceiro; ou (3) a ocorrência do denominado “fortuito externo”. \r\n"
						+ "De outro lado, para o sucesso da demanda de que se cuida, caberia ao autor demonstrar tão somente os danos postulados e a relação de causalidade entre eles e o serviço defeituoso realizado. \r\n"
						+ "O Código do Consumidor é norteado principalmente pelo reconhecimento da vulnerabilidade do consumidor e pela necessidade de que o Estado atue no mercado para minimizar essa hipossuficiência, garantindo, assim, a igualdade material entre as partes. \r\n"
						+ "Sendo assim, no tocante à oferta, estabelece serem direitos básicos do consumidor o de ter a informação adequada e clara sobre os diferentes produtos e serviços (CDC, art. 6°, III) e o de receber proteção contra a publicidade enganosa ou abusiva (CDC, art. 6°, IV), pois a publicidade deve refletir fielmente a realidade anunciada, em observância à principiologia do CDC. \r\n"
						+ "Realmente, o princípio da vinculação da oferta reflete a imposição da transparência e da boa-fé nos métodos comerciais, na publicidade e nos contratos, de forma que esta exsurge como princípio máximo orientador, nos termos do art. 30 (“Toda informação ou publicidade, suficientemente precisa, veiculada por qualquer forma ou meio de comunicação com relação a produtos e serviços oferecidos ou apresentados, obriga o fornecedor que a fizer veicular ou dela se utilizar e integra o contrato que vier a ser celebrado”). \r\n"
						+ "É inequívoco o caráter vinculativo da oferta, integrando o contrato, de modo que o fornecedor de produtos ou serviços se responsabiliza também pelas expectativas que a publicidade venha a despertar no consumidor, mormente quando veicula informação de produto ou serviço com a chancela de determinada característica ou marca, sendo a materialização do princípio da boa-fé objetiva, exigindo do anunciante os deveres anexos de lealdade, confiança, cooperação, proteção e informação, sob pena de responsabilidade civil. \r\n"
						+ "No contexto fático e do acervo probatório dos autos, restou demonstrado, nos autos, que o consumidor não obteve o produto/bem, conforme oferta expressa do fornecedor e materializada no contrato firmado, revelando, desse modo, o descumprimento do princípio vinculativo da oferta e configurando a falha na prestação dos serviços.\r\n"
						+ "Ora, sendo induvidosa a (i) a falha na prestação do serviço, bem assim a (ii) presença de um liame de causa e efeito entre a deficiência do serviço ofertado pelo demandado e os danos reivindicados pelo demandante, não há como negar a caracterização, em tese, da responsabilidade civil, assim como de uma tutela específica para determinar o cumprimento da oferta.";
			}
			else if(menuFundamentacao == 9) {
				textoFundamentacao = "Assim, para impedir o êxito da presente demanda indenizatória, caberia ao demandado provar as excludentes de responsabilidade civil, ou seja: (1) que, tendo prestado o serviço, o defeito alegado inexistiu; (2) culpa exclusiva do autor ou de terceiro; ou (3) a ocorrência do denominado “fortuito externo”. \r\n"
						+ "De outro lado, para o sucesso da demanda de que se cuida, caberia ao autor demonstrar tão somente os danos postulados e a relação de causalidade entre eles e o serviço defeituoso realizado. \r\n"
						+ "O Código do Consumidor é norteado principalmente pelo reconhecimento da vulnerabilidade do consumidor e pela necessidade de que o Estado atue no mercado para minimizar essa hipossuficiência, garantindo, assim, a igualdade material entre as partes. \r\n"
						+ "Sendo assim, no tocante à oferta, estabelece serem direitos básicos do consumidor o de ter a informação adequada e clara sobre os diferentes produtos e serviços (CDC, art. 6°, III) e o de receber proteção contra a publicidade enganosa ou abusiva (CDC, art. 6°, IV), pois a publicidade deve refletir fielmente a realidade anunciada, em observância à principiologia do CDC. \r\n"
						+ "Realmente, o princípio da vinculação da oferta reflete a imposição da transparência e da boa-fé nos métodos comerciais, na publicidade e nos contratos, de forma que esta exsurge como princípio máximo orientador, nos termos do art. 30 (“Toda informação ou publicidade, suficientemente precisa, veiculada por qualquer forma ou meio de comunicação com relação a produtos e serviços oferecidos ou apresentados, obriga o fornecedor que a fizer veicular ou dela se utilizar e integra o contrato que vier a ser celebrado”). \r\n"
						+ "É inequívoco o caráter vinculativo da oferta, integrando o contrato, de modo que o fornecedor de produtos ou serviços se responsabiliza também pelas expectativas que a publicidade venha a despertar no consumidor, mormente quando veicula informação de produto ou serviço com a chancela de determinada característica ou marca, sendo a materialização do princípio da boa-fé objetiva, exigindo do anunciante os deveres anexos de lealdade, confiança, cooperação, proteção e informação, sob pena de responsabilidade civil. \r\n"
						+ "No contexto fático e do acervo probatório dos autos, não há provas convincentes de que foi ofertado algo diferente do que acabou formalizado pelo consumidor, pois a documentação apresentada e as demais provas produzidas demonstram que o consumidor foi adequadamente informado de todos os termos contratuais e que o bem/serviço prestado estava em conformidade com a oferta indicada, ou seja, não se pode reconhecer, no caso concreto, vulneração ao princípio da vinculação da oferta.\r\n"
						+ "Numa breve síntese, não comprovado pelo demandante (CPC, art. 373, I), ainda que minimamente, a inobservância da oferta direcionada ao consumidor a improcedência da demanda é de rigor.";
			}
			else if(menuFundamentacao == 10) {
				textoFundamentacao = "Nesse contexto, para impedir o êxito da presente demanda indenizatória, caberia ao demandado provar as excludentes de responsabilidade civil, ou seja: (1) que, tendo prestado o serviço, o defeito alegado inexistiu; (2) culpa exclusiva do autor ou de terceiro; ou (3) a ocorrência do denominado “fortuito externo”, ônus probatório este, todavia, do qual não se desincumbiu.\r\n"
						+ "A jurisprudência do Superior Tribunal de Justiça – STJ (dentre outros: AgInt nos EDcl no REsp nº 1.502.609 - PR) e do Tribunal de Justiça de Pernambuco – TJPE (Súmula 13) entendem não ser possível a responsabilização do consumidor por débito de consumo sem a comprovação inequívoca de sua autoria na fraude do medidor, ou seja, não se pode presumir que a autoria da alegada prática fraudulenta seria do consumidor, em razão somente de considerá-lo depositário de tal aparelho.\r\n"
						+ "Isso porque a empresa concessionária, além de todos os dados estatísticos acerca do regular consumo, ainda dispõe de seu corpo funcional, que, mês a mês, verifica e inspeciona os equipamentos.\r\n"
						+ "A Resolução 1000/2021, da ANEEL, embora estabeleça a possibilidade de apuração do consumo não faturado ou faturado a menor, não autoriza que a cobrança seja realizada conforme a conveniência da concessionária de energia elétrica, de modo que eventual débito pretérito deve ser apurado por meio da provocação do Judiciário, utilizando-se os meios ordinários de cobrança, tal como fazem os credores comuns.\r\n"
						+ "Ademais, o STJ decidiu no REsp nº 1.412.433/RS, submetido ao regime jurídico dos recursos repetitivos (CPC, art. 927, inciso III), que apenas é possível o corte administrativo do fornecimento do serviço de energia elétrica, mediante prévio aviso ao consumidor, pelo inadimplemento do consumo recuperado correspondente ao período de 90 (noventa) dias anterior à constatação da fraude, contanto que executado o corte em até 90 (noventa) dias após o vencimento do débito, sem prejuízo do direito de a concessionária utilizar os meios judiciais ordinários de cobrança da dívida, inclusive antecedente aos mencionados 90 (noventa) dias de retroação.\r\n"
						+ "De outro lado, para o sucesso da demanda de que se cuida, caberia aos demandantes demonstrar tão somente os danos postulados e a relação de causalidade entre eles e o serviço defeituoso realizado.\r\n"
						+ "Com efeito, o demandante alegou e comprovou que foi cobrado por valores oriundos de estimativa de carga (ID Num. 43464500 - Pág. 1; Num. 43464563 - Páginas 1 e 2).\r\n"
						+ "O demandado, por sua vez, não acostou documentos capazes de evidenciar a autoria do consumidor na fraude do medidor, tampouco a correção dos valores exigidos, especialmente porque apresentou cálculos que remontam ao período compreendido entre 12.2015 a 11.2018 (ID Num. 48370535 - Pág. 19), em desacordo com o decidido pelo STJ no aludido recurso repetitivo, o que, em outras palavras, demonstra a existência de falha na prestação do serviço.\r\n"
						+ "Ora, sendo induvidosa (i) a falha na prestação do serviço, bem assim a (ii) presença de um liame de causa e efeito entre a deficiência do serviço ofertado e os danos reivindicados pelo autor, não há como negar a caracterização, em tese, da responsabilidade civil, bem como o reconhecimento da ilegitimidade da dívida exigida e, ainda, a necessidade de uma tutela jurisdicional capaz de impedir que a concessionária promova a suspensão do fornecimento de energia elétrica bem como impedir que inscreva a demandante no cadastro dos órgãos de proteção ao crédito. ";
			}
			else if(menuFundamentacao == 11) {
				textoFundamentacao = "Com efeito, é incontroverso (CPC, art. 374, inciso III) que as bagagens do demandante se encontravam danificadas e violadas quando da entrega, tendo ocorrido o desaparecimento de bens, sendo certo que tal fato não foi impugnado pelo demandado, restando assim incontroversa tal questão. \r\n"
						+ "É dever principal do transportador transladar os passageiros e suas bagagens até o local de destino com cuidado, exatidão e presteza, bem assim observar os deveres secundários de cumprir o itinerário ajustado e o horário marcado, sob pena de responsabilização pelo atraso ou pela mudança de trajeto. \r\n"
						+ "Ora, o dever de incolumidade das bagagens não foi respeitado, não sendo possível aferir a reponsabilidade individual de cada demandado, especialmente em razão de suas alegações estarem desacompanhadas de elementos probatórios para fundamentá-las, razão pela qual a melhor solução ao caso concreto é pela responsabilização solidária dos réus, nos limites previstos na Convenção de Montreal. \r\n"
						+ "Com efeito, o item 2 do artigo 22 da Convenção de Montreal prevê como indenização o limite de “1.000 Direitos Especiais de Saque por passageiro”, ressalvando-se a hipótese de entrega pelo consumidor de declaração especial de valor dos bens transportados, o que possibilitaria indenização em valor superior. \r\n"
						+ "Frise-se, contudo, inexistir nos autos a referida declaração especial de valor, restando limitada a indenização aos valores previstos na Convenção mencionada em 1.000 (um mil Direitos Especiais de Saque). \r\n"
						+ "Nessa linha, o item 1 do artigo 23 da Convenção de Montreal prevê a conversão das unidades monetárias, aduzindo que “no caso de ações judiciais, se fará conforme o valor de tais moedas em Direitos Especiais de Saque, na data da sentença”.";
			}
			else if(menuFundamentacao == 12) {
				textoFundamentacao = "Com efeito, é incontroverso (CPC, art. 374, inciso III) que o voo contratado pelo demandante previa a chegada ao destino no dia __________, contudo, apenas chegou no dia ______________ em razão de problemas operacionais. Tal fato foi reconhecido pelo demandado na contestação (ID Num. _____________), restando assim incontroversa tal questão. \r\n"
						+ "É dever principal do transportador transladar os passageiros e suas bagagens até o local de destino com cuidado, exatidão e presteza, bem assim observar os deveres secundários de cumprir o itinerário ajustado e o horário marcado, sob pena de responsabilização pelo atraso ou pela mudança de trajeto. \r\n"
						+ "Ora, o dever de presteza e cumprimento de itinerário não foi respeitado, bem assim não restou demonstrado que foram adotadas todas as medidas razoavelmente necessárias para evitar o dano oriundo do atraso, notadamente porque o demandante teve de arcar com o pagamento de valores a título de despacho de bagagens sem o devido ressarcimento, sendo passível, portanto, de responsabilização nos limites previstos na Convenção de Montreal.";
			}
			else if(menuFundamentacao == 13) {
				textoFundamentacao = "A responsabilidade subjetiva consiste no dever imposto a alguém de indenizar outrem, por ter agido, o primeiro, de modo a confrontar o ordenamento jurídico – agir este que pode ser doloso ou culposo – causando, ao segundo, um dano material (danos emergentes e lucros cessantes) ou extrapatrimonial (dano moral e estético).\r\n"
						+ "\r\n"
						+ "Logo, são pressupostos para configuração deste tipo de responsabilidade: (a) uma conduta culposa e antijurídica do agente; (b) existência de um dano; (c) liame de causa e efeito entre os dois primeiros elementos (a e b).\r\n"
						+ "\r\n"
						+ "Na linha do disposto no art. 373, inciso I, do CPC, os fatos constitutivos são os fatos afirmados na petição inicial pelo autor, cabendo a ele prová-los.\r\n"
						+ "\r\n"
						+ "Em contrapartida, ao réu cabe provar a existência de fatos impeditivos, modificativos ou extintivos do direito do autor.\r\n"
						+ "\r\n"
						+ "O ônus da prova é, portanto, o encargo, atribuído pela lei a cada uma das partes, de demonstrar a ocorrência dos fatos de seu próprio interesse para as decisões a serem proferidas no processo.\r\n"
						+ "\r\n"
						+ "Com efeito, as poucas provas produzidas durante a instrução processual, limitadas a orçamentos e BO, este relatando que _________________________(ID ____________________), não foram claras nem convincentes no sentido de\r\n"
						+ "\r\n"
						+ "informar a dinâmica da colisão, tampouco a responsabilidade do demandado, ônus que incumbia ao demandante (art. 373, inciso I, do CPC) e do qual não se desincumbiu.\r\n"
						+ "\r\n"
						+ "Nessa senda, inexistindo clareza quando à conduta ilícita do demandado, não há que se falar em dever indenizatório.";
			}
			else if(menuFundamentacao == 14) {
				textoFundamentacao = "Na linha do disposto no art. 373 do CPC, os fatos constitutivos são os fatos afirmados na petição inicial pelo autor, cabendo a ele prová-los. \r\n"
						+ "\r\n"
						+ "Em contrapartida, ao réu cabe provar a existência de fatos impeditivos, modificativos ou extintivos do direito do autor. \r\n"
						+ "\r\n"
						+ "O ônus da prova é, portanto, o encargo, atribuído pela lei a cada uma das partes, de demonstrar a ocorrência dos fatos de seu próprio interesse para as decisões a serem proferidas no processo. \r\n"
						+ "\r\n"
						+ "Logo, caberia ao autor demonstrar, por todas as formas em direito admitidas, ainda que minimamente, a existência dos fatos ocorridos, ônus que não se desincumbiu, inexistindo nos autos quaisquer provas acerca dos fatos aduzidos na inicial, de forma a trazer verossimilhança às suas alegações e fundamentar seus pedidos. \r\n"
						+ "\r\n"
						+ "Numa breve síntese: não comprovados ainda que minimamente (CPC, art. 373, I) a existência dos fatos ocorridos, a improcedência da demanda é de rigor.";
			}
			else if(menuFundamentacao == 15) {
				textoFundamentacao = "O Código de Processo Civil - CPC, preocupado com os princípios da igualdade, segurança jurídica e proteção à confiança, positivou a vinculação dos “juízes e tribunais” (CPC, art. 927, “caput”) aos precedentes judiciais. \r\n"
						+ "\r\n"
						+ "O novo sistema de precedentes evidencia que o “sistema jurídico é um sistema complexo, constituído por dois subsistemas: um normativo – formado por normas constitucionais, legais e regulamentares, cuja estruturação tenta ser piramidal -, e outro de precedentes – estruturado em rede e formado pelos julgados das várias cortes que tenha gerado um ganho hermenêutico para o sistema jurídico como um todo” (Juraci Mourão Lopes Filho. Revista de Direito Brasileira. São Paulo, SP. v. 18. n. 7. p. 150. Set./Dez. 2017). \r\n"
						+ "\r\n"
						+ "O método dos precedentes “procura a melhor nova decisão à luz das decisões anteriores, do que é específico para o caso em questão e também do que é necessário para manter um sistema jurídico coerente”, cuja aplicação atrai um processo construtivo complexo pelo intérprete: \r\n"
						+ "\r\n"
						+ "“(...) o precedente judicial pode ser tido como a própria norma aplicada pela corte, compreendida especialmente a partir da fundamentação, que se afigura indispensável para resolver o caso. É importante perceber que há diferenças entre a decisão, e até mesmo sua fundamentação, e o precedente em sentido estrito, que constitui uma norma compreendida a partir de toda a decisão, por um processo construtivo próprio, e a ela não se limita. Esse seria o conceito estrito de precedente, que se confunde com o de ratio decidendi ou norma da decisão. É nesse sentido que se fala, por exemplo, em \"aplicação do precedente\": o que se está a aplicar, a rigor, é a norma que se constrói a partir do precedente” (DIDIER JR., Fredie; DE MACÊDO, Lucas Buril. Julgamento de casos repetitivos. Coleção grande temas do novo CPC, v. 10. Coordenação geral, Fredie Didier Jr. Salvador: Juspodivm, 2016. p. 197-198). \r\n"
						+ "\r\n"
						+ "Daí porque a doutrina acertadamente pontua que se deve uniformizar quando há identidade essencial ou substancial entre o precedente e a demanda a ser julgada - “casos semelhantes e não idênticos” -, pois “mesmos os casos que envolvem fatos mais complexos, daqueles que não se repetem no plano empírico de modo idêntico, podem ser reduzidos a um grau elevado de abstração, que é justamente o que proporciona a vinculação por identidade essencial” (WAMBIER, Teresa Arruda Alvim. Recurso especial, recurso extraordinário e a nova função dos tribunais superiores no direito brasileiro. 3. ed. São Paulo: RT, 2016. p. 203). \r\n"
						+ "\r\n"
						+ "O vínculo entre os casos, suficiente e capaz de atrair a aplicação do precedente ao caso concreto, foi didaticamente examinado por Fredie Didier e Lucas Buril, senão vejamos: \r\n"
						+ "\r\n"
						+ "“Ao se observar atentamente os dois casos - o precedente e a demanda subsequente - será perceptível que existam diferenças: nunca dois eventos são exatamente iguais. Todavia, para que uma decisão seja considerada precedente para outro caso, não se requer que os fatos da causa anterior sejam absolutamente idênticos aos dos posteriores. Caso isso fosse exigido, nenhuma decisão teria condições de ser precedente para os juízes futuros. É necessário que se elimine a ideia de igualdade absoluta para a operação com precedentes judiciais. O foco, então, para a operação dos precedentes, deve sair dos fatos da decisão, como um todo, para a caracterização dos fatos relevantes para a tomada de decisão. Ou seja, a fim de aplicar precedentes, mais propriamente de determinar se um precedente é aplicável a um caso subsequente, é preciso observar os fatos que foram decisivos para que a decisão anterior fosse efetivamente prolatada e, em seguida, analisar as similaridades com o caso subsequente, especificando se os fatos categorizados que foram considerados juridicamente importantes estão presentes e quais fatos não possuem relevância para o Direito” (DIDIER JR., Fredie; DE MACÊDO, Lucas Buril. Julgamento de casos repetitivos. Coleção grande temas do novo CPC, v. 10. Coordenação geral, Fredie Didier Jr. Salvador: Juspodivm, 2016. p. 199-200). \r\n"
						+ "\r\n"
						+ "Nesse contexto, conforme literal disposição do art. 927 c/c § 2º do art. 987, ambos do CPC, seriam vinculantes as seguintes decisões do STJ: (1) as proferidas em incidente de assunção de competência ou de resolução de demandas repetitivas; (2) em julgamento de recursos especial repetitivos; (3) os enunciados de suas súmulas em matéria infraconstitucional; (4) as orientações do plenário ou do órgão especial; e (5) a decisão do STJ adotada em recurso especial interposto contra decisão proferida pelos Tribunais Regionais Federais ou pelos Tribunais de Justiça em incidente de resolução de demandas repetitivas. \r\n"
						+ "\r\n"
						+ "Na verdade, a vinculação busca fazer com que todos os jurisdicionados sejam tratados de forma isonômica, viabilizando o aspecto pragmático de tornar concreto o princípio da igualdade ou da universalidade, obrigando todos os órgãos do Poder Judiciário a respeitar a norma posta-interpretada pelo Estado-juiz, após manifestação do órgão que tem, em última instância, a competência para dar a palavra final (MEIRELES, Edilton. Do incidente de resolução de demandas repetitivas no processo civil brasileiro. Julgamento de casos repetitivos. Coleção grande temas do novo CPC, v. 10. Coordenação geral, Fredie Didier Jr. Salvador: Juspodivm, 2016. p. 87). \r\n"
						+ "\r\n"
						+ "O sistema de precedentes também permite uma outra conclusão: o inconformismo puro e simples das partes é vedado e não faz qualquer sentido à luz do devido processo legal, da estruturação do sistema recursal e da duração razoável do processo. \r\n"
						+ "\r\n"
						+ "No campo do direito do consumidor, especialmente no âmbito dos Juizados Especiais Cíveis, a litigiosidade em massa tem justificado as regras de vinculação aos precedentes não só para impedir o tratamento diferenciado aos jurisdicionados por parte do Estado-juiz, mas especialmente para obrigar o Poder Judiciário a adotar e materializar uma nova gestão no processamento e julgamento das demandas repetitivas, naquilo que é denominado pelos processualistas de “microssistema de gestão e julgamento de casos repetitivos”. \r\n"
						+ "\r\n"
						+ "Uma vez que o Superior Tribunal de Justiça - STJ fixou diversas teses sobre a validade das tarifas dos contratos bancários em sede de recursos repetitivos (REsp 1.251.331; REsp 1.255.573; REsp 1.578.553; REsp 1.578.526; REsp 1.578.490; REsp 1.639.259; e REsp 1.639.320), cabe a este magistrado explicitar o conjunto de diretrizes e os respectivos limites dos precedentes que orientarão o julgamento do caso concreto, respeitando-se o que foi decidido. \r\n"
						+ "\r\n"
						+ "As tarifas/despesas alcançadas pelos recursos repetitivos foram: (a) Tarifa de Abertura de Crédito – TAC; (b) Tarifa de Emissão de Carnê/Boleto – TEC; (c) Tarifa de Cadastro ou Abertura de Cadastro; (d) Financiamento do Imposto sobre Operações Financeiras – IOF; (e) Serviço Prestado pela Revenda e Acesso a Cotações; (f) Registro do Contrato/Gravame; (g) Tarifa de Avaliação do Veículo Usado; (h) Serviços Prestados pela Revenda; (i) Avaliação do Veículo; (j) avaliação de bens; (k) inclusão eletrônica de gravame; e (l) de seguro de proteção financeira. \r\n"
						+ "\r\n"
						+ "Segundo o Tribunal da Cidadania - STJ, a cobrança da Tarifa de Abertura de Crédito - TAC e da Tarifa de Emissão de Carnê/Boleto – TEC, inclusive as que tiverem outras denominações para o mesmo fato gerador, é permitida apenas nos contratos celebrados até 30 de abril de 2008, ressalvado o exame de abusividade em cada caso concreto. \r\n"
						+ "\r\n"
						+ "Resumidamente, a pactuação de Tarifa de Abertura de Crédito - TAC e da Tarifa de Emissão de Carnê - TEC não tem mais respaldo legal, porém a cobrança é permitida para os contratos celebrados até 30 de abril de 2008. \r\n"
						+ "\r\n"
						+ "A cobrança da Tarifa/Taxa de Abertura de Cadastro, todavia, foi declarada válida, mas somente no início do relacionamento entre o consumidor e a instituição financeira. \r\n"
						+ "\r\n"
						+ "Também ficou definido que as partes podem convencionar o pagamento do Imposto sobre Operações Financeiras e de Crédito - IOF por meio de financiamento acessório ao mútuo principal, sujeitando-o aos mesmos encargos contratuais.  \r\n"
						+ "\r\n"
						+ "O STJ ainda fixou tese no sentido de considerar abusiva, em contratos bancários, a cláusula que prevê ressarcimento de serviços prestados por terceiros sem a especificação do serviço a ser efetivamente executado, bem assim considerou abusiva a cláusula que prevê ressarcimento, pelo consumidor, da comissão do correspondente bancário, nos casos de contratos celebrados a partir de 25 de fevereiro de 2011 – data de entrada em vigor da Resolução CMN nº 3.954/2011 –, sendo válida a cláusula no período anterior à resolução, ressalvado o controle da onerosidade excessiva. \r\n"
						+ "\r\n"
						+ "Ademais, o STJ também fixou tese no sentido da validade da tarifa de avaliação do bem dado em garantia, bem como da cláusula que prevê o ressarcimento de despesa com registro do contrato, ressalvadas as hipóteses de (1) reconhecimento de abuso por cobrança de serviço não efetivamente prestado e (2) da possibilidade de controle da onerosidade excessiva em cada caso concreto. \r\n"
						+ "\r\n"
						+ "O Tribunal da Cidadania (STJ) considerou abusiva a cláusula que prevê o ressarcimento pelo consumidor da despesa com o registro do pré-gravame, em contratos celebrados a partir de 25/02/2011, data de entrada em vigor da Res. CMN 3.954/2011, sendo válida a cláusula pactuada no período anterior a essa resolução, ressalvado o controle da onerosidade excessiva. \r\n"
						+ "\r\n"
						+ "O Colendo STJ definiu, ainda, que nos contratos bancários em geral, o consumidor não pode ser compelido a contratar seguro com a instituição financeira ou com seguradora por ela indicada, vale dizer: caso o contrato não ressalve a possibilidade de contratação com outra seguradora, o seguro caracterizar-se-á como venda casada (CDC, art. 39, inciso I). \r\n"
						+ "\r\n"
						+ "Por fim, o Guardião da Legislação Federal (STJ) estabeleceu que não há descaracterização da mora na hipótese de se reconhecer a invalidade de alguma das cobranças descritas nos itens anteriores. \r\n"
						+ "\r\n"
						+ "As tarifas/despesas individualizadas nos recursos repetitivos legitimam o consumidor a receber, de forma simples, e não dobrada (CDC, art. 42, parágrafo único), o que pagou indevidamente, independentemente da comprovação do erro, com correção monetária desde o efetivo desembolso (CC, art. 189) e juros de mora a partir da citação (CC, art. 219). \r\n"
						+ "\r\n"
						+ "Ademais, diante do pedido de repetição do indébito, também cabe ao magistrado verificar, inclusive de ofício, se tal pretensão restitutória estaria ou não alcançada pela prescrição (CPC, § 1º do art. 332 c/c o art. 332, inciso II), pois o Tribunal da Cidadania (STJ) estabeleceu a uniformização dos prazos prescricionais de ações de ressarcimento civil ou de enriquecimento sem causa em três anos. \r\n"
						+ "\r\n"
						+ "Com efeito, o Colendo STJ, também em sede de recurso repetitivo (REsp 1.360.969/RS e REsp 1.551.956/SP - CPC, art. 1.040 c/c art. 927, inciso III), concluiu que a pretensão restitutória, mesmo quando decorrente de uma relação de consumo, funda-se nos prazos estabelecidos pelo Código Civil - CC, pois o reembolso/devolução/repetição de valores decorrentes da declaração de inexistência ou invalidade de cláusula contratual submete-se ao prazo prescricional trienal previsto no art. 206, § 3º, inciso IV, do CC, estabelecido para direitos fundados no enriquecimento sem causa, referente às prestações pagas indevidamente no período de 3 (três) anos compreendido no interregno anterior à data da propositura da ação. \r\n"
						+ "\r\n"
						+ "Numa breve síntese: o referido precedente submetido ao regime jurídico das demandas repetitivas consolidou a jurisprudência da Corte (dentre outros: REsp 1.449.289/RS; REsp 1.220.934/RS; e REsp 1.249.321/RS) no sentido de não reconhecer a existência de fato do serviço (CDC, art. 14) e, via de consequência, atrair a prescrição quinquenal (CDC, art. 27), quando os danos alegados pelo consumidor estão vinculados ao âmbito das ações de ressarcimento em decorrência da declaração de inexistência, invalidade ou abusividade de cláusula contratual. \r\n"
						+ "\r\n"
						+ "Por fim, o Tribunal da Cidadania (STJ) firmou a diretriz de que o termo inicial de fluência do prazo prescricional corresponde à data em que ocorreu a efetiva lesão (CC, art. 189), ou seja, conta-se a partir do efetivo pagamento, razão pela qual, em se tratando de prestações de trato sucessivo, estarão prescritos todos os valores pagos indevidamente e que sejam anteriores aos 3 (três) anos do ajuizamento da demanda. \r\n"
						+ "\r\n"
						+ "Fixadas as teses, passa-se à apreciação do caso concreto. \r\n"
						+ "\r\n"
						+ "As tarifas/despesas questionadas, nos presentes autos, são as seguintes: “________________________” (ID __________________________). \r\n"
						+ "\r\n"
						+ "Os autos revelaram (ID _____________________________) que as tarifas/despesas impugnadas foram incorporadas e diluídas ao longo do financiamento em ___ (________) parcelas, sendo a primeira em ____________ e a última em ________________. \r\n"
						+ "\r\n"
						+ "A presente demanda foi proposta em ___________________, não sendo alcançada pelo prazo da prescrição trienal. \r\n"
						+ "\r\n"
						+ "A tarifa de “avaliação do veículo usado financiado” (___________________________) deve ser validada, segundo as diretrizes do STJ, porquanto, além de ter sido pactuada, foi provada a efetiva prestação do serviço.\r\n"
						+ " \r\n"
						+ "A tarifa de “Despachante” (___________________________) deve ser validada, segundo as diretrizes do STJ, porquanto, além de ter sido pactuada e adequadamente delimitada sua função, foi provada a efetiva prestação do serviço.\r\n"
						+ "\r\n"
						+ "O “Seguro Prestamista” (_______________________) não pode ser validado, pois a cláusula contratual impôs ao consumidor uma venda casada, ao vincular a contratação à seguradora indicada pela instituição bancária. \r\n"
						+ "\r\n"
						+ "A tarifa de “Serviços de terceiros” (_______________________) não pode ser validada, pois a cláusula contratual possui natureza genérica, não informando adequadamente a sua função, sendo, portanto, considerada inválida, nos termos do repetitivo mencionado. \r\n"
						+ "\r\n"
						+ "A tarifa de “Despesas” (_______________________) não pode ser validada, pois a cláusula contratual possui natureza genérica, não informando adequadamente a sua função, sendo, portanto, considerada inválida, nos termos do repetitivo mencionado.\r\n"
						+ "\r\n"
						+ "A “Tarifa de Cadastro para início de relacionamento” (__________________________) é válida, na linha dos precedentes do Egrégio STJ, pois foi cobrada apenas para inaugurar o início do relacionamento entre o consumidor e a instituição financeira, bem assim o consumidor não evidenciou objetivamente onerosidade excessiva. \r\n"
						+ "\r\n"
						+ "Por derradeiro, a tarifa de “Registro contrato” (______________________) foi legitimada pelo STJ, e no caso concreto não há controvérsia de que o gravame foi registrado no órgão de trânsito, passando a constar no documento do veículo.";
			}
			else if(menuFundamentacao == 16) {
				textoFundamentacao = "Compulsando os documentos apresentados pelas partes e os pedidos formalizados, é possível constatar que o litígio versa sobre a ocorrência de vício no bem adquirido pelo demandante. \r\n"
						+ "\r\n"
						+ "O demandante aduz, em resumo, que o vício decorre de defeito oculto do aparelho, sendo cabível, portanto, o seu reparo ou troca, sem custos, por estar dentro do prazo de garantia. \r\n"
						+ "\r\n"
						+ "Por seu lado, o demandado defende o uso inadequado do consumidor, arrematando que tal conduta afasta a cobertura da garantia. \r\n"
						+ "\r\n"
						+ "Com efeito, as poucas provas produzidas durante a instrução processual, não foram adequadas e  capazes de aferir com a segurança mínima necessária se o defeito ocorrido no bem é decorrente de uso inadequado ou de vício oculto, demandando análise técnica acurada e específica para averiguar a natureza do defeito, cuja cognição e produção probatória são incompatíveis com o procedimento dos juizados especiais cíveis. \r\n"
						+ "\r\n"
						+ "A Lei nº 9.099/1995, ao instituir os Juizados Especiais Cíveis, trouxe a disciplina processual para o julgamento e execução das causas por ela consideradas como de “menor complexidade”. \r\n"
						+ "\r\n"
						+ "Nessa esteira, não é de sua competência as causas em que a complexidade exija uma apuração probatória mais dilatada, ou melhor, quando a causa apresentar complexidade incompatível com a índole do procedimento ou demandar a realização de perícia técnica, tal como é o caso do presente processo. \r\n"
						+ "\r\n"
						+ "O fato é que existe vedação expressa da Lei de regência dos Juizados quanto à matéria ventilada, vejamos a redação do art. 3º, “in verbis”: \r\n"
						+ "\r\n"
						+ "“Art. 3º O Juizado Especial Cível tem competência para conciliação, processo e julgamento das causas cíveis de menor complexidade, assim consideradas: (...). \r\n"
						+ "\r\n"
						+ "Como consectário, não comportando esta justiça especializada a possibilidade de determinar a realização de perícia (artigos. 464 e seguintes do CPC), a solução é a extinção prematura do feito. ";
			}
			else if(menuFundamentacao == 17) {
				textoFundamentacao = "Com efeito, da análise dos elementos probatórios acostados aos autos, percebe-se que o autor foi vítima de estelionato ao transferir valores inadvertidamente para contas de terceiro, a partir de simples solicitação por rede social. \r\n"
						+ "\r\n"
						+ "Note-se que sequer seria o caso de se aplicar o enunciado da súmula 479 do Egrégio Superior Tribunal de Justiça – STJ, no sentido de que as instituições financeiras ou de seguros respondem objetivamente pelos danos gerados por fortuito interno a fraudes e delitos praticados por terceiros no âmbito de suas atividades. \r\n"
						+ "\r\n"
						+ "Em verdade, ninguém poderia garantir que o golpe de que fora vítima o demandante teria sido evitado. O motivo é simples: foi a própria vítima, ante a sua inabilidade e ingenuidade, quem deu causa ao seu infortúnio, sem que tenha havido qualquer coação por parte dos agentes criminosos, tal como destacado na exordial. \r\n"
						+ "\r\n"
						+ "Ao que se vê dos autos, faltou cautela ou, no mínimo, experiência por parte do autor. Ninguém transfere dinheiro, para conta de terceiro desconhecido, por simples pedido de realizado através de rede social de pessoa conhecida, principalmente por não estar em contato direto com o solicitante. \r\n"
						+ "\r\n"
						+ "Em outras palavras, ainda que se mitigasse a culpa do consumidor, como causa de exclusão da responsabilidade civil, seria o fato de reconhecer a culpa exclusiva de terceiros alheios à atividade da empresa, pelo qual também ficaria eliminada a relação de causalidade em relação ao fato imputado à parte demandada. \r\n"
						+ "\r\n"
						+ "Numa breve síntese: comprovada a excludente de responsabilidade civil, por parte do prestador de serviço, a improcedência da demanda é de rigor. ";
			}
			else if(menuFundamentacao == 18) {
				textoFundamentacao = "O demandante, na exordial, alegou e provou a realização de vários descontos em seu contracheque, relativos a cartão de crédito consignado (____________), no entanto, afirma que não celebrou o referido contrato, nem reconhece o débito, principalmente porque o demandante alega não possuir qualquer relação com o Réu.\r\n"
						+ "\r\n"
						+ "O demandado, de outra parte, alegou que “_______________________” (ID _______________), sem, contudo, acostar qualquer documento ou o instrumento contratual capaz de evidenciar a existência da relação jurídica em questão e legitimar o débito impugnado, o que, em outras palavras, demonstra a existência de falha na prestação do serviço.\r\n"
						+ "\r\n"
						+ "Outra não é a diretriz do Egrégio Tribunal de Justiça de Pernambuco, segundo enuncia a súmula 132: “É presumida a contratação mediante fraude quando, instado a se manifestar acerca da existência da relação jurídica, deixa o réu de apresentar o respectivo contrato”.\r\n"
						+ "\r\n"
						+ "Ora, sendo induvidosa a (i) a falha na prestação do serviço, bem assim a (ii) presença de um liame de causa e efeito entre a deficiência do serviço ofertado pelo demandado e os danos reivindicados pelo demandante, não há como negar a caracterização, em tese, da responsabilidade civil, bem como o reconhecimento da ilegitimidade da dívida exigida e, ainda, a necessidade de uma tutela jurisdicional capaz de providenciar que a instituição financeira se abstenha de cobrar os valores indevidos ao consumidor.";
			}
			else if(menuFundamentacao == 19) {
				textoFundamentacao = "Com efeito, diante do quadro fático e probatório, percebe-se que o contratos impugnado foi efetivamente celebrado pelo demandante, evidenciando a devida contratação, onde restaram claramente descritos ao consumidor todos os valores envolvidos na contratação do serviço.\r\n"
						+ "Ademais, em audiência, o autor reconheceu a assinatura nos contratos, evidenciando a contratação, onde restaram claramente descritos ao consumidor todos os valores envolvidos na contratação do serviço.  \r\n"
						+ "\r\n"
						+ "Desta forma, lícita se afigura a cobrança dos valores impugnados pelo demandante, haja vista estarem devidamente contratados, estando o demandante prévia e adequadamente informado, nos termos impostos pelo art. 52 do CDC. \r\n"
						+ "\r\n"
						+ "Numa breve síntese, comprovada a excludente de responsabilidade civil, por parte do prestador de serviços, a improcedência da demanda é de rigor. ";
			}
	}
}
		public String getTextoFundamentacao() {
			return textoFundamentacao;
		}

}