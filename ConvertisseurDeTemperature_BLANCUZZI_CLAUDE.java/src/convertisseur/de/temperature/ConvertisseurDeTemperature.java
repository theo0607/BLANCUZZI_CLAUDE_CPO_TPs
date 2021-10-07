/*CLAUDE Ethan
  BLANCUZZI Theo
  TP1-EXERCICE 2
 
 */
package convertisseur.de.temperature;

import java.util.Scanner;

/**
 *
 * @author ethan
 */
public class ConvertisseurDeTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bonjour, saisissez une temperature : ");
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        System.out.println("""
                           1) De Celcius vers Kelvin
                           2) De Kelvin vers Celcius 
                           3) De Celcius vers Farenheit
                           4) De Farenheit vers Celcius
                           5) De Kelvin vers Farenheit
                           6) De Farenheit vers Kelvin""");
        int valeur = sc.nextInt();
        if (valeur == 1){
            float temperatureKelvin = CelciusVersKelvin(temp);
            System.out.println("Convertion de Celcius vers Kelvin : "+temperatureKelvin);
        }
        if (valeur == 2){
            float temperatureCelcius = KelvinVersCelcius(temp);
            System.out.println("Convertion de Kelvin vers Celcius : "+temperatureCelcius);
        }
        if (valeur == 3){
            float temperatureFarenheit = CelciusVersFarenheit(temp);
            System.out.println("Convertion de Celcius vers Farenheit : "+temperatureFarenheit);
        }
        if (valeur == 4){
            float temperatureCelcius = FarenheitVersCelcius(temp);
            System.out.println("Convertion de Farenheit vers Celcius : "+temperatureCelcius);
        }
        if (valeur == 5){
            float temperatureFarenheit = KelvinVersFarenheit(temp);
            System.out.println("Convertion de Kelvin vers Farenheit : "+temperatureFarenheit);
        }
        if (valeur == 6){
            float temperatureCelcius = FarenheitVersKelvin(temp);
            System.out.println("Convertion de Farenheit vers Celcius : "+temperatureCelcius);
        }
    }
public static float CelciusVersKelvin ( float tempCelcius) {
    float tempKelvin = (float) (tempCelcius + 273.15);
    return tempKelvin;
}
public static float KelvinVersCelcius ( float tempKelvin ) {
    float tempCelcius = (float) (tempKelvin - 273.15);
    return tempCelcius;
} 
public static float FarenheitVersCelcius ( float tempFarenheit ) {
    float tempCelcius = (float) ((tempFarenheit - 32) * 5/9);
    return tempCelcius;
} 
public static float CelciusVersFarenheit ( float tempCelcius ) {
    float tempFarenheit = (float) (tempCelcius * 9/5) + 32;
    return tempFarenheit;
} 
public static float KelvinVersFarenheit ( float tempKelvin ) {
    float tempFarenheit = (float) (tempKelvin - 273.15) * 9/5 + 32 ;
    return tempFarenheit;
}
public static float FarenheitVersKelvin ( float tempFarenheit ) {
    float tempKelvin = (float) ((float) (tempFarenheit - 32) * 5/9 + 273.15);
    return tempKelvin;
} 

}
    

