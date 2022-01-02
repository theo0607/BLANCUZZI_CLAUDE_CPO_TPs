/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligthsout;

import java.util.Scanner;

/**
 *
 * @author theob
 */
public class Partie {
     
    public static void main(String[] args){
        
     Scanner sc = new Scanner(System.in);  
        
        System.out.println("veuillez entrer un pseudo: ");
        String pseudojoueur = sc.nextLine();
        
        System.out.println("veuillez entrer 1 pour facile et 2 pour difficile");
        int niveaudifficulté = sc.nextInt();
       
     if(niveaudifficulté==1){
        Lightsout jeu = new Lightsout(5);  
        jeu.debutpartie();
        jeu.afficherGrilleFacile();
        
        int compteur;
        compteur = 0;
      while(jeu.etregagnant() != true){  
            compteur += 1;
            System.out.println("veuillez entrer une colonne :");
            int c = sc.nextInt();
            System.out.println("veuillez entrer une ligne :");
            int l = sc.nextInt();
            
            if(c>5){
              System.out.println("veuillez choisir une position valide");
              sc.nextInt();
            }
            if(l>5){
              System.out.println("veuillez choisir une position valide");
              sc.nextInt();
            }
            jeu.verifplacement(c,l);
            jeu.afficherGrilleFacile();
        }
        System.out.println("Bravo "+pseudojoueur+" tu as gagné en "+compteur+" tours!!!");  
     }
     
     if(niveaudifficulté==2){
        Lightsout jeu = new Lightsout(9);  
        jeu.debutpartie();
        jeu.afficherGrilleDifficile();
        
        int compteur;
        compteur = 0;
        
        while(jeu.etregagnant() != true){  
            compteur += 1;
            System.out.println("veuillez entrer une colonne :");
            int c = sc.nextInt();
            System.out.println("veuillez entrer une ligne :");
            int l = sc.nextInt();
            
            if(c>9){
              System.out.println("veuillez choisir une position valide");
              sc.nextInt();
            }
            if(l>9){
              System.out.println("veuillez choisir une position valide");
              sc.nextInt();
            }
            jeu.verifplacement(c,l);
            jeu.afficherGrilleDifficile();
        }
        System.out.println("Bravo "+pseudojoueur+" tu as gagné en "+compteur+"tours!!!");  
     }
   }
      
}
    

