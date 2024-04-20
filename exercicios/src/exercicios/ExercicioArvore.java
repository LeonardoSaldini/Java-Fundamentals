package exercicios;

public class ExercicioArvore {

	public static void main(String[] args) {
		
		String letra = "X";
		
		for(int cont = 0; cont < 10; cont ++) {
			System.out.println(letra);
			letra = letra + "X";
		}
		
		for(int cont = 0; cont < 3; cont ++) {
			System.out.println("##");
		}
		
		for(int cont = 0; cont < 10; cont ++) {
			System.out.print("^");
		}

	}

}
