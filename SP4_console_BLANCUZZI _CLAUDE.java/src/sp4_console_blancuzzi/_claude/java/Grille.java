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

   Cellule [][] CellulesJeu = new Cellule [7][6];

   public Grille(){
       int i;
       int j;
       for(i=0;i<7;i++){
            for(j=0;j<6;j++) {
              CellulesJeu[i][j] = new Cellule();  
            }   
        }
   } 
   
   public boolean ajouterJetonDansColonne(Jeton Jeton,int c){
       int i;
       for (i=0;i<7;i++){
            if (CellulesJeu[c-1][5-i].jetonCourant==null){               
                CellulesJeu[c-1][5-i].affecterJeton(Jeton);               
                return true;
            }
       }
       return false;
   }

   public boolean EtreRemplie(){
       int i;
       int j;
       for (i=0;i<7;i++){
           for (j=0;j<6;j++){
               if (CellulesJeu[i][j]==null){

                    return false;
               }
           }
       }
       return true;
   }

   public void viderGrille(){
       CellulesJeu = null ;
   }
   
   public void afficherGrilleSurConsole(){
       int i;
       int j;
       for (j=0;j<6;j++){
           for (i=0;i<7;i++){
                if (CellulesJeu[i][j]!=null){
                    if (lireCouleurDuJeton(i,j)=="rouge"){
                        System.out.print("\033[31mR "); 
                    }
                    if (lireCouleurDuJeton(i,j)=="jaune"){
                        System.out.print("\033[33mJ ");
                    }                   
                
                    if (lireCouleurDuJeton(i,j)=="vide"){
                        System.out.print("O ");
                    }
                }
           }
        System.out.println("");        
       }   
   }
   
   public boolean placerDesintegrateur(int c, int l){
       if(CellulesJeu[c][l].desintegrateur){
           CellulesJeu[c][l].desintegrateur=true;
           return true;
       }
       else{
           return false;
       }
   }
   
   public Jeton recupererJeton(int c, int l){
       Jeton j = CellulesJeu[c][l].recupereJeton();
       CellulesJeu[c][l].supprimerJeton();
       return j;
   }

public boolean celluleOccupee(int c,int l){
       if (CellulesJeu[c][l]!=null){
           return true;
       }
       return false;
   }

   public String lireCouleurDuJeton(int c,int l){
       return CellulesJeu[c][l].lireCouleurDuJeton();
   }

   public boolean etreGagnantePourJoueur(Joueur J){
       int i;
       int j, l;
       int cmpt=0;
       int cpt=0;
       int ct=0;
       int c=0;
       for (i=0;i<7;i++){
           for (j=0;j<6;j++){
                for (l=0;l<4;l++){
                    if ((i<4)&&(lireCouleurDuJeton(l+i,j)==J.couleur)){
                        cmpt+=1;
                    }
                        if(cmpt==4){
                            return true;
                        }
                    if ((j<3)&&(lireCouleurDuJeton(i,j+l)==J.couleur)){
                        cpt+=1;
                    }
                        if(cpt==4){
                            return true;
                        }
                    if ((i>=0 && i<4) && (j>=3 && j<6) && lireCouleurDuJeton(l+i,j-l)==J.couleur){
                        ct+=1;

                        if(ct==4){
                            return true;
                        }

                    }
                    if ((i>=3 && i<7) && (j>=3 && j<6) && lireCouleurDuJeton(j-l,j-l)==J.couleur){
                        c+=1;
                        if(c==4){
                            return true;
                            }
                        }
                }
            }
        }
       return false;
   }
   
   public boolean colonneRemplie(int c){
    if(CellulesJeu[c][5].jetonCourant!=null){
        return true;  
        }
        else{
             return false;
                }
   }
   
   public boolean placerTrouNoir(int c,int l){
       if(CellulesJeu[c][l].trouNoir){
           CellulesJeu[c][l].trouNoir=true;
           return true;
       }
       else{
           return false;
       }
   }
  
   public boolean supprimerJeton(int c,int l){
       if(CellulesJeu[c][l].jetonCourant!=null){
          CellulesJeu[c][l].jetonCourant=null;
           return true;
       }
       else{
           return false;
       }
   }
   
   public void tasserGrille(int c){
       int i;
       for(i=0;i<7;i++){
           if(CellulesJeu[c][i]==null){
               CellulesJeu[c][i]=CellulesJeu[c][i+i];
               CellulesJeu[c][i+1]=null;
           }
       }
   }
}



 