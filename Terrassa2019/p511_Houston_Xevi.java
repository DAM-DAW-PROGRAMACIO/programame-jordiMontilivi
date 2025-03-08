package Easy.Terrassa2019;

import java.util.Scanner;
//import java.util.*;

public class p511_Houston_Xevi {

	public static void main(String[] args) throws Exception {
	      Scanner sc = new Scanner(System.in);
          long resultat = 0;
          int nGrupsA, nGrupsB;
          long minim;
          //int valorA, valorB, elementsA, elementsB;
          int cursorA, cursorB;
//          String linia;
//          String [] linies;
          long [] valorsA, elementsA ;
          long [] valorsB, elementsB ;
         
          while(sc.hasNext())
          {
              nGrupsA = sc.nextInt();
              nGrupsB = sc.nextInt();
              //sc.nextLine();
              
              valorsA = new long [nGrupsA];
              elementsA = new long [nGrupsA];
              valorsB = new long [nGrupsB];
              elementsB = new long [nGrupsB];


             
              //llegim A
              //linia = sc.nextLine();
              //linies = linia.split(" ");
              for(int i=0;i<nGrupsA;i++)
              {
                elementsA[i] = sc.nextInt();
                valorsA[i] = sc.nextInt();
              }
              //llegim B
              //linia = sc.nextLine();
              //linies = linia.split(" ");
              for(int i=0;i<nGrupsB;i++)
              {
                elementsB[i] = sc.nextInt();
                valorsB[i] = sc.nextInt();
              }
             
              //Calculem
              cursorA=0;
              cursorB=0;
              resultat=0;
              
              while (cursorA<valorsA.length)
              {
                  minim = Math.min(elementsA[cursorA], elementsB[cursorB]);
                  resultat += minim*(valorsA[cursorA]*valorsB[cursorB]);
                 
                  elementsA[cursorA]-= minim;
                  elementsB[cursorB]-= minim;
                 
                  if(elementsA[cursorA]==0)
                  {
                      cursorA ++;
                  }
                  if(elementsB[cursorB]==0)
                  {
                      cursorB ++;
                  }
              }
              System.out.println(resultat);
         
          }

          sc.close();
	}
}
