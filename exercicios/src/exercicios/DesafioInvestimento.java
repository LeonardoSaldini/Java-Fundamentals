package exercicios;

import java.util.Scanner;

public class DesafioInvestimento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		while(true) {
			
			System.out.println("Digite o valor inicial do investimento: ");
			double valorInicial = entrada.nextDouble();

			
			System.out.println("Digite o valor da taxa de juros: ");
			double taxaDeJuros = entrada.nextDouble();
			
			System.out.println("Digite o valor do depósito mensal: ");
			double depositoMensal = entrada.nextDouble();
			
			double valorAcumulado = valorInicial;
			
			for(int periodo = 1; periodo <= 12; periodo ++) { 	
				System.out.printf("O Valor acumulado no %sº mês será de R$: %.2f\n", periodo, valorAcumulado);
				valorAcumulado = valorAcumulado + (valorAcumulado * taxaDeJuros / 100) + depositoMensal;
			}
			
			System.out.println();
			System.out.println("Deseja fazer outra simulação? \n1 - Sim \n0 - Sair");
			int opcao = entrada.nextInt();
			if (opcao == 0) {
				break;
			}else if( opcao != 1 & opcao != 0) {
				System.out.println();
				System.out.println("Opção inválida! Digite\n1 - Fazer outra simulação.\n0 - Sair.");
			}
			
		

		
		}

	}
}
