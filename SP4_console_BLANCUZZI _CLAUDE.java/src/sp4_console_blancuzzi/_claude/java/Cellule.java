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
         trouNoir=false;//initialise trouNoir
         desintegrateur=false;//initialise desintegrateur
         jetonCourant=null;//initialise jetoncourant
     }
     
     public boolean affecterJeton(Jeton j) {
         
         if(jetonCourant==null){//Verifie si jeton courant n'a pas de valeur. Si oui, on lui incremente la valeur d'un nouveau jeton
             jetonCourant=j;
         if (prensenceTrouNoir()==true){//Condition verifiant la presence de trou noir
             activerTrouNoir();//Si il y a presence de trou trou noir alors on l'active
         }    
           return true; //retourne vrai
         }
         
         else{
             return false;//retourne faux sinon
         }
     }
     
     public Jeton recupereJeton(){
       return jetonCourant;
     }
     
     public boolean supprimerJeton() {
         jetonCourant=null;//incremente la nullité a jeton courant
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
           return true;//retourne vrai si il y a un trou noir
        }
       else{
           return false;//retourne faux sinon
       }
       }
     
     public boolean presenceDesintegrateur() {
       if(desintegrateur==true){
           return true;//retourne vrai si il y a un desintegrateur
        }
       else{
           return false;//retourne faux sinon
       }
       }
     
     public String lireCouleurDuJeton() {
       if(jetonCourant!=null){
           jetonCourant.lireCouleur();//utilise la fonction lircouleur sur jetoncourant
           return jetonCourant.couleur;//retourne la couleur de jetoncourant
       }
       else{
           return "vide";
     }
     }
     
     public boolean recupererDesintegrateur() {
       if(desintegrateur==true){
            return false;//retourne faux si il y a un desintegratueur
        }
        else{
            return true;//retourne vrai sinin
        }
     }
     
     public boolean activerTrouNoir() {
      if(trouNoir==true & jetonCourant!=null){//condition verifiant que jeton courant ne soit pas nul et qu'il y ai un trou noir
          jetonCourant=null;//on incrémente la nullité a jetoncourant
          trouNoir=false;//trou noir prend la valeur vrai
          return true;
      }
      else{
          return false;
      }
     }
   }