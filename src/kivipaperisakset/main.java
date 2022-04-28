package kivipaperisakset;
/**
 *
 * @author Arttuper
 */
public class main {

    public static void main(String args[]) throws InterruptedException {

        Matsi m = new Matsi();
        m.peli();

            /*
            p1Valinta = p1.pelaajanValinta();
            System.out.println("Pelaaja 1: " + p1.valinta
                    + "\n\t Pelaaja 1:llä koossa " + p1Voitot + " voittoa.");
            p2Valinta = p2.pelaajanValinta();
            System.out.println("Pelaaja 2: " + p2Valinta
                    + "\n\t Pelaaja 2:lla koossa " + p2Voitot + " voittoa.");

            */

            // Allaolevassa pätkässä on yritetty eri tapoja saada
            // lukumäärän laskeminen toimimaan oikein.
            // Ei tää kyllä vieläkään skulaa - KORJAA!
            /*
            if ((p1Valinta.equals("kivi")) && (p2Valinta.equals("paperi"))) {
                System.out.println("Pelaaja 2 voittaa");
                p2Voitot++;  // Kokeile eri tapoja saada lukumäärän laskenta kuntoon
            } else if ((p1Valinta.equals("paperi")) && (p2Valinta.equals("kivi"))) {
                p1Voitot++;
                System.out.println("Pelaaja 1 voittaa");
            } else if ((p1Valinta.equals("kivi")) && (p2Valinta.equals("sakset"))) {
                p1Voitot = p1.setVoitot();
                System.out.println("Pelaaja 1 voittaa");
            } else if ((p1Valinta.equals("sakset")) && (p2Valinta.equals("kivi"))) {
                p2Voitot = p2.setVoitot();
                System.out.println("Pelaaja 2 voittaa");
            } else if ((p1Valinta.equals("sakset")) && (p2Valinta.equals("paperi"))) {
                p1Voitot = p1.setVoitot();
                System.out.println("Pelaaja 1 voittaa");
            } else if ((p1Valinta.equals("paperi")) && (p2Valinta.equals("sakset"))) {
                p2Voitot = p2.setVoitot();
                System.out.println("Pelaaja 2 voittaa");
            }
            if (p1Valinta == p2Valinta) {
                tasapelit++;
                System.out.println("\n\t\t\t Tasapeli \n");
            }
            pelatutPelit++;
            if ((p1.getVoitot() >= 3) || (p2.getVoitot() >= 3)) {
                peliLoppui = true;
                System.out.println("KOLME VOITTOA - PELI PÄÄTTYY");
            }
            System.out.println();
             */

    }
}
