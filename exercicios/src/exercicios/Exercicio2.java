package exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Validador de notas");
		
		System.out.println("Digite a nota: ");
		int nota = entrada.nextInt();
		
		
		if (nota >= 7 && nota < 11) {
			System.out.println("Você passou !");
		}else if(nota < 7 && nota >= 5) {
			System.out.println("Você está de recuperação");
		}else if (nota < 5){
			System.out.println("Reprovado!");
		}else {
			System.out.println("Valor inválido, digite um número de 0 a 10:");
		}
		

	}

}
