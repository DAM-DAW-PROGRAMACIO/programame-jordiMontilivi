package Easy;

import java.util.Scanner;

public class p245bis {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		 
		int N = Integer.parseInt(scanner.nextLine());
		while( N != 0) {
			if(N < 2){
				System.out.println("DESCONOCIDOS");
				scanner.nextLine();
			}
			else {
				if(AscendentODescendent(scanner.nextLine().trim())) 
					System.out.println("DALTON");
				else System.out.println("DESCONOCIDOS");
			}
			N = Integer.parseInt(scanner.nextLine());
		}
		scanner.close();
		
	}
	public static Boolean AscendentODescendent(String dalton) {
		boolean ascendent = true, descendent = true;
	    String[] aux = dalton.split(" ");
	    for (int i = 0; i < aux.length - 2; i++) {
	    	if(Long.parseLong(aux[i]) >= Long.parseLong(aux[i + 1])) ascendent = false;
	    	else if (Long.parseLong(aux[i]) <= Long.parseLong(aux[i + 1])) descendent = false;
	    	if(!ascendent && !descendent) return false;
	    }
		return true;
	}
}
