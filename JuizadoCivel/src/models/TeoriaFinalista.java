package models;

import java.util.Scanner;

public class TeoriaFinalista {

	Scanner scan = new Scanner(System.in);
	
	//atributos teoria finalista
	
	private int menuTeoriaFinalista;
	private String textoTeoriaFinalista;

	//escolha do texto teoria finalista
		{
			{
		System.out.println("É hipótese de consumo conforme teoria finalista?\n");
		System.out.println("1 - Sim\n"
				+ "2 - Não\n");
				menuTeoriaFinalista = scan.nextInt();
	
			if(menuTeoriaFinalista == 1) {
				textoTeoriaFinalista = "Conforme a jurisprudência firmada pelo Colendo Superior Tribunal de Justiça - STJ, o critério adotado para determinação da condição de consumidora da pessoa é o finalista, de modo que para caracterizar-se como consumidora a pessoa física ou jurídica deve ser destinatária final econômica do bem ou serviço adquirido. No caso dos autos, o demandante reconheceu que o serviço contratado teve o propósito de fomento da atividade empresarial exercida, não havendo, em princípio, relação de consumo entre as partes (Código de Defesa do Consumidor - CDC, artigos 2º e 3º). Contudo, o STJ (dentre outros: AgRg no AREsp n. 646466/ES) também tem mitigado os rigores da teoria finalista para autorizar a incidência do CDC nas hipóteses em que a parte (pessoa física ou jurídica), embora não seja tecnicamente a destinatária final do produto ou serviço, se apresente em situação de vulnerabilidade, tal como ocorre na hipótese dos autos.";
			}
			else {
				textoTeoriaFinalista = "";
			}
	}
}
		public String getTextoTeoriaFinalista() {
			return textoTeoriaFinalista;
		}

}
