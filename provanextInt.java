package Easy;

import java.util.Scanner;

public class provanextInt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String linia = scanner.nextLine();
		
		while (!linia.isEmpty()) {
			
			System.out.println(linia);
			
			linia = scanner.nextLine();
		}
		scanner.close();
	}
}
