/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_blancuzzi_claude;

/**
 *
 * @author theob
 */
public class TP2_Bieres_BLANCUZZI_CLAUDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere Despe = new BouteilleBiere("DESPE", (double) 6.4,"Je vais t'ouvrir", true);
        Despe.Decapsuler();
        Despe.lireEtiquette();
        System.out.println(Despe);
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (double) 7.0,"Dubuisson", true);
        uneBiere.Decapsuler();
        uneBiere.lireEtiquette();
        System.out.println(uneBiere);
        
        BouteilleBiere blonde86 = new BouteilleBiere("Cuvée des blondes", (double) 8.6,"La cave", false);
        blonde86.Decapsuler();
        blonde86.lireEtiquette();
        System.out.println(blonde86) ;
                   
   }
}

    


    
    

