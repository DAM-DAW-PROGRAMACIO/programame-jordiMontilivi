package Easy.Llista1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p335 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int numIteracions = Integer.parseInt(br.readLine());
		long nivells;
		long caniques;
		long fila;
		
		for(long i = 0; i < numIteracions; i++) {
			nivells= Long.parseLong(br.readLine());
			caniques = 0;
			fila = 0;
			for(int j = 1; j <= nivells; j++) {
				fila += j;  //conta nomes les caniques que hi ha a la nova fila (sumatori)
				caniques+=fila; //acumula totes les caniques per nivells

//				caniques += j * (j + 1) / 2; //Si et saps la fórmula (idea feliç)
			}
			
			System.out.println(caniques);
		}
	}
}
