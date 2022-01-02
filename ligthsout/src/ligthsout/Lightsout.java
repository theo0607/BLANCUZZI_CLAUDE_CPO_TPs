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
    
}
