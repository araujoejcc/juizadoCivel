package models;

import java.util.Scanner;

public class PedidoContraposto {
	
	Scanner scan = new Scanner(System.in);
	
	//atributos do Pedido contraposto
	
	private boolean temContraposto;
	private int escolhaContraposto;
	private String textoContraposto;

	//existência de danos materiais
		{
		System.out.println("Tem pedido contraposto? \n"
				+ "1 - Sim \n"
				+ "2 - Não");
		escolhaContraposto = scan.nextInt();
		
		if (escolhaContraposto == 1){
			temContraposto = true;
		}
		else if (escolhaContraposto == 2) {
			temContraposto = false;
		}
		else {
			System.out.println("Escolha inválida");
		}
		
		//informação do pedido contraposto
		{
		
		if (temContraposto == true) {
		System.out.println("Informe as alegações e o pedido contraposto: \n");
		textoContraposto = "O demandado, por seu lado, apresentou pedido contraposto, aduzindo que: "+ scan.next();
		}
		else {
		textoContraposto = "";
		}
}
}
		public String getTextoContraposto() {
			return textoContraposto;
		}
}