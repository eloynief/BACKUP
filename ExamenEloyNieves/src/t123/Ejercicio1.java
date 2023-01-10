package t123;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*creación de Scanner para poder guardar los valores 
		que quiera introducir el usuario*/
		Scanner sc = new Scanner(System.in);
		
		//Creación de variables
		int num= 0, line = 0, space = 0, aster = 0;
		
		//Le pedimos al usuario el número para saber el tamaño del triángulo
		System.out.println("Introduce un número: ");
		
		//El usuario escribe el número utilizando este comando
		num = sc.nextInt();
		
		/*Bucle for el cual aumentará el número de líneas hasta que la variable "line"
		sea mayor que el número que introduzcamos*/
		for(line=0;line<=num;line++) {
			
			/*Este bucle hace print de un espacio cuando la
			variable "aster" (asterisco) es menor que "line"*/
			for(space=0;space<=line;space++) {
				
				/*si el bucle for es verdad, este hará print de un espaciado*/
				System.out.print(" ");
				
			}

			
				/*Este bucle hace que haga print de la forma mientas que
				"space" sea menor que la resta de num y "line"*/
				for(aster=0;aster<num-line;aster++) {
					
					/*si aster es 1, line es mayor o igual que 1 y aster
					es menor que el número menos el espacio
					se cumple la condición*/
					if(aster>=1&&aster<num-space&&line>0){
						
						/*si se cumple la condición, entonces 
						se añadirá un espaciado*/
						System.out.print("  ");
					}
					
					/*si lo mencionado anteriormente es falso, se añade 
					un asterisco*/
					else{
						
						System.out.print("* ");	
					}
				}
				
			/*print que nos enviará a la siguiente línea una vez 
			acabado con los bucles anteriores*/
			System.out.println();
		}
		//acabamos con el cierre del Scanner
		sc.close();
	}

}
