package aula14_matriz;

public class test {

	public static void main(String[] args) {

		int m[][] = new int[3][3];

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				m[l][c] = (int) Math.round(Math.random() * 100);
			}
		}
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("os valores são " + "[" + l + "]" + "[" + c + "]  " + m[l][c]);
			}
		}

	}

}
//*  Valores como uma tabela:

//*    0  1  2
//* 0 |53|63|78|
//* 1 |60|44|51|
//* 2 |43| 0|89|
