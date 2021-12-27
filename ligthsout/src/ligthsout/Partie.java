/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligthsout;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author theob
 */
public class Partie {
    grille grilleJeu = new grille();
    Random rand = new Random();
    
        public void initialiserPartie(){
            for(int i=0;i<5;i++){
                Random aleatoire = new Random();
                int caleatoire = aleatoire.nextInt(5);
                int laleatoire = aleatoire.nextInt(5);
                grilleJeu.placerLumiere(caleatoire,laleatoire);
                }
    }
        
    public void debuterPartie(){
            Scanner sc = new Scanner(System.in);
            int choix;
            int c;
            int l;
            
            grilleJeu.afficherGrilleSurConsole();
            
            while (grilleJeu.etreGagnantePourJoueur()==false){
                System.out.println("placer une lumiere : ");
                System.out.println("Choisissez ligne");
                
                l = sc.nextInt();
                System.out.println("Choisissez colonne");
                c = sc.nextInt();
                while (c < 1 && c > 5){
                    System.out.println("Erreur : veillez saissir une colonne ou une cellule valide");
                    c = sc.nextInt();
                }
                if (c>1 && c<5 && l<5 && l>1){
                    String changer =grilleJeu.ChangerCouleur(c-1, l-1);
                    changer = grilleJeu.lireCouleurDeLaCase(c-1, l-1);
                    grilleJeu.placerLumiere(c-1, l-1);
                }
            grilleJeu.afficherGrilleSurConsole();
            }
            
            
       }
       }
    