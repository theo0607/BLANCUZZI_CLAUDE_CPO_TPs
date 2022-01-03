/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_blancuzzi_claude.java;

/**
 *
 * @author theob
 */
public class TP2_convertisseurObjet_BLANCUZZI_CLAUDEJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    class Convertisseur{
double CelciusVersKelvin;
double KelvinVersCelcius;
double FarenheitVersCelcius;
double CelciusVersFarenheit;
double FarenheitVersKelvin;
double KelvinVersFarenheit;
int nbConversions;
String toString;

public Convertisseur () {
 nbConversions = 0 ;
}


public static double CelciusVersKelvin ( double tempCelcius) {
    double tempKelvin =  (tempCelcius + 273.15);
    return tempKelvin;
}
public static double KelvinVersCelcius ( double tempKelvin ) {
    double tempCelcius =  (tempKelvin - 273.15);
    return tempCelcius;
} 
public static double FarenheitVersCelcius ( double tempFarenheit ) {
    double tempCelcius =  ((tempFarenheit - 32) * 5/9);
    return tempCelcius;
} 
public static double CelciusVersFarenheit ( double tempCelcius ) {
    double tempFarenheit =  (tempCelcius * 9/5) + 32;
    return tempFarenheit;
} 
public static double KelvinVersFarenheit ( double tempKelvin ) {
    double tempFarenheit =  (tempKelvin - 273.15) * 9/5 + 32 ;
    return tempFarenheit;
}
public static double FarenheitVersKelvin ( double tempFarenheit ) {
    double tempKelvin =  ( (tempFarenheit - 32) * 5/9 + 273.15);
    return tempKelvin;
}
}
}

