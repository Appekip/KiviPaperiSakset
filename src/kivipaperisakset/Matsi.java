package kivipaperisakset;



public class Matsi implements IMatsi{

    /**
     * Ajattelin siirtää pelin logiikan sille omaan luokkaan, niin sovellus on helppolukuisempi
     *
     * Vertailu metodi palauttaa integerin 0, 1 tai 2, 1 ja 2 ovat pelaajien voittoja ja 0 tarkoittaa tasuria
     *
     * @param a
     * @param b
     */

    public int vertailu(Pelaaja a, Pelaaja b){


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

        }
        else
            return 0;
    }

}
