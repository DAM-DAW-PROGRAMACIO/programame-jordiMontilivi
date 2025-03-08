package Easy.Llista2;

import java.util.Scanner;

public class p219 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int casosProva = sc.nextInt();
		for(int i= 0; i< casosProva; i++) {
			int cont = 0;
			int nums = sc.nextInt();
			for(int j = 0; j< nums; j++)
				if(sc.nextInt() %2 == 0) cont++;
			System.out.println(cont);
		}
		sc.close();
	}
}
