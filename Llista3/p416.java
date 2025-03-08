package Easy.Llista3;

import java.util.Scanner;
import java.util.*;

public class p416 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numDates;
		
		while ((numDates = sc.nextInt()) != 0) {
			HashSet<String> dates = new HashSet<String>();
			int i;
			for(i= 0; i < numDates; i++) {
				String dataActual = sc.next();

				if(!dates.add(dataActual.substring(0,dataActual.lastIndexOf("/")))) {
					System.out.println("SI");
					sc.nextLine();
					break;
					}

			}
			if(i == numDates)
				System.out.println("NO");
		}
		sc.close();
	}
}
