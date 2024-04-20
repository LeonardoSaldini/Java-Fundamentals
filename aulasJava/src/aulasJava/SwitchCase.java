package aulasJava;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a opção desejada: ");
		System.out.println("1 - Pizzas");
		System.out.println("2 - Lanches");
		System.out.println("3 - Espetos");
		System.out.println("4 - Frango frito");
		int opcao = entrada.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Você escolheu Pizza!");
			break;
		case 2:
			System.out.println("Você escolheu Lanches!");
			break;
		case 3:
			System.out.println("Você escolheu Espetos!");
			break;
		case 4:
			System.out.println("Você escolheu Frango Frito");
			break;
		}
		System.out.println("Fim!");
	}

}