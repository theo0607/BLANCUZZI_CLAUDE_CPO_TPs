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
        String pseudojoueur = sc.nextLine(); // on demande à l'utilisateur d'entrer un pseudo 
        
        System.out.println("veuillez entrer 1 pour facile et 2 pour difficile");
        int niveaudifficulté = sc.nextInt(); // on demande à l'utilisateur d'entrer un niveau de difficulté
       
     if(niveaudifficulté==1){ // si l'utilisateur à choisi le niveau facile
        Lightsout jeu = new Lightsout(5); // la taille de la grille est de 5
        jeu.debutpartie(); // on allume certaines cases aléatoirement au départ
        jeu.afficherGrilleFacile(); // on affiche la grille 
        
        int compteur; // on initialise le compteur de tour
        compteur = 0; // on lui attribue la valeur 0 car l'utilisateur n'a pas encore joué 
        
      while(jeu.etregagnant() != true){ // tant que le joueur n'a pas gagné on continue  
            compteur += 1; // on augmente de 1 valeur du compteur à chaque tour
            
            System.out.println("veuillez entrer une colonne :");
            int c = sc.nextInt(); // on demande à l'utilisateur de choisir une colonne
            System.out.println("veuillez entrer une ligne :");
            int l = sc.nextInt(); // on demande à l'utilisateur de choisir une ligne
            
            if(c>5){ // on vérifie si l'utilisateur n'a pas entré une position hors de la grille
              System.out.println("veuillez choisir une position valide");
              sc.nextInt(); 
            }
            if(l>5){ // on vérifie si l'utilisateur n'a pas entré une position hors de la grille
              System.out.println("veuillez choisir une position valide");
              sc.nextInt();
            }
            jeu.verifplacement(c,l); // si l'utilisateur à sélectionné une position sur les bords de la grille
            jeu.afficherGrilleFacile(); // on affiche la grille a la fin de chaque tour 
        }
        System.out.println("Bravo "+pseudojoueur+" tu as gagné en "+compteur+" tours!!!");  
     }
     
     if(niveaudifficulté==2){ // si l'utilisateur à choisi le niveau difficile
        Lightsout jeu = new Lightsout(9); // la taille de la grille est de 9
        jeu.debutpartie(); // on allume certaines cases aléatoirement au départ
        jeu.afficherGrilleDifficile(); // on affiche la grille 
        
        int compteur; // on initialise le compteur de tour
        compteur = 0; // on lui attribue la valeur 0 car l'utilisateur n'a pas encore joué 
        
        while(jeu.etregagnant() != true){  // tant que le joueur n'a pas gagné on continue 
            compteur += 1; // on augmente de 1 valeur du compteur à chaque tour
            System.out.println("veuillez entrer une colonne :");
            int c = sc.nextInt(); // on demande à l'utilisateur de choisir une colonne
            System.out.println("veuillez entrer une ligne :");
            int l = sc.nextInt(); // on demande à l'utilisateur de choisir une ligne
            
            if(c>9){ // on vérifie si l'utilisateur n'a pas entré une position hors de la grille
              System.out.println("veuillez choisir une position valide");
              sc.nextInt();
            }
            if(l>9){ // on vérifie si l'utilisateur n'a pas entré une position hors de la grille
              System.out.println("veuillez choisir une position valide");
              sc.nextInt();
            }
            jeu.verifplacement(c,l); // si l'utilisateur à sélectionné une position sur les bords de la grille
            jeu.afficherGrilleDifficile(); // on affiche la grille a la fin de chaque tour 
        }
        System.out.println("Bravo "+pseudojoueur+" tu as gagné en "+compteur+"tours!!!");  
     }
   }
      
}
    

