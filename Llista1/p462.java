package Easy.Llista1;

import java.util.Scanner;

public class p462 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numEntrades = sc.nextInt();
		
		for(int i= 0; i < numEntrades; i++){
			int vegades = sc.nextInt();
			String[] temps = sc.next().trim().split(":");
			
			int dies, horesTotal, minutsTotal, segonsTotal; 
			
			segonsTotal = Integer.parseInt(temps[2]) * vegades;
			minutsTotal = segonsTotal / 60  + Integer.parseInt(temps[1]) * vegades;
			horesTotal = minutsTotal / 60 + Integer.parseInt(temps[0]) * vegades;
			dies = horesTotal /24;
			
			System.out.println(dies + " " + String.format("%02d:%02d:%02d", horesTotal % 24, minutsTotal % 60, segonsTotal % 60));
		}
		sc.close();
	}
}
