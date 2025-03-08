package Easy.Llista2;

import java.util.Scanner;

public class p245_NoTimeLimit {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long ant, act;
		boolean ascendent, descendent; 
		int N = sc.nextInt();
		while( N != 0) {
			if(N < 2) 
				System.out.println("DESCONOCIDOS");
			
			else {
				ascendent = true; descendent = true;
				int i = 1;
				ant = sc.nextLong();
				while(i < N && (ascendent || descendent)) {
					act = sc.nextLong();
					if(ant <= act) descendent = false;
					if(ant >= act) ascendent = false;
					ant = act;
					i++;
				}
				sc.nextLine();
				if(ascendent || descendent) 
					System.out.println("DALTON");
				else System.out.println("DESCONOCIDOS");
			}
			N = sc.nextInt();
		}
		sc.close();
	}
}
