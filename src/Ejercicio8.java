// Realiza el factorial de un número
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un número positivo");
		int numero=teclado.nextInt();
		int factorial=1;
		
		if (numero==0) {
			System.out.println("Número no válido");
		}
		else {
			for(int i =1;i<=numero;i++) {
			factorial = factorial*i;
		}

		}
		System.out.println("El factorial del numero es " + factorial);
	}
}
