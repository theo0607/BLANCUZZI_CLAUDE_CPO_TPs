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
        System.out.println("Entrez nom d'un joueur : ");// on demande à l'utiisateur d'entrer un nom
        
        String NomduPremierJoueur = main.nextLine();
        Joueur NomJ1 = new Joueur(NomduPremierJoueur);// on créé un premier nom de joueur 
        
        String NomduDeuxiemeJoueur = main.nextLine();
        Joueur NomJ2 = new Joueur(NomduDeuxiemeJoueur);// on créé un deuxième nom de joueur 
        
        Partie partie = new Partie(NomJ1,NomJ2);// on créé une nouvelle partie qui prend le nom des deux joueurs 
        partie.initialiserPartie(); // on appelle la méthode initialiserPartie
        partie.attribuerCouleursAuxJoueurs();// on appelle la méthode attribuerCouleursAuxJoueurs
        partie.debuterPartie();// on appelle la méthode debuterPartie
    }    
}
