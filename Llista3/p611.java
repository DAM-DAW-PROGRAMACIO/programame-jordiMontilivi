package Easy.Llista3;

import java.util.Scanner;

public class p611 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int anySir = sc.nextInt();
			sc.nextLine();
			int obres = sc.nextInt();
			int anyPrimerSir = 11000;
			String titol = "NINGUNA";
			int contSir = 0;
			for(int i = 0; i < obres; i++) {
				int any = sc.nextInt();
				if (any >= anySir && any < anyPrimerSir) {
					anyPrimerSir = any;
					titol = sc.nextLine().trim();
					contSir++;
				}
				else sc.nextLine();
			}
			if(contSir == obres && obres != 0)
				titol = "TODAS";
			System.out.println(titol.trim());
		}
		sc.close();
	}
}
