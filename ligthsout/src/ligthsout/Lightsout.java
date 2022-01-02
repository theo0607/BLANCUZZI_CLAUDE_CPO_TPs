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
    
    public boolean [ ][ ] grille;
    
    public Lightsout(int taillegrille){
      
      grille = new boolean [taillegrille][taillegrille];
      
      for (int i=0 ; i<taillegrille; i++){
          for (int j=0 ; j<taillegrille; j++){
              grille[i][j] = false;
          }
      }
   }
    
    public void afficherGrilleFacile(){
       int i;
       int j;
       for (j=0;j<5;j++){
           for (i=0;i<5;i++){
                    if (grille[i][j]==true){
                        System.out.print("\033[36mO \033[30m");
                    }

                    else {
                        System.out.print("O ");
                    }
           }
        System.out.println("" + (j+1));
        }
        for(int l=0; l<5;l++){
            System.out.print("" + (l+1) + " ");
        }
        System.out.println();
    }
   
   public void afficherGrilleDifficile(){
       int i;
       int j;
       for (j=0;j<9;j++){
           for (i=0;i<9;i++){
                    if (grille[i][j]==true){
                        System.out.print("\033[36mO \033[30m");
                    }

                    else {
                        System.out.print("O ");
                    }
           }
        System.out.println("" + (j+1));
        }
        for(int l=0; l<9;l++){
            System.out.print("" + (l+1) + " ");
        }
        System.out.println();
    }
   
   public void debutpartie(){
       for(int i=0 ; i<grille.length ; i++){
          for(int j=0 ; j<grille.length ; j++){
                if(Math.random()>0.65){
                 grille[i][j]=true;
                }
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
       for(int i=0 ; i<grille.length ; i++){
          for(int j=0 ; j<grille.length ; j++){
            if(grille[i][j]==true){
                return false;
            }
       }
    }
       return true;
   }
    
}
