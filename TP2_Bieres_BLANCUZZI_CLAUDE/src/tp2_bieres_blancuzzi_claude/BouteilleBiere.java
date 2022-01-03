/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_blancuzzi_claude;

/**
 *
 * @author theob
 */
class BouteilleBiere {
  String nom;
  double degreAlcool;
  String brasserie;
  boolean ouverte;


public BouteilleBiere(String unNom, double unDegre, String uneBrasserie, boolean ouvrir) {
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = ouvrir;
}

public void Decapsuler(){
   if (ouverte == false){
       ouverte = true;
   }
   else {
       System.out.println(" erreur : biere déjà ouverte");
       ouverte = false;
   }

}
public void lireEtiquette() {
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie +"\n"+ouverte ) ;
}

public String toString() {
    String Despe;
    Despe = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
    if (ouverte == true ) Despe += "oui" ;
    else Despe += "non" ;
    return Despe ;
} 
        
}  



    
