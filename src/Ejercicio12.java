/*
 Realizar un programa que elija mediante un menú un tipo de figura:

- Triángulo
- Cuadrado
- Rectángulo

Una vez elegida la opción nos pida en cada caso los datos necesarios para calcular su área y nos
la muestre.
 */

import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("1: Triangulo");
		System.out.println("2: Cuadrado");
		System.out.println("3: Rectangulo");
		System.out.println("Dame 1, 2 o 3.");
		int opcion = teclado.nextInt();
		int base = 0;
		int altura = 0;
		int area = 0;
		
		switch (opcion) {
		case 1:
			System.out.println("Dame la base");
			base = teclado.nextInt();
			System.out.println("Dame la altura");
			altura = teclado.nextInt();
			area = (base * altura) / 2;
			System.out.println("El area es: " + area);
			break;
		case 2 , 3:
			System.out.println("Dame la base");
			base = teclado.nextInt();
			System.out.println("Dame la altura");
			altura = teclado.nextInt();
			area = base * altura;
			System.out.println("El area es: " + area);
			break;
		default: System.out.println("Esa no es una opcion valida");
		}
		
		
	}

}