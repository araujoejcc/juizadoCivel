package models;

import java.util.Scanner;

public class TipoDeJulgamento {

	
	Scanner scan = new Scanner(System.in);
	
	//atributos tipos de julgamento
	
	private int menuTipoDeJulgamento;
	private String textoTipoDeJulgamento;

	//escolha do texto tipo de julgamento
		{
			{
		System.out.println("Escolha o tipo de julgamento: \n");
		System.out.println("1 - Improcedente\n"
				+ "2 - Procedente\n"
				+ "3 - Procedente em parte\n"
				+ "4 - Extinção sem resolução do mérito\n");
				
				menuTipoDeJulgamento = scan.nextInt();
	
			if(menuTipoDeJulgamento == 1) {
				textoTipoDeJulgamento = "Ante todas as razões expostas, lastreado no art. 487, inciso I, do CPC, JULGO IMPROCEDENTE A DEMANDA.";
			}
			else if(menuTipoDeJulgamento == 2) {
				textoTipoDeJulgamento = "Ante todas as razões expostas, lastreado no art. 487, inciso I, do CPC, JULGO PROCEDENTE A DEMANDA, no sentido de ";
			}
			else if(menuTipoDeJulgamento == 3) {
				textoTipoDeJulgamento = "Ante todas as razões expostas, lastreado no art. 487, inciso I, do CPC, JULGO PARCIALMENTE PROCEDENTE A DEMANDA, no sentido de ";
			}
			else if(menuTipoDeJulgamento == 4) {
				textoTipoDeJulgamento = "Juizado, julgo EXTINTO o processo, sem resolução do mérito, na forma do art. 51. inciso ________ , da Lei nº 9.099/1995.";
			}
	}
}
		public String getTextoTipoDeJulgamento() {
			return textoTipoDeJulgamento;
		}

}