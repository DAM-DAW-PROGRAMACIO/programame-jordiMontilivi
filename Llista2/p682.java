package Easy.Llista2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p682 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int numIteracions = Integer.parseInt(br.readLine());
		int patos;
		
		for(int i = 0; i < numIteracions; i++) {
			patos= Integer.parseInt(br.readLine());
			System.out.println(patos + " " + patos*2);
		}
	}
}
