package models;

import java.util.Scanner;

public class PedidoPrincipal {
	
	private String textoPedidoPrincipal;
	Scanner scan = new Scanner(System.in);
	{
	System.out.println("Informe o pedido: ");
	textoPedidoPrincipal = scan.nextLine();
	}
	public String getTextoPedidoPrincipal() {
		return textoPedidoPrincipal;
	}
}