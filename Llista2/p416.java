package Easy.Llista2;

import java.util.HashSet;
import java.util.Scanner;

public class p416 {

	public static int toi(String str) {
		return Integer.parseInt(str);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		while(!line.equals("0")) {
			
			long nVecez = Long.parseLong(line);

			boolean repes = false;			
			HashSet<String> datas = new HashSet<String>();
	
			for(long i=0;i<nVecez;i++) {
				String data = sc.next();
				data = data.substring(0,data.length()-4);
				if(!datas.add(data)) {
					repes = true;
					break;
				}
			}
			
			if(repes)System.out.println("SI");
			else System.out.println("NO");

			sc.nextLine();
			line = sc.next();
		}
		
		

	}
}
