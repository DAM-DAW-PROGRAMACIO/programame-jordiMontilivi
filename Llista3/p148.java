package Easy.Llista3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p148 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String line = br.readLine();

		String[] horesMin = line.split(":");
		int hores =Integer.parseInt(horesMin[0]);
		int min = Integer.parseInt(horesMin[1]);
		while (hores != 0 || min != 0) {
			System.out.println((23 - hores)*60 + 60 - min);
			
			line = br.readLine();

			horesMin = line.split(":");
			hores =Integer.parseInt(horesMin[0]);
			min = Integer.parseInt(horesMin[1]);
		}
	}
}
