package t2ex1;

import java.util.Scanner;

public class T2ex11 {

	public static void main(String[] args)
	{
	double price = 10.00;
	int age;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Enter your age: ");
	age = keyboard.nextInt();
	//code to reduce ticket price for children goes here
	
	System.out.println("Ticket price = " + (price/2));
	}

}
