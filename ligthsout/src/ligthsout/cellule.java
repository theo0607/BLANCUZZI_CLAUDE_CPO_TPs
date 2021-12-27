/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligthsout;

/**
 *
 * @author theob
 */
public class cellule {
        String Couleur;
        Case caseCourante;
        boolean Lumiere;
        
    public void Cellule() {
         caseCourante=null;
         Lumiere=false;
     }
     
    public boolean placerLumiere() {
       if(Lumiere==false){ 
             Lumiere=true;
             return true;
       }
       else{
           return false;
       }  
      }
    
     public String lireCouleurDeLaCase() {
       if(Lumiere==true){
           //caseCourante.lireCouleur();
           //return caseCourante.couleur;
           return "bleu";
       }else{
           return "vide";
     }
     }
}
    
