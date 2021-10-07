/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber_blancuzzi_claude.java;

import java.util.Random;

/**
 *
 * @author theob
 */
public class GuessMyNumber_BLANCUZZI_CLAUDEJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random generateurAleat = new Random();
        
        int n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in); 
        
        int facile = generateurAleat.nextInt(25);
        int moyen = generateurAleat.nextInt(50);
        int difficile = generateurAleat.nextInt(100);
        
        int compteur;
        compteur=0;
        
       
        
        int niveaudifficulté = sc.nextInt();
        int niveauxdifficulté = 0;
        
        if (niveauxdifficulté==1) {
            System.out.println("Vous avez choisi le niveau facile saisissez un nombre entre 0 et 25");
            while (1==1) {
                int nombre1 = sc.nextInt();
                compteur=compteur+1;
        
                if (nombre1 > 25) {
                    System.out.println("entrez un chiffre compris entre 0 et 25");
                }
                
                if (nombre1 < 0) {
                    System.out.println("entrez un chiffre compris entre 0 et 25");
                }
            
                if (0 < nombre1 < 25) {              
                    if (facile == nombre1) {
                        System.out.println("gagné");
                        System.out.println(compteur);
                    }
                    if (facile > nombre1) {
                    System.out.println("trop petit");
                    }
                    if (facile < nombre1) {
                    System.out.println("trop grand");
                    }
                    if (facile > 5*nombre1) {
                    System.out.println("vraiment trop petit");
                    }
                    if (facile < nombre1/5) {
                    System.out.println("vraiment trop grand");
                    }  
                }
            }
        }
        
        if (niveauxdifficulté==2) {
            System.out.println("Vous avez choisi le niveau moyen saisissez un nombre entre 0 et 50");
            while (1==1) {
                int nombre1 = sc.nextInt();
                compteur=compteur+1;
        
                if (nombre1 > 50) {
                    System.out.println("entrez un chiffre compris entre 0 et 25");
                }
                
                if (nombre1 < 0) {
                    System.out.println("entrez un chiffre compris entre 0 et 25");
                }
            
                if (0 < nombre1 < 50) {              
                    if (moyen == nombre1) {
                        System.out.println("gagné");
                        System.out.println(compteur);
                    }
                    if (moyen > nombre1) {
                    System.out.println("trop petit");
                    }
                    if (moyen < nombre1) {
                    System.out.println("trop grand");
                    }
                    if (moyen > 5*nombre1) {
                    System.out.println("vraiment trop petit");
                    }
                    if (moyen < nombre1/5) {
                    System.out.println("vraiment trop grand");
                    }  
                }
            }
        }
        
        if (niveauxdifficulté==3) {
            System.out.println("Vous avez choisi le niveau difficile saisissez un nombre entre 0 et 50");
            while (1==1) {
                int nombre1 = sc.nextInt();
                compteur=compteur+1;
        
                if (nombre1 > 50) {
                    System.out.println("entrez un chiffre compris entre 0 et 25");
                }
                
                if (nombre1 < 0) {
                    System.out.println("entrez un chiffre compris entre 0 et 25");
                }
            
                if (0 < nombre1 < 50) {              
                    if (difficile == nombre1) {
                        System.out.println("gagné");
                        System.out.println(compteur);
                    }
                    if (difficile > nombre1) {
                    System.out.println("trop petit");
                    }
                    if (difficile < nombre1) {
                    System.out.println("trop grand");
                    }
                    if (difficile > 5*nombre1) {
                    System.out.println("vraiment trop petit");
                    }
                    if (difficile < nombre1/5) {
                    System.out.println("vraiment trop grand");
                    }  
                }
            }
        } 
}