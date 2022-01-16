import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un número entero");
		int A=teclado.nextInt();
		System.out.println("Dame otro número entero");
		int B=teclado.nextInt();
		int suma=0;
		
		
			
			if(A <0 && B <0) {
				System.out.println("Número no válido");
			}
			else {
				for(int contador = A+1;contador<B;contador++) {
					
					suma+= contador;
					
				}
				System.out.println("La suma es: "+ suma);	
				
			}
			
	}

}
