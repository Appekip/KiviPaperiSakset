package kivipaperisakset;

public class Matsi implements IMatsi {

    /**
     * Ajattelin siirtää pelin logiikan sille omaan luokkaan, niin sovellus on helppolukuisempi
     * <p>
     * Vertailu metodi palauttaa integerin 0, 1 tai 2, 1 ja 2 ovat pelaajien voittoja ja 0 tarkoittaa tasuria
     *
     * @param a
     * @param b
     */

    public int vertailu(Pelaaja a, Pelaaja b) {


        if ((a.getValinta().equals("Kivi")) && (b.getValinta().equals("Paperi"))) {
            return 2;

        } else if ((a.getValinta().equals("Kivi")) && (b.getValinta().equals("Sakset"))) {
            return 1;

        } else if ((a.getValinta().equals("Sakset")) && (b.getValinta().equals("Kivi"))) {
            return 2;

        } else if ((a.getValinta().equals("Sakset")) && (b.getValinta().equals("Paperi"))) {
            return 1;

        } else if ((a.getValinta().equals("Paperi")) && (b.getValinta().equals("Sakset"))) {
            return 2;

        } else if ((a.getValinta().equals("Paperi")) && (b.getValinta().equals("Kivi"))) {
            return 1;

        } else
            return 0;
    }

    public void peli() throws InterruptedException {
        Pelaaja p1 = new Pelaaja();
        Pelaaja p2 = new Pelaaja();
        boolean peliLoppui = false;
        int pelatutPelit = 1;           // Pelattujen pelien lkm
        int tasapelit = 0;              // Tasapelien lkm
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
            lopputulos = vertailu(p1, p2);

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


        } while (peliLoppui != true );
    }

}
