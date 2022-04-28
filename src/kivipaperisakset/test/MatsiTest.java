package kivipaperisakset.test;

import kivipaperisakset.Matsi;
import kivipaperisakset.Pelaaja;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatsiTest {

    @Test
    void Pelaaja2VoitaaKivenPaperilla() {

        var Matsi = new Matsi();

        var P1 = new Pelaaja();
        var P2 = new Pelaaja();

        P1.setValinta("Kivi");
        P2.setValinta("Paperi");
        assertEquals(2 ,Matsi.vertailu(P1, P2));

    }
    @Test
    void Pelaaja1VoitaaPaperinSaksilla() {

        var Matsi = new Matsi();

        var P1 = new Pelaaja();
        var P2 = new Pelaaja();

        P1.setValinta("Sakset");
        P2.setValinta("Paperi");
        assertEquals(1 ,Matsi.vertailu(P1, P2));

    }

}