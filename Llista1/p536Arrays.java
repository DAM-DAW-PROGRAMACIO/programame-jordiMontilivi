package Easy.Llista1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p536Arrays {	
	
	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	String line = br.readLine();
	while (!line.isEmpty()) {
		int num = Integer.parseInt(line);	
	
		String[] terrenyMax = br.readLine().split(" ");
		
		for(int i = 1; i < num; i++) {
			String[] terreny = br.readLine().split(" ");
			if(Integer.parseInt(terreny[0]) > Integer.parseInt(terrenyMax[0]))
				terrenyMax = terreny;
			else if(Integer.parseInt(terreny[0]) == Integer.parseInt(terrenyMax[0]))
			{
				if(Integer.parseInt(terreny[2]) < Integer.parseInt(terrenyMax[2]))
					terrenyMax = terreny;
				else if(Integer.parseInt(terreny[2]) == Integer.parseInt(terrenyMax[2]))
				{
					if(Integer.parseInt(terreny[3]) < Integer.parseInt(terrenyMax[3]))
						terrenyMax = terreny;
					else if(Integer.parseInt(terreny[3]) == Integer.parseInt(terrenyMax[3]))
							if(Integer.parseInt(terreny[1]) < Integer.parseInt(terrenyMax[1]))
								terrenyMax = terreny;
				}
			}
		}
		for(int i = 4; i < terrenyMax.length -1; i++)
			System.out.print(terrenyMax[4] + " ");
		System.out.println(terrenyMax[terrenyMax.length-1]);
		
		line = br.readLine();
	}	
}
}

