package exercicios;

import java.util.Scanner;

public class ExercicioTabuada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("===================================\n\tTabuada\n===================================");
		
		while(true) {
			System.out.println("Digite um número para ver sua tabuada: ");
			int numero = entrada.nextInt();
			int x;
			for(x = 0; x < 11 ; x +=1 ) {
				int resultado = numero * x;
				System.out.printf("%s X %s = %s", numero, x, resultado);
				System.out.println();
				}
			
			System.out.println("Deseja ver a tabuada de outro número?\nDigite 1 para continuar e 2 para sair.");
			int opcao = entrada.nextInt();
			if (opcao == 2) {
				break;
				}
			}
		}

}


