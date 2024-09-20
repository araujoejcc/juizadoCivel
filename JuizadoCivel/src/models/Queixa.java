package models;

import java.util.Scanner;

public class Queixa {
	
	private String textoQueixa;
	Scanner scan = new Scanner(System.in);
	{
	System.out.println("Informe a queixa: ");
	textoQueixa = scan.nextLine();
	}
	public String getTextoQueixa() {
		return textoQueixa;
	}
}
