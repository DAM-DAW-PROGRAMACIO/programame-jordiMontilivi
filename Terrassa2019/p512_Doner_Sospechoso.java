package Easy.Terrassa2019;

import java.util.Scanner;

public class p512_Doner_Sospechoso {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int conill, cavall;
		int proves = sc.nextInt();
		
		for(int i= 0; i <proves; i++) {
			conill = sc.nextInt();
			cavall = sc.nextInt();
			System.out.println(conill * 100 / (conill + cavall));
		
		}
		sc.close();
	}
}
