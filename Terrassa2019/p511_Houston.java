package Easy.Terrassa2019;

import java.util.Scanner;

public class p511_Houston {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner  sc = new Scanner(System.in);
		int parellesVector1, parellesVector2, index1, index2;
		long resultat, repetir;
		long[] vector1, vector2, dades1, dades2;
		
		while(sc.hasNextInt()) {
			parellesVector1 = sc.nextInt();
			parellesVector2 = sc.nextInt();
			vector1 = new long[parellesVector1];
			dades1 = new long[parellesVector1];
			vector2 = new long[parellesVector2];
			dades2 = new long[parellesVector2];
			
			for(int i = 0; i < parellesVector1; i++) {
				vector1[i] = sc.nextInt();
				dades1[i] = sc.nextInt();
			}
			for(int i = 0; i < parellesVector2; i++) {
				vector2[i] =  sc.nextInt();
				dades2[i] = sc.nextInt();
			}
			resultat = 0;
			index1 = 0;
			index2 = 0;
			while(index1 < vector1.length) {
				//agafem l'index més petit de les repeticions
				repetir = Math.min(vector1[index1], vector2[index2]);
				resultat += repetir * (dades1[index1] * dades2[index2]);
				vector1[index1] -= repetir;
				vector2[index2] -= repetir;
				if(vector1[index1] == 0) index1++;
				if(vector2[index2] == 0) index2++;
			}
			System.out.println(resultat);
		}

		sc.close();
	}
}
