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
        String jetonCourant;
        boolean trouNoir;
        boolean desintegrateur;
     
     public void Cellule() {
         trouNoir=false;
         desintegrateur=false;
         jetonCourant=null; 
     }
     
     public boolean affecterJeton(String Jeton) {
         if(jetonCourant==null){
             jetonCourant=Jeton;
          return true;
         }
         else{
             return false;
         }
     }
     
     public Jeton recupereJeton(Jeton Jeton){
       return Jeton;
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
     
     }
     
     public String lireCouleurDuJeton() {
       if(jetonCourant!=null){
           jetonCourant.lireCouleur();
           return jetonCourant.Couleur;
       }
       else{
           return "vide";
     }
     }
     
     public boolean recupererDesintegrateur() {
     
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
 

