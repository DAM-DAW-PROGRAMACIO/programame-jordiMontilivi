package Easy.Llista3;

import java.util.Scanner;
import java.util.TreeMap;

public class p611_Connan_TreeMap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		TreeMap<Integer, String> primer = new TreeMap<>();
		String titol;
		
		while (sc.hasNext()) {
			primer.clear();
			int anySir = sc.nextInt();
			sc.nextLine();
			int obres = sc.nextInt();
			for(int i = 0; i < obres; i++) {
				int any = sc.nextInt();
				if (any >= anySir) {
					primer.put(any, sc.nextLine());
				}
				else sc.nextLine();
			}
			if(obres != 0 && primer.size() == obres)
				titol = "TODAS";
			else if(primer.size() == 0)
				titol = "NINGUNA";
			else {
				titol = primer.get(primer.firstKey());
			}
			System.out.println(titol.trim());
		}
		sc.close();
	}
}
