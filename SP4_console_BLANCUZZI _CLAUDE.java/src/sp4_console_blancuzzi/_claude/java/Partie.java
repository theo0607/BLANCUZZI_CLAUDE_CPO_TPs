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

    Joueur [] ListeJoueurs = new Joueur[2]; // on créé une liste de 2 joueur 
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();
    Random rand = new Random();
    int JetonRestant;
    Scanner scanner = new Scanner(System.in);
    
    public Partie(Joueur premierJoueur, Joueur deuxiemeJoueur){//prend en argument le premier joueur et le deuxieme
        ListeJoueurs[0] = premierJoueur; // le premier objet de la liste est le premier joueur
        ListeJoueurs[1] = deuxiemeJoueur; // le deuxieme objet de la liste est le deuxieme joueur
    }

    public void initialiserPartie(){
        for (int i = 0 ; i < 21 ; i++){

            Jeton jetonJoueur1 = new Jeton("rouge");//on attribue la couleur rouge au jeton du joueur1
            Jeton jetonJoueur2 = new Jeton("jaune");//on attribue la couleur jaune au jeton du joueur2

            ListeJoueurs[0].ListeJetons[i] = jetonJoueur1;//on donne au joueur1 sa liste de jetons
            ListeJoueurs[1].ListeJetons[i] = jetonJoueur2;//on donne au joueur2 sa liste de jetons
        }
            for(int i=0;i<5;i++){ // on répartie aléatoirement sur la grille 5 trou noir
                Random aleatoire = new Random();
                int caleatoire = aleatoire.nextInt(6);// aléatoirement de 0 à 6 
                int laleatoire = aleatoire.nextInt(5);// aléatoirement de 0 à 5
                grilleJeu.placerTrouNoir(caleatoire,laleatoire);//  placerTrouNoir prend en entrée les coordonnées aléatoires
            }    
    }
    
    public void debuterPartie(){
            Scanner sc = new Scanner(System.in);
            int choix;
            int c;// entier colonne 
            int l;// entier ligne
            int nbJetRestJoueur1 = 21;//on part de 21 jetons pour chaque joueur
            int nbJetRestJoueur2 = 21;//on part de 21 jetons pour chaque joueur

            joueurCourant = ListeJoueurs[0];//on commence par le premier joueur de la liste 
            grilleJeu.afficherGrilleSurConsole();//on affiche la grille 
        
            
            while (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])!=true && grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1])!=true && grilleJeu.EtreRemplie()!=true){
            // tant qu'il n'y a pas de gagnant on continue et tant que la grille n'est pas remplie
                choix = sc.nextInt(3);
                System.out.println("entrez 0 si vous voulez récupérer un jeton, entrez 1 si vous voulez placer un jeton,entrez 2 si vous voulez désintégrer un jeton");
                
                if(choix==2){
                System.out.println("Indiquez la colonne du jeton que vous souhaitez désintégrer");
                int colonne = scanner.nextInt();
                System.out.println("Indiquez la ligne du jeton que vous souhaitez désintégrer");
                int ligne = scanner.nextInt();
          
                if (colonne!=0 && colonne!=1 && colonne!=2 && colonne!=3 && colonne!=4 && colonne!=5 && colonne!=6 ){
                    System.out.println("Vous êtes à l'extérieur de la grille");
                    continue;
                }
                if (ligne!=0 && ligne!=1 && ligne!=2 && ligne!=3 && ligne!=4 && ligne!=5){
                    System.out.println("Vous êtes à l'extérieur de la grille");
                    continue;
                }
                if (grilleJeu.celluleOccupee(ligne,colonne)== false && grilleJeu.CellulesJeu[ligne][colonne].lireCouleurDuJeton() == joueurCourant.couleur){
                    System.out.println("Veuillez choisir un jeton de votre adversaire");
                    continue;
                }
                grilleJeu.CellulesJeu[ligne][colonne].supprimerJeton();
                grilleJeu.tasserGrille(colonne);
                grilleJeu.afficherGrilleSurConsole();
                joueurCourant.utiliserDesintegrateur() ;
                }
                
                if(choix==0){//si on souhaite récupérer un jeton
                    System.out.println("Choisissez ligne");
                    l = sc.nextInt();//on demande la ligne 
                    
                    System.out.println("Choisissez colonne");
                    c = sc.nextInt();//on demande la colonne
                    
                    if (grilleJeu.CellulesJeu[c-1][l-1].jetonCourant!=null){//s'il y a bien un jeton dans la cellule choisie
                      grilleJeu.recupererJeton(c-1,l-1);
                      grilleJeu.supprimerJeton(c-1,l-1);
                      grilleJeu.tasserGrille(c-1);           
                    }
                    joueurCourant.ListeJetons[nbJetRestJoueur1] = joueurCourant.ListeJetons[nbJetRestJoueur1 + 1];
                }
                
                if(choix==1){//si on souhaite placer un jeton
                 
                System.out.println("C'est à "+joueurCourant.Nom+" de jouer.\nRentrez la colonne où vous voulez jouer : ");
                c = sc.nextInt(); // on demande au joueur courant de choisir une colonne 

                
                while (c < 1 && c > 7 && grilleJeu.colonneRemplie(c) == true){
                    System.out.println("Erreur : veillez saissir une colonne ou une cellule valide");
                    c = sc.nextInt();// tant que le valeur entrée est supérieure à 7 ou
                }                    //inférieur à 1 on vérifie aussi que la colonne ne soit pas remplie
                
                Jeton JetonAPlacer;
                
                if (joueurCourant == ListeJoueurs[0]){//si c est le premier joueur de la liste qui joue
                       JetonAPlacer = joueurCourant.ListeJetons[nbJetRestJoueur1-1];
                    nbJetRestJoueur1--;//on enleve 1 jeton au nombre de jeton restants du joueur1 à chaque tour

                    joueurCourant = ListeJoueurs[1];//c'est au tour de l'autre joueur de jouer
                }  
                else{//si c est le deuxième joueur de la liste qui joue
                    JetonAPlacer = joueurCourant.ListeJetons[nbJetRestJoueur2-1];
                    nbJetRestJoueur2--;//on enleve 1 jeton au nombre de jeton restants du joueur2 à chaque tour

                    joueurCourant = ListeJoueurs[0];//c'est au tour de l'autre joueur de jouer
                }

                grilleJeu.ajouterJetonDansColonne(JetonAPlacer, c);//on appelle la méthode ajouterJetonDansColonne
                grilleJeu.afficherGrilleSurConsole();              // prend en entrée une colonne et un jeton
                 // on affiche la grille 
                if (grilleJeu.EtreRemplie() == true){                  
                    break; // si la grille est remplie on sort de la boucle
                }  
                }
                
            }
    }
    
    public void attribuerCouleursAuxJoueurs(){
    ListeJoueurs[0].affecterCouleur("rouge");//on affecte la couleur rouge au premier joueur de la liste 
    ListeJoueurs[1].affecterCouleur("jaune");//on affecte la couleur jaune au deuxième joueur de la liste 
    }
}


