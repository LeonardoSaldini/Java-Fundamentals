package exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número é par!");
		}else {
			System.out.println("O número é ímpar!");
		}
		
	}
}
