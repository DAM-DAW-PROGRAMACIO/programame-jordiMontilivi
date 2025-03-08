package Easy.Llista3;

import java.util.Scanner;

public class p154 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int numeros = scanner.nextInt();
		String lletres = scanner.nextLine();

		while(numeros != 9999 || !lletres.equals("ZZZ")) {
			
			numeros++;
			if(numeros>9999) {
				numeros=0;

				lletres = ProximaLLetra(lletres);
			}

			String resultat = String.format("%04d %s", numeros, lletres);
			System.out.println(resultat);
			
			numeros = scanner.nextInt();
			lletres = scanner.nextLine();
		}

		scanner.close();
	}
	public static String ProximaLLetra(String lletres) {
		char[] arrayLletres =  lletres.toCharArray();
		boolean canvi = true;
		int i = arrayLletres.length -1;
		while(canvi){
			if(arrayLletres[i] == ('Z')) {arrayLletres[i] = 'B'; i--;}
			else{
				arrayLletres[i]++;
				canvi = false;
				if("AEIOU".indexOf(arrayLletres[i]) != -1) arrayLletres[i]++;
			}
		}
		return new String(arrayLletres);
	}
}
