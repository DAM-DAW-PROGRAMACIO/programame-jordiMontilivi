package Easy;

import java.util.Scanner;

public class provaScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String linia = scanner.nextLine();
		String[] dades = linia.split(" ");
		for(int i= 0;i<dades.length;i++)
			System.out.println(dades[i]);
		
//		List<Integer> numbers = new ArrayList<>();
//		while()


		scanner.close();
	}
}
