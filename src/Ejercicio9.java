// Te dice si un n�mero es perfecto o no
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un n�mero positivo");
		int numero=teclado.nextInt();
		int contadorDiv=0;
			
			if(numero<0) {
				System.out.println("Numero no v�lido ");
			
			}
			else {
				for(int i=1;i<numero;i++) { //Encontramos los divisores propios, en este caso empezamos con el dos porque nos interesa normalmente empezariamos por 2 para encontar los divisores propios
					if(numero%i==0) {
						contadorDiv+=i;
					}
				}
			}
			
			if(contadorDiv  ==numero) {
				System.out.println("El n�mero es perfecto");
			}
			else {
				System.out.println("El n�mero no es perfecto");
			}
		
		

	}

}
