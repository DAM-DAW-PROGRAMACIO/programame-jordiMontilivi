package Easy.Llista1;

import java.util.Scanner;

public class p340 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numIteracions = scanner.nextInt();
		int N, M;
		int resultat = 0;	
		
		for( int i = 0; i < numIteracions; i++) {
			N = scanner.nextInt();
			M = scanner.nextInt();
			scanner.nextLine();
			resultat = (M * 3 + 1) + (N - 1) * (2 * M +1); // Primera fila=> (Columnes * 3) +1 y la resta de files (N-1) => (Columnes *2 ) +1

			System.out.println(resultat);
		}
		scanner.close();
		
	}
}
