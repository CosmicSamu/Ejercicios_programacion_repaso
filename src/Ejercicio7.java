/*
Escribir un programa que lea una secuencia de datos numéricos de longitud indefinida, de
manera que cuando el número sea el cero cesará la entrada de dicha secuencia. El programa
debe imprimirnos la media de todos ellos, el mayor y el menor.
 */

import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		System.out.println("Dame una serie de numeros enteros que no empiece por 0. El programa acabara cuando se introduzca un 0."); 	
		int numero = teclado.nextInt();
		int nuevo = 0;
		int menor = 0;
		int mayor = 0;
		int mayorSupremo = 0;
		int menorSupremo = 999;
		int suma = numero;
		int contador = 1;
		
		if (numero == 0) {
			System.out.println("El primer numero no puede ser 0.");
		}
		else {
			do {
				nuevo = teclado.nextInt();
				if (numero != 0 && nuevo != 0) {
					suma = suma + nuevo;
					if(nuevo > numero && nuevo != 0) {
						mayor = nuevo;
						menor = numero;
					}
					else {
						mayor = numero;
						menor = nuevo;
					}
					if (mayor > mayorSupremo) {
						mayorSupremo = mayor;
					}
					if ( menor < menorSupremo) {
						menorSupremo = menor;
					}
				
					contador++;
					numero = nuevo;
				
				}
			}while(nuevo != 0);
		}
		int media = suma/contador;
		System.out.println("La media total es: " + media + ". El numero mayor es: " + mayorSupremo + ". El numero menor es: " + menorSupremo + ".");
	
	}

}