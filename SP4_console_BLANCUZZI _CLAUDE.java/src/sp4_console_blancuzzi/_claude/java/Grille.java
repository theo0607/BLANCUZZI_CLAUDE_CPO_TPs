/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blancuzzi._claude.java;

/**
 *
 * @author theob
 */
public class Grille {

   Cellule [][] CellulesJeu = new Cellule [7][6];// on créé un tableau de 7 colonnes et 6 lignes

   public Grille(){ // on créé une grille de 7 colonnes et 6 lignes 
       int i; 
       int j;
       for(i=0;i<7;i++){ 
            for(j=0;j<6;j++) {
              CellulesJeu[i][j] = new Cellule(); 
            }   
        }
   } 
   
   public boolean ajouterJetonDansColonne(Jeton Jeton,int c){ // prend en argument une colonne et un jeton
       int i;
       for (i=0;i<7;i++){
            if (CellulesJeu[c-1][5-i].jetonCourant==null){ // on vérifie que la cellule ne contient pas de jeton            
                CellulesJeu[c-1][5-i].affecterJeton(Jeton); // si elle n' en contient pas on ajoute un jeton            
                return true;
            }
       }
       return false; // sinon on renvoie false ce qui revient a dire qu'il y a deja un jeton
   }

   public boolean EtreRemplie(){ // on parcours toute la et on vérifie dans chaque cellule s'il y a oui ou non un jeton
       int i;
       int j;
       for (i=0;i<7;i++){
           for (j=0;j<6;j++){
               if (CellulesJeu[i][j].jetonCourant==null){
                    return false; // si on trouve une case ou il n y a pas de jeton on renvoie false car ca veut dire que la grille n est pas pleine
               }
           }
       }
       return true; // sinon la grille est pleine 
   }

   public void viderGrille(){
       CellulesJeu = null ; // toutes les cellules jeu deviennent nulles 
   }
   
   public void afficherGrilleSurConsole(){
       int i;
       int j;
       for (j=0;j<6;j++){
           for (i=0;i<7;i++){
                    if (CellulesJeu[i][j].prensenceTrouNoir()==true){//si sur la cellule il y a bien un trou noir
                        System.out.print("\033[32mO \033[30m");//on colorie en vert O
                    }
                    else if (lireCouleurDuJeton(i,j)=="rouge"){//On attribue des couleurs au jeton
                        System.out.print("\033[31mR \033[30m");
                    }
                   
                    else if (lireCouleurDuJeton(i,j)=="jaune"){//On attribue des couleurs au jeton
                        System.out.print("\033[33mJ \033[30m");
                    }                  
                                
                    else if (lireCouleurDuJeton(i,j)=="vide"){//quand il n'y a pas de jeton on a un O
                        System.out.print("O ");
                    }            
           }
        System.out.println("");        
       }  
   }
   
   public boolean placerDesintegrateur(int c, int l){ // prend en argument une ligne est une colonne
       if(CellulesJeu[c][l].desintegrateur){ // on appelle la méthode désintégrateur 
           CellulesJeu[c][l].desintegrateur=true; // on vérifie que la désintégration soit égale a true
           return true;
       }
       else{
           return false;
       }
   }
   
   public Jeton recupererJeton(int c, int l){ // prend en argument une colonne et une ligne
       Jeton j = CellulesJeu[c][l].recupereJeton(); // on appelle la métode recupere jeton 
       CellulesJeu[c][l].supprimerJeton(); // on appelle la méthode supprimer jeton
       return j; // on retourne le jeton j en question a la colonne c et a la ligne l 
   }

public boolean celluleOccupee(int c,int l){ // prend en argument une colonne et une ligne
       if (CellulesJeu[c][l]!=null){ // on vérifie que la cellule contienne oui ou non un jeton 
           return true;
       }
       return false;
   }

   public String lireCouleurDuJeton(int c,int l){ // prend en argument une colonne et une ligne
       return CellulesJeu[c][l].lireCouleurDuJeton(); // on appelle la méthode lireCouleurDuJeton
   }

