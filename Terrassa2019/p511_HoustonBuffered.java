package Easy.Terrassa2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Funciona i es correcte però al acepta el reto em dona MLE per fer un list massa llarg
// Heu de mirar les versions on controle la mida dels arrays
public class p511_HoustonBuffered {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line;
		int parellesVector1, parellesVector2, quantitat;
		long valor, resultat;
		List<Long> vector1= new ArrayList<>();
		List<Long> vector2 = new ArrayList<>();
		
		while((line = br.readLine()) != null) {
			parellesVector1 = Integer.parseInt(line.split(" ")[0]);
			parellesVector2 = Integer.parseInt(line.split(" ")[1]);
			vector1.clear();
			vector2.clear();
			
			line = br.readLine();
			for(int i = 0; i < parellesVector1; i++) {
				quantitat = Integer.parseInt(line.split(" ")[2 * i]);;
				valor = Long.parseLong(line.split(" ")[2 * i + 1]);
				
				for(int j=0; j< quantitat; j++) vector1.add(valor);
			}
			line = br.readLine();
			for(int i = 0; i < parellesVector2; i++) {
				quantitat = Integer.parseInt(line.split(" ")[2 * i]);;
				valor = Long.parseLong(line.split(" ")[2 * i + 1]);
				
				for(int j=0; j< quantitat; j++) vector2.add(valor);
			}
			resultat = 0;	
			for(int i = 0; i < vector1.size(); i++)
				resultat += vector1.get(i) * vector2.get(i);
			
			System.out.println(resultat);
		}
	}
}
