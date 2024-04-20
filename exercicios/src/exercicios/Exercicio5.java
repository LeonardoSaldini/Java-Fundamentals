package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dois números e verifique qual número é maior");
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int numero3 = entrada.nextInt();
		
		// numero1 >= numero2 e > numero3
		// numero2 >= numero1 e > numero3
		// numero3 >= numero1 e > numero2
		//  numero1 = numero2 e = numero3
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O " + numero1 + " é o maior valor.");
		}else if(numero2 > numero1 && numero2 > numero3) {
			System.out.println("O " + numero2 + " é o maior valor.");
		}else if(numero3 > numero1 && numero3 > numero2) {
			System.out.println("O " + numero2 + " é o maior valor.");
		}else {
			System.out.println("Os números são iguais.");
		}
				
		

	}

}
