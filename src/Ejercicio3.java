import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un n�mero positivo");
		int numero =teclado.nextInt();
		int divisor=0;
		
			if(numero<0) {
				System.out.println("N�mero no v�lido");
			}
			else {
				for(int i=1;i<numero;i++) {     
			
					if(numero%i==0) {
						divisor+=i;
						System.out.println("Los divisores propios son: " + divisor);
					}
				}
			}
		}
	}
