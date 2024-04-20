package aulasJava;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int vetor[] = new int[10];
		
		vetor[0] = 10;
		vetor[0] = 5;
		vetor[0] = 3;
		
		for(int x = 3; x < 10; x++) {
			System.out.println("Digite um número: ");
			vetor[x] = entrada.nextInt();
		}

		for(int x = 0; x < 10; x++) {
			System.out.println("Olá eu sou o nº " + vetor[x] + " e estou na posição: " + x);
		}
	}

}
