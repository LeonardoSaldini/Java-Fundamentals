package exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite dois números e verifique qual número é maior");
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int numero2 = entrada.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("O " + numero1 + " é maior que " + numero2);
		}else if(numero1 < numero2) {
			System.out.println("O " + numero2 + " é maior que " + numero1);
		}else{
			System.out.println("Os números são iguais!");
		}		
		

	}

}
