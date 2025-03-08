package Easy.Llista1;

import java.util.Scanner;

public class p245bis2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);         
        int N = scanner.nextInt();
        
        while (N != 0) {
            if (N < 2) {
                System.out.println("DESCONOCIDOS");
            } else {
                long a = scanner.nextLong();
                long b;
                boolean creixent = true;
                boolean decreixent = true;
                
                for (int i = 0; i < N - 1; i++) { 
                    b = scanner.nextLong();
                    if (a >= b) {creixent = false;}
                    else if (a <= b) {decreixent = false;}
                    if(!creixent && !decreixent) { if(scanner.hasNextLong()) scanner.nextLine(); break;}
                    a = b;
                }
                
                if (creixent || decreixent) {
                    System.out.println("DALTON");
                } else {
                    System.out.println("DESCONOCIDOS");
                }
            }
            N = scanner.nextInt();  // Leer el siguiente caso de prueba
        }
        scanner.close();
    }
}
