package RevisaoPOO;

import java.util.Arrays;

public class teste {

	public static void main(String[] args) {
		int [] [] e = new int[3][3];
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e[i].length; j++) {
				e[i][j]=1;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(e[i][j]+", ");
			}
			System.out.println();
		}
		
		e[-1][-1]=0;
	}

}
