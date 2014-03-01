package pucrs.alpro2;

import java.util.Scanner;

public class SomadorApp {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Somador: \n");
		
		Somador s = new Somador();
		s.setA(teclado.nextInt());
		s.setB(teclado.nextInt());
		System.out.println(s.getSoma());

		teclado.close();
	}
}
