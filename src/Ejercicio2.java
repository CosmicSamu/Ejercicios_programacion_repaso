import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un n�mero entero");
		int numero=teclado.nextInt();
		int resultado=0;
		
			if(numero<0 || numero>10) {
				System.out.println("N�mero no v�lido");
				
			}
			else {
				for(int i=1;i<=10;i++) {
					resultado=numero*i;
					System.out.println( numero + "*"+ i + "=" + resultado );
					
				}
			}

	}

}
