package Easy.Llista1;

import java.util.Scanner;

public class p401 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numParaules = sc.nextInt();
		
		for(int i=0; i<numParaules; i++) {
			String paraula1 = sc.next().toUpperCase().replace("V","B");
			String paraula2 = sc.next().toUpperCase().replace("V","B");
			
			if(paraula1.length() != paraula2.length()) System.out.println("NO");
			else {
				if(paraula1.equals(paraula2)) System.out.println("NO");
				else {
					int j;
					for(j = 0; j < paraula1.length(); j++){
						paraula2 = paraula2.substring(1) + paraula2.substring(0,1);
						if(paraula1.equals(paraula2)) {
							System.out.println("SI");
							break;
						}
					}
					if(j == paraula1.length()) System.out.println("NO");
				}
			}
		}

		sc.close();
	}
}
