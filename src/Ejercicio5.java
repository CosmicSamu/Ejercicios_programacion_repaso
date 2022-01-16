import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame una serie de numeros, que no empiece por 0 y que para que termine tiene que tener 0");
		int numero =teclado.nextInt();
		int suma=0;
		int contador=0;
		
		if(numero==0) {
			System.out.println("La cadena no puede empezar por 0");
		}
		else {
			do {
				suma = suma+numero;
				contador ++;
				numero = teclado.nextInt(); //pedimos el siguiente número
				
				
			}
			while (numero!=0) ;
			System.out.println("La suma de los números es :" + suma);
			System.out.println("Hay " + contador + " numeros" );
				
			}
			
		}
		

	}


