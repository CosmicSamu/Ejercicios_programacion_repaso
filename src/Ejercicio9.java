// Te dice si un número es perfecto o no
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame un número positivo");
		int numero=teclado.nextInt();
		int contadorDiv=0;
			
			if(numero<0) {
				System.out.println("Numero no válido ");
			
			}
			else {
				for(int i=1;i<numero;i++) { //Encontramos los divisores propios, en este caso empezamos con el dos porque nos interesa normalmente empezariamos por 2 para encontar los divisores propios
					if(numero%i==0) {
						contadorDiv+=i;
					}
				}
			}
			
			if(contadorDiv  ==numero) {
				System.out.println("El número es perfecto");
			}
			else {
				System.out.println("El número no es perfecto");
			}
		
		

	}

}
