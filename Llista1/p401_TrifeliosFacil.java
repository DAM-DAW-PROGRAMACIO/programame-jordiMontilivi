package Easy.Llista1;

import java.util.Scanner;

public class p401_TrifeliosFacil {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int numParaules;
		numParaules = sc.nextInt();
		for (int i=1;i<=numParaules;i++)
		{
			String paraula1 = sc.next().toUpperCase().replace("V","B");
			String paraula2 = sc.next().toUpperCase().replace("V","B");
			
			if (paraula1.equals(paraula2) || paraula1.length() != paraula2.length()) System.out.println("NO");
			else {
				paraula1 = paraula1 + paraula1;
				if (paraula1.contains(paraula2))
					System.out.println("SI");
				else 
					System.out.println("NO");
			}
		}
		sc.close();
	}
}
