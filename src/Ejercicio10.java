// Da el primo m�s cercano por exceso
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Dame un n�mero positivo");
		int numero=teclado.nextInt();
		boolean primo=true;
		
		numero=numero+1; // Esto es muy importante porque nos interesan los siguntes n�meros a el introducido
		
		while(primo==true) {	
			for(int i=2;i<numero;i++) {
				if(numero%i==0) {
					numero++;
				}
			}
				primo=false;
				int esPrimo=numero;
	}
		System.out.println("N�mero primo por exceso " + numero);
	}
}






