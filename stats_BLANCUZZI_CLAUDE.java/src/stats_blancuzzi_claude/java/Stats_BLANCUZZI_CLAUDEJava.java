/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stats_blancuzzi_claude.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author theob
 */
public class Stats_BLANCUZZI_CLAUDEJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] tableauEntier = new int[6]; // creer un tab de 6 entier (initialisé à 0)
        int m = sc.nextInt();//demande a l'utilisateur de saisir un nombre
        int i;//declaration variable i 
        int j;//declaration variable j
        Random generateurAleat = new Random();
        
        for (i=0;i<m;i++){ //boucle pour i allant de 1 à m
            int n = generateurAleat.nextInt(5);//genere un nombre aléatoire entre 0 et 5
            
            tableauEntier[n]++ ; // ajoute 1 a chaque case tiré aléatoirement  
        }   
        for (j=0;j<6;j++) {
            System.out.println(tableauEntier[j] +" : "+ tableauEntier[j]* 100/m + "%");//affiche chaque case du tableau 
        }  
    }
    
}