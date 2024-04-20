package aulasJava;

import java.util.Scanner;
import java.util.random.*;

public class Ifelse {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resposta = 15;
		
		System.out.println("Digite um número entre 0 e 10: ");
		int x =  entrada.nextInt();
		
		if (x == resposta) {
			System.out.println("Parabéns, você acertou!");
		}else if (x > resposta) {
			System.out.println("O número que você digitou é maior que o número secreto.");
		}else {
			System.out.println("O número que você digitou é menor que o número secreto.");
		}
		System.out.println("Saiu do If");

	}

}
