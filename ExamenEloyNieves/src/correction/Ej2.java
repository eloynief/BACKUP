package correction;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		int num, numpares=0, numimpares=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Escribe el numero n:");
		num=sc.nextInt();
		while(num!=0) {
			//se da por la ultima cifra del numero. si es par, entonces se ejecuta esto
			if(num%2==0){
				numpares++;
			}
			//si la ultima cifra es impar entonces se ejecuta esto
			else {
				numimpares++;
			}
			//divide entre 10 para que el ultimo numero desaparezca
			num=num/10;
			
		}
		System.out.println(numimpares);
		System.out.println(numpares);
	}

}
