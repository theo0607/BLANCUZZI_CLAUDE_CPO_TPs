/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligthsout;

/**
 *
 * @author theob
 */


public class grille {
    cellule [][] CaseJeu = new cellule [5][5];
    

public  grille(){
       int i;
       int j;
       for(i=0;i<5;i++){
            for(j=0;j<5;j++) {
              CaseJeu[i][j] = new cellule();  
            }  
        }
   }


public String lireCouleurDeLaCase(int c,int l){
       return CaseJeu[c][l].lireCouleurDeLaCase();
   }


public void afficherGrilleSurConsole(){
       int i;
       int j;
       for (j=0;j<5;j++){
           for (i=0;i<5;i++){
                    if (lireCouleurDeLaCase(i,j)=="bleu"){
                        System.out.print("\033[31mO \033[30m");
                    }        
                         
                    else if (lireCouleurDeLaCase(i,j)=="vide"){
                        System.out.print("O ");
                    }  
           }
        System.out.println("");        
       }  
   }


public boolean supprimerCase(int c,int l){
       if(CaseJeu[c][l].caseCourante!=null){
          CaseJeu[c][l].caseCourante=null;
           return true;
       }else{
           return false;
       }
   }


public boolean celluleOccupee(int c,int l){
       if (CaseJeu[c][l]!=null){
           return true;
       }
       return false;
   }
   

public boolean placerLumiere(int c,int l){
       if(CaseJeu[c][l].placerLumiere()==true){
           return false;
       }
       else{
           CaseJeu[c][l].placerLumiere();
           return true;
       }
   }


public boolean EtreRemplie(){ 
       int i;
       int j;
       for (i=0;i<5;i++){
           for (j=0;j<5;j++){
               if (CaseJeu[i][j].Lumiere==false){
                    return false;
               }
           }
       }
       return true; 
   }


public boolean etreGagnantePourJoueur(){
    if(EtreRemplie()==true){
        return true;
    }
    else{
        return false;
    }
}


public String ChangerCouleur(int c, int l){
       if (CaseJeu[c][l].lireCouleurDeLaCase()=="bleu"){
           return "vide";
       }  
        return "bleu";     
       }  
}
