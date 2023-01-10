package ejercicios;

import java.util.Scanner;
/*
 * @class
 */
public class Ejercicio1 {
	/*
	 * @Clave
	 */
	public static final int CLAVE=8888;
	
	public static void main(String[] args) {
		

		final Scanner s = new Scanner(System.in);

		int intentos = 4;
		int numeroIntroducido;
		boolean acertado = false;

		do {
			System.out.print("Introduzca la clave de la caja fuerte: ");
			numeroIntroducido = s.nextInt();
			
			if (numeroIntroducido == CLAVE) {
				acertado = true;
			} else {
				System.out.println("Clave incorrecta");
			}

			intentos--;

		} while (intentos > 0 && !acertado);

		if (acertado) {
			System.out.println("Ha abierto la caja fuerte.");
		} else {
			System.out.println("Lo siento, ha agotado las 4 oportunidades.");
		}
		s.close();
	}
}
