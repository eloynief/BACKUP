package ex2bas;

import java.util.Scanner;

public class Ex2Bas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear variables
		int a;
		int b;
		boolean m;
		
		//crear scanner
		Scanner j = new Scanner(System.in);
		
		//print de mensaje
				System.out.print("Introduce tu edad");
		
		//asignar valores a las variables
		a = j.nextInt();
		m = a%2 == 0;
		
		System.out.print(m);
		
	}

}
