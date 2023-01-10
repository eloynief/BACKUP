package part2basicex;

import java.util.Scanner;

public class Part2basicex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int num1, num2;
		num2 = 6;
		System.out.print("Enter value ");
		num1 = keyboard.nextInt();
		num1 = num1 + 2;
		num2 = num1 / num2;
		System.out.println("result = " + num2);
		System.out.println();
		System.out.println("If you enter the number 10, the result is 2");
		

	}

}
