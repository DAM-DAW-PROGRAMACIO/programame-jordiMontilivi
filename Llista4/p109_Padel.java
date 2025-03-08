package Easy.Llista4;

import java.util.Scanner;
import java.util.*;

public class p109_Padel {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> lliga = new HashMap<>();
		String partides, equip1, equip2, guanyador = "";
		int sets1, sets2, partitsJugats, partitsNoJugats, maxPunts;
//		StringBuilder resultat = new StringBuilder();

		while (!sc.nextLine().equals("FIN")) {
			
			lliga.clear();
			partitsJugats = 0;
			while (!(partides = sc.nextLine().trim()).equals("FIN")) {
				equip1 = partides.split(" ")[0];
				equip2 = partides.split(" ")[2];
				sets1 = Integer.parseInt(partides.split(" ")[1]);
				sets2 = Integer.parseInt(partides.split(" ")[3]);
				if(!lliga.containsKey(equip1))
					lliga.put(equip1, 0);
				if(!lliga.containsKey(equip2))
					lliga.put(equip2,0);
				if(sets1 > sets2) {
					lliga.put(equip1, lliga.get(equip1)+2);
					lliga.put(equip2, lliga.get(equip2)+1);
				}
				else {
					lliga.put(equip1, lliga.get(equip1)+1);
					lliga.put(equip2, lliga.get(equip2)+2);
				}	
				partitsJugats++;
			}
			partitsNoJugats = lliga.size() * (lliga.size() -1) - partitsJugats; //partits anada i tornada
			
			//busquem el guanyador
			maxPunts = 0;
			for(String equip:lliga.keySet()) {
				if(lliga.get(equip) > maxPunts) {
					maxPunts = lliga.get(equip);
					guanyador = equip;
				}
				else if(lliga.get(equip) == maxPunts)
					guanyador = "EMPATE";
			}
//			resultat.append(guanyador);
//			resultat.append(" ");
//			resultat.append(partitsNoJugats);
//			resultat.append("\n");
			System.out.println(guanyador + " " + partitsNoJugats);
		}
//		System.out.println(resultat.toString());
		sc.close();
	}
}
