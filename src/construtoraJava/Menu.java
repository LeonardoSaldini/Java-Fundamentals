package construtoraJava;


import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Menu {

	public void menu() throws IOException {

		Scanner entrada = new Scanner(System.in);
		

		int controle = 1;

		//System.out.println("Olá! Seja bem-vindo(a) à Construtora Java!\n\n");
		JOptionPane.showMessageDialog(null, "Olá! Seja bem-vindo(a) à Construtora Java!");

		do {
			controle = Integer.parseInt(JOptionPane.showInputDialog(
			"Escolha qual das opções se enquadra com o seu cliente:\n" +
			"1 - Plantinha.\n" +
			"2 - Planta.\n" +
			"3 - Plantão.\n" +
			"0 - Sair\n"
			));
			
			

			switch (controle) {
			case 1:
				// Criar objeto da classe plantinha
				Plantinha apto1 = new Plantinha();
				// chamar o metodo mostrar detalhes
				apto1.mostrarDetalhes();
				
				int escolha1 = Integer.parseInt(JOptionPane.showInputDialog("\nDigite 1 para registrar a venda " + "ou 2 para ver outras opções:")); 
				if (escolha1 == 1) {
					String nome1 = JOptionPane.showInputDialog("Digite o nome do(a) cliente: "); 
					JOptionPane.showInternalMessageDialog(null, apto1.registrarVenda(nome1));
					String msg1 = apto1.gerarContrato(nome1);	
					JOptionPane.showInternalMessageDialog(null, msg1);
					}
				controle = 0;
				break;
			case 2:
				Planta apto2 = new Planta();
				apto2.mostrarDetalhes();
				
				int escolha2 = Integer.parseInt(JOptionPane.showInputDialog("\nDigite 1 para registrar a venda " + "ou 2 para ver outras opções:")); 
				if (escolha2 == 1) {
					String nome1 = JOptionPane.showInputDialog("Digite o nome do(a) cliente: "); 
					JOptionPane.showInternalMessageDialog(null, apto2.registrarVenda(nome1));
					String msg1 = apto2.gerarContrato(nome1);	
					JOptionPane.showInternalMessageDialog(null, msg1);
					}
				controle = 0;
				break;
			case 3:
				Plantao apto3 = new Plantao();
				apto3.mostrarDetalhes();
				
				int escolha3 = Integer.parseInt(JOptionPane.showInputDialog("\nDigite 1 para registrar a venda " + "ou 2 para ver outras opções:")); 
				if (escolha3 == 1) {
					String nome1 = JOptionPane.showInputDialog("Digite o nome do(a) cliente: "); 
					JOptionPane.showInternalMessageDialog(null, apto3.registrarVenda(nome1));
					String msg1 = apto3.gerarContrato(nome1);	
					JOptionPane.showInternalMessageDialog(null, msg1);
					}
				controle = 0;
				break;
			case 0:
				System.out.println("Você escolheu sair.");
				controle = 0;
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (controle != 0);
	}
}
