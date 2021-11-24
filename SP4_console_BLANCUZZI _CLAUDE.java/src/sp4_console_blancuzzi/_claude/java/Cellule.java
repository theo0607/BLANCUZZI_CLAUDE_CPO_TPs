/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blancuzzi._claude.java;

/**
 *
 * @author theob
 */

   public class Cellule {
        Jeton jetonCourant;
        boolean trouNoir;
        boolean desintegrateur;
     
     public void Cellule() {
         trouNoir=false;
         desintegrateur=false;
         jetonCourant=null;
     }
     
     public boolean affecterJeton(Jeton j) {
         if(jetonCourant==null){
             jetonCourant=j;
           return true;
         }
         else{
             return false;
         }
     }
     
     public Jeton recupereJeton(){
       return jetonCourant;
     }
     
     public boolean supprimerJeton() {
         jetonCourant=null;
         return true;
     }
     
     public boolean placerTrouNoir() {
       if(trouNoir==false){
             trouNoir=true;
             return true;
       }
       else{
           return false;
       }  
      }
     
     public boolean placerDesintegrateur() {
        if(desintegrateur==false){
             desintegrateur=true;
             return true;
       }
       else{
           return false;
       }  
      }
     
     public boolean prensenceTrouNoir() {
       if(trouNoir==true){
           return true;
        }
       else{
           return false;
       }
       }
     
     public boolean presenceDesintegrateur() {
       if(desintegrateur==true){
           return true;
        }
       else{
           return false;
       }
       }
     
     public String lireCouleurDuJeton() {
       if(jetonCourant!=null){
           jetonCourant.lireCouleur();
           return jetonCourant.couleur;
       }
       else{
           return "vide";
     }
     }
     
     public boolean recupererDesintegrateur() {
       if(desintegrateur==true){
            return false;
        }
        else{
            return true;
        }
     }
     
     public boolean activerTrouNoir() {
      if(trouNoir==true & jetonCourant!=null){
          jetonCourant=null;
          trouNoir=false;
          return true;
      }
      else{
          return false;
      }
     }
   }
 