
package kivipaperisakset;

import java.util.Random;

/**
 *
 * @author Ira Dook
 */
public class Pelaaja implements IPelaaja{

    Random r = new Random();

    int voitot;      // Voittojen lukumäärä

    String valinta;    //Muuttja johon säilötään pelaajan valinta

    /**
     * Palauttaa pelaajan valinnan
     */

    public String pelaajanValinta() {
        return valinta;
    }

    /**
     * Valinta muuttuja resetoidaa ja arvotaan uusi valinta
     */
    public void resetValinta(){

         int i = r.nextInt(3);

         switch (i) {
             case 0:
                 valinta = "Sakset";
                 break;
             case 1:
                 valinta = "Kivi";
                 break;
             case 2:
                 valinta = "Paperi";
                 break;

         }
    }

    /**
     * Getterit ja setterit
     */

    public void setVoitot(int v) {
        this.voitot = v;
    }

    public int getVoitot() {
        return (voitot);
    }

    public void setValinta(String valinta) {
        this.valinta = valinta;
    }

    public String getValinta() {
        return valinta;
    }

    /**
     * Voitti metodia kutsutaan pääohjelmassa kun kyseinen pelaaja voittaa, metodi itsessään on hyvin simppeli
     */
    public void voitti(){
        voitot++;
    }
}
