package part2basicex;

import java.util.Scanner;

public class Part2basicex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear scanner
		Scanner keyboard = new Scanner(System.in);
		
		// declare variables
		int x, y, de;
		// enter values
		System.out.print("Enter value for x ");
		
		x = keyboard.nextInt();
		System.out.print("Enter value for y ");
		y = keyboard.nextInt();
		// code attempting to swap two variables
		de = x;
		x = y;
		y = de;
		
		//display results
		System.out.println("x = " + x);
		System.out.println("y = " + y);

			
	}

}
