package Easy.Llista1;

import java.util.Scanner;

public class p239 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int dies = sc.nextInt();
		int emisores = sc.nextInt();
		
		while(dies != 0 || emisores != 0){
			int segonsTotal = dies * 24 * 6 * emisores;
			
			System.out.println(segonsTotal / 3600 / 24  + ":" + String.format("%02d:%02d:%02d", segonsTotal / 3600 % 24, segonsTotal / 60 % 60, segonsTotal % 60));
			dies = sc.nextInt();
			emisores = sc.nextInt();
		}

		sc.close();
	}
}
