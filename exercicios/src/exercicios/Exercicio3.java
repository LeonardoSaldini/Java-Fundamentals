package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculadora");
		System.out.println("Digite o primeiro valor: ");
		int numero1 = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Digite o operador (+, -, *, /): ");
		String operador  = entrada.nextLine();
		System.out.println("Digite o segundo valor: ");
		int numero2 = entrada.nextInt();
		
		switch (operador) {
		case "+":
			System.out.println("O resultado é: " + (numero1 + numero2));
			break;
		case "-":
			System.out.println("O resultado é: " + (numero1 - numero2));
			break;
		case "*":
			System.out.println("O resultado é: " + (numero1 * numero2));
			break;	
		case "/":
			System.out.println("O resultado é: " + (numero1 / numero2));
			break;
		default:
			System.out.println("O valor inválido, digite um operador (+, -, *, /): ");
			break;
			
		}

	}

}
