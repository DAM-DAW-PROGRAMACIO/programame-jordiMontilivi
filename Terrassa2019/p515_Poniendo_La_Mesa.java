package Easy.Terrassa2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p515_Poniendo_La_Mesa {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int copas;
		
		while ((copas = Integer.parseInt(br.readLine())) != 0) {
			if(copas % 2 != 0 && copas > 1)
				System.out.println(copas -1);
			else System.out.println(copas);
		}
	}
}
