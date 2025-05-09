package aula14_matriz;

public class test_alternative {

	public static void main(String[] args) {
		int m[][] = new int[3][3];

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				m[l][c] = (int) Math.round(Math.random() * 100);
			}
		}System.out.println("os valores na tabela são: ");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("%-4d", m[l][c]);

			}System.out.println("");
		}


	}

}
