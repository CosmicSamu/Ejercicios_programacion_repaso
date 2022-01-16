import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un número positivo mayor que dos");
		int numero =teclado.nextInt();
		boolean primo=true;
		
			
			if(numero<0 || numero<=2) {
				System.out.println("Número no válido");
			}
			else {
				for(int i=2;i<numero;i++) {
					if(numero%i==0) {
						primo=false;
						}
					}
				if(primo==false) {
					System.out.println("El número no es primo");
				}
				else {
					System.out.println("El número es primo");
				}
			}
		}
	}


	

