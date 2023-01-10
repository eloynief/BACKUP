package ejerciciooca;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//variable para dar 
		int tirada1, tirada2;
		//nombre de los jugadores
		String nomj1,nomj2;
		
		//creación de scanner
		Scanner sc= new Scanner(System.in);
		
		//abrir una conexión con otro archivo dentro de su mismo paquete
		Funciones sc1= new Funciones();
		//print del mensaje para introducir las fichas
		System.out.println("Escribe las fichas: ");
		
		
		
		
		//introducimos el valor del primer dado
		tirada1=sc.nextInt();
		//introducimos también el valor del segundo dado
		tirada2=sc.nextInt();

		//hace print del static int del otro archivo
		System.out.println(Funciones.tamcircuito);
		
		//
		System.out.println(Funciones.fichaj1());
		
		//
		System.out.println(Funciones.fichaj2());
		
	}

}
