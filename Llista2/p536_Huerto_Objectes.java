package Easy.Llista2;

import java.util.Scanner;

class Merda implements Comparable<Merda>
{
	public int mida, abono, aigua, distancia;
	public String nom;
	
	public Merda(int m, int ab, int ai, int d, String n) {
		mida =m;
		abono = ab;
		aigua = ai;
		distancia = d;
		nom = n;
	}
	 // Implementem metode compareTo de la interfície comparable
    @Override
	public int compareTo(Merda h) {
		if(mida != h.mida) return Integer.compare(h.mida, mida); //perque m'interessa que torne -1 si el meu terreny es més gran
		else if(aigua != h.aigua) return Integer.compare(aigua, h.aigua);
		else if(distancia != h.distancia) return Integer.compare(distancia, h.distancia);
		else if(abono != h.abono) return Integer.compare(abono, h.abono);
		else return +1; //Si dos horts son iguals en tot volem que es quedi el primer... 
	}
    //Proves per comprovar que m'ho torna correctament
    @Override
    public String toString() {
    	return nom;
    }
}

public class p536_Huerto_Objectes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Merda hort;
		
		while(sc.hasNext()) {
			int terrenys = sc.nextInt();
			hort = new Merda(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.nextLine().trim());
			
			for( int i = 1; i < terrenys; i++) {
				Merda nouHort = new Merda(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(), sc.nextLine().trim());
				if(nouHort.compareTo(hort) < 0)
					hort = nouHort;
			}
			System.out.println(hort);
		}
		sc.close();
	}
}