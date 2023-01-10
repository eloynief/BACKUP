package ex2bas;

import java.util.Scanner;

public class Ex2Bas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear variables
		boolean lluvia,biblioteca,calle,respuesta;
				
				//crear scanner
				Scanner j = new Scanner(System.in);
		
		System.out.print("llubia ");
		lluvia = j.nextBoolean();
		
		System.out.print("vivlioteka ");
		biblioteca = j.nextBoolean();
		
		System.out.print("kaye ");
		calle = j.nextBoolean();
		
		respuesta = lluvia && calle && !biblioteca;
		System.out.print(respuesta);
		
	}

}
