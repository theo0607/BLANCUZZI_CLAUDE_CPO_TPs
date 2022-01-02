/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligthsout;

/**
 *
 * @author theob
 */
public class Lightsout {
    
    public boolean [ ][ ] grille; //initialisation de la grille
    
    public Lightsout(int taillegrille){ // utilisation d'un constructeur 
      
      grille = new boolean [taillegrille][taillegrille]; 
      
      for (int i=0 ; i<taillegrille; i++){// création de notre grille
          for (int j=0 ; j<taillegrille; j++){
              grille[i][j] = false; // au début toutes nos cases sont éteintes 
          }
      }
   }
    
    public void afficherGrilleFacile(){
       int i;
       int j;
       for (j=0;j<5;j++){
           for (i=0;i<5;i++){
                    if (grille[i][j]==true){
                        System.out.print("\033[36mO \033[30m"); // attribue une couleur pour les cases allumées
                    }

                    else {
                        System.out.print("O "); // attribue une couleur pour les cases éteintes
                    }
           }
        System.out.println("" + (j+1)); // cette partie permet d'afficher les numéros des lignes et des colonnes
        }
        for(int l=0; l<5;l++){
            System.out.print("" + (l+1) + " ");
        }
        System.out.println(); // permet d'afficher notre grille 
    }
   
   public void afficherGrilleDifficile(){
       int i;
       int j;
       for (j=0;j<9;j++){
           for (i=0;i<9;i++){
                    if (grille[i][j]==true){
                        System.out.print("\033[36mO \033[30m"); // attribue une couleur pour les cases allumées
                    }

                    else {
                        System.out.print("O "); // attribue une couleur pour les cases éteintes
                    }
           }
        System.out.println("" + (j+1)); // cette partie permet d'afficher les numéros des lignes et des colonnes
        }
        for(int l=0; l<9;l++){
            System.out.print("" + (l+1) + " ");
        }
        System.out.println(); // permet d'afficher notre grille 
    }
   
   public void debutpartie(){
       for(int i=0 ; i<grille.length ; i++){ // parcours les lignes de la grille
          for(int j=0 ; j<grille.length ; j++){ // parcours les colonnes de la grille
                if(Math.random()>0.4){ // créé un nombre aléatoire pour chaque case de la grille
                 grille[i][j]=true;// si ce nombre est supérieur à 0.8 alors la case devient colorée 
                }                  // augmenter ou diminuer le nombre permet de modifier la difficulté 
            }
        }
   }
   
   public void verifplacement(int c,int l){
       grille[c-1][l-1] =! grille[c-1][l-1];
       
       if(c-1<grille.length - 1){
       grille[c+1-1][l-1] =! grille[c+1-1][l-1];
       }
       
       if(l-1<grille.length - 1){
       grille[c-1][l+1-1] =! grille[c-1][l+1-1];
       }
       
       if(c-1>0){
       grille[c-1-1][l-1] =! grille[c-1-1][l-1];
       }
       
       if(l-1>0){
       grille[c-1][l-1-1] =! grille[c-1][l-1-1];
       }
   }
   
   public boolean etregagnant(){
       for(int i=0 ; i<grille.length ; i++){ // parcours les lignes de la grille
          for(int j=0 ; j<grille.length ; j++){ // parcours les colonnnes de la grille
            if(grille[i][j]==true){ // si on trouve une case de la grille allumé
                return false; // alors on renvoie false on a pas gagné 
            }
          }
        }
       return true; // sinon on a gagné 
   }
    
}
