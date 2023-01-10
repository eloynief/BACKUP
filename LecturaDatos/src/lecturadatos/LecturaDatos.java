package lecturadatos;

import java.util.Scanner;

public class LecturaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("put a number: ");
		Scanner fgfg = new Scanner(System.in);
		double number = fgfg.nextDouble();
		System.out.print(number);
		//warning fgfg is not closed
		fgfg.close();
	}

}
