package Easy.Llista2;

import java.util.Scanner;

public class p190 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int den = sc.nextInt();
		while (num >= den) {
			long res = FactorialDivisio(num, den);
			System.out.println(res);
			num = sc.nextInt();
			den = sc.nextInt();
		}
		sc.close();
	}
	public static long FactorialDivisio(int num, int den) {
		long res = 1;
		if(num == den)
			res = 1;
		else 
			res = num * FactorialDivisio(num-1, den);
		return res;
	}
}
