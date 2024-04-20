package exercicios;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		int peso = entrada.nextInt();
		System.out.println("Digite sua altura em cm: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow((altura/100) , 2);
		
		if (imc < 16) {
			System.out.printf("Seu IMC é de %.2f e sua classificação é Magreza grau III.", imc );
		}else if (imc >= 16 && imc < 17) {
			System.out.printf("Seu IMC é de %.2f e sua classificação é Magreza grau II.", imc);
		}else if (imc >= 17 && imc < 18.5) {
			System.out.printf("Seu IMC é de %.2f e sua classificação é Magreza grau I.", imc );
		}else if (imc >= 18.5 && imc < 25) {
			System.out.printf("Seu IMC é de %.2f e sua classificação é Eutrofia.", imc);
		}else if (imc >= 25 && imc < 30) {
			System.out.printf("Seu IMC é de %.2f e sua classificação é Pré-obesidade.", imc);
		}else if (imc >= 30 && imc < 35) {
			System.out.printf("Seu IMC é de %.2f e sua classificação é Obesidade moderada(Grau I).", imc);
		}else if (imc >= 35 && imc < 40) {
			System.out.printf("Seu IMC é de %.2f e sua classificação é Obesidade severa(Grau II).", imc);
		}else {
			System.out.printf("Seu IMC é de %.2f e sua classificação é Obesidade muito severa(Grau III).", imc);
		}
	}

}
