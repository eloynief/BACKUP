package ex2bas;

import java.util.Scanner;

public class Ex2Bas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear variables
		int a;
		boolean mayor;
		
		//crear scanner
		Scanner j = new Scanner(System.in);
		
		//print de mensaje
		System.out.print("Introduce tu edad");
		
		// dar valor a variables
		a = j.nextInt();
		mayor = a >= 18;
		
		//aparece en la pantalla el texto
		System.out.print("Sos mayor o no? " + mayor);
		
		//cerrar scanner
		j.close();
		
	}

}
