package Easy.Terrassa2019;

import java.util.Locale;
import java.util.Scanner;

public class p518_Assamblea {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int[] dataValida = {31,28,31,30,31,30,31,31,30,31,30,31};
		int mes, dia;
		double valor;

		while((valor = sc.nextDouble()) != 0.00) {
			mes = (int) valor;
			dia = (int)((valor-mes) * 100);
			if(mes>0 && mes <13 && dia >0 && dataValida[mes-1] >= dia) System.out.println("SI");
			else System.out.println("NO");
		}
		sc.close();
	}
}
