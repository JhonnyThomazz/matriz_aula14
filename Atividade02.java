package aula14_matriz;

public class Atividade02 {

	public static void main(String[] args) {
		int m[][] = new int[4][4];

		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
				if (l == c) {
					m[l][c] = (int) Math.round(Math.random() * 100);
				}
			}
		}System.out.println("matriz 4x4:");
		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 4; c++) {
				System.out.print(" " + m[l][c]); // *System.out.print(l==c? m[l][c]:" " + " ")
																				
			}System.out.println(" ");
		}
	}

}
