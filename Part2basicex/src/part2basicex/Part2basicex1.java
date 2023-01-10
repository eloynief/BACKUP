package part2basicex;

import java.util.Scanner;

public class Part2basicex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Crear scanner para poder leer valores
		Scanner keyboard = new Scanner(System.in);
		
		//Crear variable de número entero. En este caso la variable se llama YEAR
		final int YEAR = 2022;
		
		//crear variables int
		int age, BornIn;
		
		//Print de un mensaje que dice que cuantos años tienes este año
		System.out.print("How old are you this year? ");
		
		//Crear la variable que será la edad que vayamos a introducir
		age = keyboard.nextInt();
		
		//Dar el valor de la variable hecha
		BornIn = YEAR - age;
		
		//print del resultado
		System.out.println("I think you were born in " + BornIn);
		
	}

}
