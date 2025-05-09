package aula14_matriz;

public class Atividade01 {

	public static void main(String[] args) {
		int m[][] = new int[5][5];
		int soma = 0;
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				m[l][c] = (int) Math.round(Math.random() * 50);
				soma = soma + m[l][c];
			}
		}
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				System.out.println("os valores são: " + " [" + l + "]" + "[" + c + "] " + m[l][c]);
			}

		}System.out.println("\nA soma é " + soma);
	}

}
