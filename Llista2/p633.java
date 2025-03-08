package Easy.Llista2;

import java.util.HashSet;
import java.util.Scanner;

public class p633 {	
	
	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		
		int animals = scanner.nextInt();
		
		while (animals != 0 ) {
			int parelles = 0;
			int desenparellats = 0;
			int repetits = 0;
			
			HashSet<String> noRepetits = new HashSet<String>();	
			
			for(int i= 0; i < animals; i++) 
				if(!noRepetits.add(scanner.next())) repetits++;
			
			for (String animal : noRepetits) {
				String parella;
			    if(animal.endsWith("o")) 
			    	parella = animal.substring(0, animal.length()-1) + "a";
			    else
			    	parella = animal.substring(0, animal.length()-1) + "o";
			    	
		    	if(noRepetits.contains(parella)) {
		    		parelles++;
//		    		noRepetits.remove(parella);
		    	}
		    	else
		    		desenparellats++;
			    	
		    }
			
			parelles = parelles / 2;
			System.out.println(parelles + " " + desenparellats + " " + repetits);
			
			animals = scanner.nextInt();
		}	
		scanner.close();
	}
}

