/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_blancuzzi._claude.java;

import java.util.Scanner;

/**
 *
 * @author theob
 */
public class SP4_console_BLANCUZZI_CLAUDEJava {

    public static void main(String[] args) {
       
        Scanner main= new Scanner(System.in);
        System.out.println("Entrez nom d'un joueur : ");
        
        String NomduPremierJoueur = main.nextLine();
        Joueur NomJ1 = new Joueur(NomduPremierJoueur);
        
        String NomduDeuxiemeJoueur = main.nextLine();
        Joueur NomJ2 = new Joueur(NomduDeuxiemeJoueur);
        
        Partie partie = new Partie(NomJ1,NomJ2);
        partie.initialiserPartie();
        partie.attribuerCouleursAuxJoueurs();
        partie.debuterPartie();       
    }    
}
