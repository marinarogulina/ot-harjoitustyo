package com.mycompany.unicafe;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MaksukorttiTest {

    Maksukortti kortti;

    @Before
    public void setUp() {
        kortti = new Maksukortti(10);
    }

    @Test
    public void luotuKorttiOlemassa() {
        assertTrue(kortti!=null);      
    }
    
    @Test
    public void kortinSaldoAlussaOikein() {
        assertEquals(10, kortti.saldo());
    }
    
    @Test
    public void rahanLataaminenToimii() {
        kortti.lataaRahaa(5);
        assertEquals(15, kortti.saldo());
    }
    
    @Test
    public void saldoVaheneeJosRahaaTarpeeksi() {
        kortti.otaRahaa(5);
        assertEquals(5, kortti.saldo());
    }
    
    @Test
    public void saldoEiMuutuJosEiTarpeeksiRahaa() {
        kortti.otaRahaa(15);
        assertEquals(10, kortti.saldo());
    }
    
    @Test
    public void rahanOttaminenToimiiKunRahaaTarpeeksi() {
        assertEquals(true, kortti.otaRahaa(5));
    }
    
    @Test
    public void rahanOttaminenEiToimiKunRahaaEiTarpeeksi() {
        assertEquals(false, kortti.otaRahaa(15));
    }
    
    @Test
    public void saldoTulostetaanOikein() {
        assertEquals("saldo: 0.10", kortti.toString());
    }
}
