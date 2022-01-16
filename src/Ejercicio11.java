/*
 Dado un numero N imprimir la lista de todos los numero primos hasta dicho numero N.
 */
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un número positivo ");
		int numero=teclado.nextInt();
		boolean primo =true;
		if(numero==1) {
			System.out.println("El número tiene que ser positivo");
		}
		else {
			for(int i=1;i<numero;i++) { // numeros anteriores hasta el número
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						primo=false;
					}
				}
				if(primo==true) {
					System.out.println(i);
				}
				primo=true;
			}
		}

	}

}
