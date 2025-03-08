package Easy.Llista1;

import java.util.Scanner;

public class p536 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		 
		
		while(scanner.hasNext()) {
			int terrenys = scanner.nextInt();
			
			int midaMax = scanner.nextInt();
			int abonoMin = scanner.nextInt();
			int aiguaMin = scanner.nextInt();
			int distanciaMin = scanner.nextInt();
			String propietariMax = scanner.nextLine();
			
			for( int i = 1; i < terrenys; i++) {
				int mida = scanner.nextInt();
				int abono = scanner.nextInt();
				int aigua = scanner.nextInt();
				int distancia = scanner.nextInt();
				String propietari = scanner.nextLine();
				
				if(mida > midaMax) {
					midaMax = mida;
					abonoMin = abono;
					aiguaMin = aigua;
					distanciaMin = distancia;
					propietariMax = propietari;
				}
				else if(mida == midaMax) {
					if(aigua < aiguaMin) {
						midaMax = mida;
						abonoMin = abono;
						aiguaMin = aigua;
						distanciaMin = distancia;
						propietariMax = propietari;
					} 
					else if (aigua == aiguaMin) {
						if(distancia < distanciaMin) {
							midaMax = mida;
							abonoMin = abono;
							aiguaMin = aigua;
							distanciaMin = distancia;
							propietariMax = propietari;
						}
						else if (distancia == distanciaMin) {
							if(abono < abonoMin) {
								midaMax = mida;
								abonoMin = abono;
								aiguaMin = aigua;
								distanciaMin = distancia;
								propietariMax = propietari;
							}
						}
					}
				}
			}
			System.out.println(propietariMax);
		}
		scanner.close();
	}
}

