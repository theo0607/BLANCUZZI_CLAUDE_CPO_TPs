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
        
        System.out.println("veuillez entrer 1 pour facile et 2 pour difficile");
        int niveaudifficulté = sc.nextInt();
       
     if(niveaudifficulté==1){
        Lightsout jeu = new Lightsout(5);  
        jeu.debutpartie();
        jeu.afficherGrilleFacile();
        
        int compteur;
        compteur = 0;
      }
    }
    
}
