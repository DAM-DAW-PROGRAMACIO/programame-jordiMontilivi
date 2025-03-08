package Easy.Llista2;

import java.util.Scanner;
import java.util.TreeMap;

class Hort implements Comparable<Hort>
{
	public int mida, abono, aigua, distancia;
//	public String nom;
	public Hort(int m, int ab, int ai, int d/*, String n*/) {
		mida =m;
		abono = ab;
		aigua = ai;
		distancia = d;
//		nom = n;
	}
	 // Implementem metode compareTo de la interfície comparable
    @Override
	public int compareTo(Hort h) {
		if(mida != h.mida) return Integer.compare(h.mida, mida); //perque m'interessa que torne -1 si el meu terreny es més gran
		else if(aigua != h.aigua) return Integer.compare(aigua, h.aigua);
		else if(distancia != h.distancia) return Integer.compare(distancia, h.distancia);
		else if(abono != h.abono) return Integer.compare(abono, h.abono);
		else return -1; //Si dos horts son iguals en tot volem que es quedi el primer... 
	}
    //Proves per comprovar que m'ho torna correctament
    @Override
    public String toString() {
    	return String.valueOf(aigua);
    }
}

public class p536_Huerto_Objectes_TreeMap {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TreeMap<Hort, String> hortets = new TreeMap<>();
		
		while(sc.hasNext()) {
			hortets.clear();
			int terrenys = sc.nextInt();
			
			for( int i = 0; i < terrenys; i++) {
				hortets.put(new Hort(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()), sc.nextLine().trim());
			}
			System.out.println(hortets.get(hortets.firstKey()));
		}
		sc.close();
	}
}