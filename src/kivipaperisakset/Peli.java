package kivipaperisakset;
/**
 *
 * @author Ira Dook
 */
public class Peli {

    public static void main(String args[]) throws InterruptedException {

        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        boolean peliLoppui = false;
        int pelatutPelit = 1;           // Pelattujen pelien lkm
        int tasapelit = 0;              // Tasapelien lkm
        Matsi m = new Matsi();
        int lopputulos;

        do {

            /**
             * Pelaajien valinnat resetoidaan loopin alussa
             */
            p1.resetValinta();
            p2.resetValinta();


            /**
             * "Käyttöliittymää"
             */
            System.out.println("Erä: " + pelatutPelit + " =====================");

            System.out.println("Pelin tilanne: Pelaaja 1 " + p1.getVoitot() + " voittoa, Pelaaja 2 " + p2.getVoitot() + " voittoa, Tasureja " + tasapelit + "kpl.");

            System.out.println("Pelaaja 1:en valinta " + p1.getValinta());
            System.out.println("Pelaaja 2:en valinta " + p2.getValinta());

            /**
             * Vertailu tapahtuu pääohjelman sijaan omassa Matsi luokassaan, tämä pitää koodin selkeämpänä
             * Metodi ottaa parametrikseen pelaaja oliot ja palauttaa integerin 0 - 2
             */
            lopputulos = m.vertailu(p1, p2);

            /**
             * Tässä päätellään kyseisen erän lopputulos vertailu metodista saadulla lopputulos muuttujalla
             */
            switch (lopputulos){
                case 0:
                    tasapelit++;
                    System.out.println("Tasapeli");
                    break;
                case 1:
                    p1.voitti();
                    System.out.println("Pelaaja 1 voitti");
                    break;
                case 2:
                    p2.voitti();
                    System.out.println("Pelaaja 2 voitti");
                    break;
            }

            /**
             * Pelien laskuri
             */
            pelatutPelit++;

            /**
             * Lopussa käydään läpi, onko jompikumpi pelaaja jo saavuttanut 3 voittoa
             */
            if (p1.getVoitot() == 3 || p2.getVoitot() == 3){
                peliLoppui = true;
                System.out.println("Peli loppui tilanteeseen: Pelaaja 1:llä " + p1.getVoitot() + " voittoa, Pelaaja 2:lla " + p2.getVoitot() + " voittoa");
            }

            /**
             * Helpottaa pelin seuraamista, kun peli ei liiku valon nopeudella
             */
            Thread.sleep(1000);

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
        } while (peliLoppui != true );
    }
}
