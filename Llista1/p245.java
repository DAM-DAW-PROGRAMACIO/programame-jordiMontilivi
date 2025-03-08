package Easy.Llista1;

import java.util.Scanner;

public class p245 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		 
		int N = scanner.nextInt();
		scanner.nextLine();
		while( N != 0) {
			if(N < 2) {
				System.out.println("DESCONOCIDOS");
				scanner.nextLine();
			}
			
			else {
				if(AscendentODescendent(scanner.nextLine())) 
					System.out.println("DALTON");
				else System.out.println("DESCONOCIDOS");
			}
			N = scanner.nextInt();
            scanner.nextLine();  // Consumir la línea vacía después de nextInt()
		}
		scanner.close();
		
	}
	public static Boolean AscendentODescendent(String dalton) {
		boolean ascendent = true, descendent = true;
	    String[] aux = dalton.split(" ");
	    for (int i = 0; i < aux.length - 2; i++) {
	    	//han de ser long
	    	if(Integer.parseInt(aux[i]) >= Integer.parseInt(aux[i + 1])) ascendent = false;
	    	else if (Integer.parseInt(aux[i]) <= Integer.parseInt(aux[i + 1])) descendent = false;
	    	if(!ascendent && !descendent) return false;
	    }
		return true;
	}
}
