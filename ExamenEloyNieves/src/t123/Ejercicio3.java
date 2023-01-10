package t123;

import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*variable para introducir las unidades y variable del menú*/
		int uni=0, num=0;
		/*crear variables "double" para que tanto el precio como
		sus máximos, mínimos y total se muestren y calcules con decimales*/
		double precio=0, cont=0, max=0, min=Integer.MAX_VALUE;
		
		/*crear variable tipo "String" la cual será
		el nombre del producto que queremos introducir*/
		String nombreproducto;
		

		//crear Scanner para que pueda leer los valores que el usuario vaya a introducir
		Scanner sc = new Scanner(System.in);
		
		//Le pedimos al usuario el nombre del producto
		System.out.println("Introduce el nombre del producto: ");
		
		//El usuario escribe el producto utilizando este comando
		nombreproducto = sc.next();
		
		//si el usuario NO nos contesta "0" en el nombre del producto
		while(!nombreproducto.equals("0")) {
			
			//nos muestra en pantalla que introduzcamos las unidades
			System.out.println("Introduce las unidades: ");
			
			//el usuario escribe las unidades del producto mencionado
			uni = sc.nextInt();
			
			//nos pide que pongamos el precio
			System.out.println("Introduce el precio: ");
			
			//el usuario escribe el precio de esas unidades
			precio = sc.nextDouble();
			
			//si el valor de las unidades y el del precio es positiva
			if (uni>=0&&precio>=0) {
				
				/*valor de la variable la cual representará el total
				de los precios introducidos*/
				cont=(cont+precio+(precio*21/100)-(precio*5/100))*uni;
				
				//Le pedimos al usuario el número para saber el tamaño del triángulo
				System.out.println("Introduce el nombre del producto: ");
				
				/*si el precio es mayor que el valor máximo que tenga, entonces 
				el valor maximo se iguala al precio*/
				if (precio>max) {
					//igualación del precio máximo con el precio
					max=precio;
				}
				
				/*si el precio es menor que el mínimo, entonces el valor mínimo
				obtiene el valor de ese precio hasta que se escriba un precio más pequeño*/
				if (precio<min) {
					//igualación del precio mínimo con el precio introducido
					min=precio;
				}
					
				
				//El usuario escribe el número utilizando este comando
				nombreproducto = sc.next();
				
				//para que nos muestre el menú, tenemos que mostrar en pantalla que introduzca un número
				System.out.println("Introduzca un número: ");
				
				//el usuario escribe el número del menú para que escoga entre las 3 opciones
				num = sc.nextInt();
				
				//si el valor es 1
				if(num==1) {
				//muestra en pantalla el precio total
				System.out.println(cont);
				}
				
				//si el valor introducido es 2
				else if(num==2) {
				//muestra en la pantalla el precio máximo
				System.out.println(max);
				}
				
				//si es 3
				else if(num==3) {
				//muestra en pantalla el precio mínimo
				System.out.println(min);
				}
				
			}
			
			//si el valor de las unidades o el del precio es negativa
			else {
				//terminar bucle
				break;
			}
		}
		//cierre de Scanner
		sc.close();
	}

}
