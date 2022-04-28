package kivipaperisakset.test;

import kivipaperisakset.Pelaaja;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PelaajaTest {

    @org.junit.jupiter.api.Test
    void pelaajanValinta() {
        var Pelaaja = new Pelaaja();
        Pelaaja.setValinta("Sakset");
        assertEquals("Sakset", Pelaaja.getValinta());
    }

    @org.junit.jupiter.api.Test
    void resetValinta() {
        var Pelaaja = new Pelaaja();
        Pelaaja.resetValinta();
        String answ = Pelaaja.getValinta();
        assertEquals(answ, Pelaaja.getValinta());


    }


}