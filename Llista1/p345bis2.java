package Easy.Llista1;

import java.util.Scanner;
import java.util.HashSet;

public class p345bis2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int proves = scanner.nextInt(); // Número de sudokus a comprovar

        for (int p = 0; p < proves; p++) {
            int[][] sudoku = new int[9][9];
            boolean correcte = true;

            // Leer el Sudoku
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j] = scanner.nextInt();
                }
            }

            // Validar files y columnes
            for (int i = 0; i < 9 && correcte; i++) {
                HashSet<Integer> fila = new HashSet<>();
                HashSet<Integer> columna = new HashSet<>();

                for (int j = 0; j < 9 && correcte; j++) {
                    // Validar fila
                    if (!fila.add(sudoku[i][j])) {
                        correcte = false;
                        break;
                    }
                    // Validar columna
                    if (!columna.add(sudoku[j][i])) {
                        correcte = false;
                        break;
                    }
                }
            }

            // Validar subrequadres 3x3
            for (int startRow = 0; startRow < 9 && correcte; startRow += 3) {
                for (int startCol = 0; startCol < 9 && correcte; startCol += 3) {
                    HashSet<Integer> requadre = new HashSet<>();

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            int valor = sudoku[startRow + i][startCol + j];
                            if (!requadre.add(valor)) {
                                correcte = false;
                                break;
                            }
                        }
                    }
                }
            }

            // Imprimir resultat
            System.out.println(correcte ? "SI" : "NO");
        }

        scanner.close();
    }
}