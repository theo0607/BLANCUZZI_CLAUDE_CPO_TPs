/* BLANCUZZI Théo 
   CLAUDE Ethan
   TP1 - Saisie et manipulation de nombres
   Exercice 1-
*/
package manipnombresint_blancuzzi_claude;

import java.util.Scanner;

/**
 *
 * @author ethan


 /déclaration variables*/ 


public class ManipNombresInt_BLANCUZZI_CLAUDE {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int somme;
    float difference;
    float produit; 
    int quotient;
    float reste;
    Scanner sc = new Scanner(System.in);
    int entier1 = sc.nextInt();
    int entier2 = sc.nextInt();
    somme=entier1+entier2;
    difference=entier1-entier2;
    produit = entier1*entier2;
    quotient = entier1/entier2;
    reste = entier1%entier2;
    System.out.println("la somme des deux est : "+somme+"\nla difference des deux est :"+difference+"\nle produit des deux est :"+produit);
    System.out.println("le quotien est : "+quotient+"\nle reste est : "+reste);
    }  
}

    

