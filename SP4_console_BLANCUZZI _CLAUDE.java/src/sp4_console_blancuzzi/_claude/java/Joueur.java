/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_blancuzzi._claude.java;

/**
 *
 * @author theob
 */
public class Joueur {
    String Nom ;
    String couleur ;
    Jeton [] ListeJetons = new Jeton[21];
    int nombreJetonsRestants = ListeJetons.length ;
   
    public Joueur(String NomJoueur){
        Nom = NomJoueur ;
    }
   
    public void affecterCouleur(String CouleurJoueur){
        couleur = CouleurJoueur ;
    }
   
    public boolean ajouterJeton(Jeton JetonJoueur){
           if(nombreJetonsRestants!=21){
               ListeJetons[nombreJetonsRestants]=JetonJoueur ;
               return true ;
           }
           else {
               return false ;
           }          
    }
}