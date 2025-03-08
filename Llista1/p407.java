package Easy.Llista1;

import java.util.Scanner;

public class p407 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		 
		int c = scanner.nextInt();
		int p = scanner.nextInt();
		int t = scanner.nextInt();
		while( c != 0 && p != 0 && t != 0 ) {
			System.out.println(c - Math.abs(c - (p + t)));
			//System.out.println(c - (p + t) > 0? c - (c - (p + t)): c + (c - (p + t)));
			c = scanner.nextInt();
			p = scanner.nextInt();
			t = scanner.nextInt();
		}
		scanner.close();
	}
}