   public boolean etreGagnantePourJoueur(Joueur J){
       int i;
       int j, l;
       int cmpt=0;
       int cpt=0;
       int ct=0;
       int c=0;
       for (i=0;i<7;i++){ //boucle parcourant les colonnes de notre grille
           for (j=0;j<6;j++){ //boucle les lignes de chaque colonne de notre grille
               cmpt=0;
               cpt=0;
               ct=0;
               c=0;
                for (l=0;l<4;l++){ //boucle qui va nous permettre de verifier que 4 jetons soit a la suite pour chaque case de la grille
                    if ((i<4)&&(lireCouleurDuJeton(l+i,j)==J.couleur)){ //Condition verifiant qu'il y ai 4 jeton du joueur entrain de jouer d'affilé sur la même colonne
                        cmpt+=1; //incremente un au compteur
                    }
                        if(cmpt==4){ //permet de verifier le nombre de jetons d'affiler
                            return true; //retourne vrai
                        }
                    if ((j<3)&&(lireCouleurDuJeton(i,j+l)==J.couleur)){//Condition verifiant qu'il y ai 4 jeton du joueur entrain de jouer d'affilé sur la même ligne
                        cpt+=1;
                    }
                        if(cpt==4){
                            return true;
                        }
                    if ((i>=0 && i<4) && (j>=3 && j<6) && lireCouleurDuJeton(l+i,j-l)==J.couleur){//Condition verifiant qu'il y ai 4 jeton du joueur entrain de jouer d'affilé sur la même diagonale
                        ct+=1;

                        if(ct==4){
                            return true;
                        }

                    }
                    if ((i>=3 && i<7) && (j>=3 && j<6) && lireCouleurDuJeton(j-l,j-l)==J.couleur){//Condition verifiant qu'il y ai 4 jeton du joueur entrain de jouer d'affilé sur la même diagonale
                        c+=1;
                        if(c==4){
                            return true;
                            }
                        //A chaque condition on verifie que le comptage de jetons ne sortent pas de la grille afin d'eviter les erreurs
                        }
                }
            }
        }
       return false;
   }
   
   public boolean colonneRemplie(int c){ // prend en argument c une colonne 
    if(CellulesJeu[c][5].jetonCourant!=null){ // on vérifie que sur la derniere ligne et a
        //n'importe quelles colonnes si on a oui ou non un jeton 
        return true;  // s'il y a un jeton on retourne true 
        }
        else{
             return false; // sinon on retourne false 
                }
   }
   
   public boolean placerTrouNoir(int c,int l){ // prend en argument une colonne et une ligne
       if(CellulesJeu[c][l].prensenceTrouNoir()==true){ // s'il y a deja un trou noir on ne peut pas 
           return false;                                // en placer un dexieme au meme endroit 
       }
       else{
           CellulesJeu[c][l].placerTrouNoir(); // sinon on appelle la méthode placerTrouNoir pour le placer
           return true;
       }
   }
  
   public boolean supprimerJeton(int c,int l){ // prend en argument une colonne et une ligne
       if(CellulesJeu[c][l].jetonCourant!=null){ // s'il y a bien un jeton a l'emplacement
          CellulesJeu[c][l].jetonCourant=null; // on rend le jeton courant nul 
           return true;
       }
       else{ // sinon on renvoie faux car ca veut dire qu'il n y a pas de jeton
           return false;
       }
   }
   
   public void tasserGrille(int c){ // prend en argument une colonne 
       int i; 
       for(i=5;i>=1;i--){ // on enleve 1 à i àchaque fois tant qu'il est supérieur ou egal à 1 
           if(CellulesJeu[c][i].jetonCourant==null){ // si la cellule est nulle
               CellulesJeu[c][i].jetonCourant=CellulesJeu[c][i-1].jetonCourant; // la cellule prend la valeur 
               CellulesJeu[c][i-1].jetonCourant=null;                          // de la cellule en dessous
           }                                                                   // la cellule en dessous devient nulle
       }
   }
}



 