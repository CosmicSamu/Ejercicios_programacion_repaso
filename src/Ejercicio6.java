//Suma los números  introducidos en posiciones pares, y en las impares
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame una serie de numeros, que no empiece por 0 y que para que termine tiene que tener 0");
		int numero=teclado.nextInt();
		int contador=1;
		int sumaPares=0;
		int sumaImpares=0;
		
		if (numero==0) {
			System.out.println("La cadena no puede empezar por 0");
			
		}
		else {
			do {
				if(contador % 2 ==0) {
					sumaPares+=numero;
				}
				else {
					sumaImpares+=numero;
				}
				numero=teclado.nextInt();
				contador++;
					
				
			}while(numero!=0);
			System.out.println("La suma de los numeros en posicion par es: " + sumaPares);
			System.out.println("La suma de los numeros en posicion impar es: " + sumaImpares);
		}
	}

}
