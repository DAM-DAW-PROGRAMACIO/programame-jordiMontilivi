package Easy.Llista1;

import java.util.Scanner;
import java.util.HashSet;
public class p345bis {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int[][] sudoku = new int[9][9];
		int proves = scanner.nextInt();
		boolean correcte = true;
		for(int p=0; p<proves;p++) {
			correcte = true;
			
			//Columnes i introducció de valors
			for(int i = 0; i < 9 && correcte; i++) {
				HashSet<Integer> columna = new HashSet<>();
				for(int j = 0; j < 9 && correcte; j++) {
					if(!columna.add(scanner.nextInt())) { correcte = false; break;}
				}
				sudoku[i] = columna.stream().mapToInt(Integer::intValue).toArray();
			}
			//Files
			for(int i = 0; i < 9 && correcte; i++) {
				HashSet<Integer> fila = new HashSet<>();
				for(int j = 0; j < 9 && correcte; j++) {
					if(!fila.add(sudoku[j][i])) { correcte = false; break;}
				}
			}
			//requadres
			for(int i = 0; i < 9  && correcte; i++) {
				HashSet<Integer> requadre = new HashSet<>();
				for(int j = 0; j < 9 && correcte; j++) {
					if(!requadre.add(sudoku[i%3*3+j%3][i%3*3+j%3])) { correcte = false; break;}
				}
				System.out.println(requadre);
			}
			if(correcte) System.out.println("SI");
			else System.out.println("NO");
		}
		scanner.close();
	}
}
