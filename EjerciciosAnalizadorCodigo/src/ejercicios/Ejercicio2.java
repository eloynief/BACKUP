package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
	    
	    int numeroDeDigitos = 1, n, numeroIntroducido;

	    System.out.print("Introduzca un n�mero entero y le dir� cu�ntos d�gitos tiene: ");
	    numeroIntroducido = s.nextInt();
	    
	    n = numeroIntroducido;
	    
	    while (n > 10) {
	      n /= 10;
	      numeroDeDigitos++;
	    }
	    
	    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " d�gito/s.");
	    s.close();

	}
}
