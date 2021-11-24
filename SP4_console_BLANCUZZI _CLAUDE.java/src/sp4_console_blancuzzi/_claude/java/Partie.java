/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blancuzzi._claude.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author theob
 */
public class Partie {

    Joueur [] ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();
    Random rand = new Random();
    
    public Partie(Joueur premierJoueur, Joueur deuxiemeJoueur){
        ListeJoueurs[0] = premierJoueur;
        ListeJoueurs[1] = deuxiemeJoueur;

    }

    public void initialiserPartie(){
        for (int i = 0 ; i < 21 ; i++){

            Jeton jetonJoueur1 = new Jeton("rouge");
            Jeton jetonJoueur2 = new Jeton("jaune");

            ListeJoueurs[0].ListeJetons[i] = jetonJoueur1;
            ListeJoueurs[1].ListeJetons[i] = jetonJoueur2;
        }
    }
    
    public void debuterPartie(){
            Scanner sc = new Scanner(System.in);

            int c;
            int nbJetRestJoueur1 = 21;
            int nbJetRestJoueur2 = 21;

            joueurCourant = ListeJoueurs[0];

            grilleJeu.afficherGrilleSurConsole();
        
            while (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])!=true && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])!=true && grilleJeu.EtreRemplie()==true){

                System.out.println("C'est à "+joueurCourant.Nom+" de jouer.\nRentrez la colonne où vous voulez jouer : ");
                c = sc.nextInt();


                while (c < 1 && c > 7 && grilleJeu.colonneRemplie(c) == true){
                    System.out.println("Erreur : veillez saissir une colonne ou une cellule valide");
                    c = sc.nextInt();
                }
            
            
   Jeton JetonAPlacer;

                if (joueurCourant == ListeJoueurs[0]){
                       JetonAPlacer = joueurCourant.ListeJetons[nbJetRestJoueur1-1];
                    nbJetRestJoueur1--;

                    joueurCourant = ListeJoueurs[1];
                }
               else{

                    JetonAPlacer = joueurCourant.ListeJetons[nbJetRestJoueur2-1];
                    nbJetRestJoueur2--;

                    joueurCourant = ListeJoueurs[0];
                }

                grilleJeu.ajouterJetonDansColonne(JetonAPlacer, c);
                grilleJeu.afficherGrilleSurConsole();

                if (grilleJeu.EtreRemplie() != true){                  
                    break;  
                }                   
            }
    }
    
    public void attribuerCouleursAuxJoueurs(){
    ListeJoueurs[0].affecterCouleur("rouge");
    ListeJoueurs[1].affecterCouleur("jaune");
    }
}


