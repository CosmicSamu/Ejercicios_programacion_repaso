// Realiza el factorial de un n�mero
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un n�mero positivo");
		int numero=teclado.nextInt();
		int factorial=1;
		
		if (numero==0) {
			System.out.println("N�mero no v�lido");
		}
		else {
			for(int i =1;i<=numero;i++) {
			factorial = factorial*i;
		}

		}
		System.out.println("El factorial del numero es " + factorial);
	}
}
