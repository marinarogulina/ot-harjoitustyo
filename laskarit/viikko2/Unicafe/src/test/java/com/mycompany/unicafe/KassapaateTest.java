/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unicafe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rozmarin
 */
public class KassapaateTest {
    
    Kassapaate kassapaate;
    Maksukortti kortti;
    Maksukortti toinenKortti;
    
    public KassapaateTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        kassapaate = new Kassapaate();
        kortti = new Maksukortti(400);
        toinenKortti = new Maksukortti(100);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void rahamaaraOnOikein() {
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void myytyjenLounaidenMaaraOikein() {
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty()+kassapaate.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void rahamaaraKasvaaJosRahamaaraRiittavaE() {
        kassapaate.syoEdullisesti(300);
        assertEquals(100240, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void rahamaaraKasvaaJosRahamaaraRiittavaM() {
        kassapaate.syoMaukkaasti(500);
        assertEquals(100400, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void vaihtorahanSuuruusOikeaE() {
        assertEquals(60, kassapaate.syoEdullisesti(300));
    }
    
    @Test
    public void vaihtorahanSuuruusOikeaM() {
        assertEquals(100, kassapaate.syoMaukkaasti(500));
    }
    
    @Test
    public void edullistenLounaidenMaaraKasvaaJosMaksuRiittava() {
        kassapaate.syoEdullisesti(300);
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void maukkaidenLounaidenMaaraKasvaaJosMaksuRiittava() {
        kassapaate.syoMaukkaasti(500);
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void rahamaaraKassassaEiKasvaJosEiRiittavastiRahaaE() {
        kassapaate.syoEdullisesti(200);
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void rahamaaraKassassaEiKasvaJosEiRiittavastiRahaaM() {
        kassapaate.syoMaukkaasti(300);
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void kaikkiRahatPalautetaanE() {
        assertEquals(200, kassapaate.syoEdullisesti(200));
    }
    
    @Test
    public void kaikkiRahatPalautetaanM() {
        assertEquals(300, kassapaate.syoMaukkaasti(300));
    }
    
    @Test
    public void edullistenLounaidenMaaraEiKasvaJosEiTarpeeksiRahaa() {
        kassapaate.syoEdullisesti(200);
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void maukkaidenLounaidenMaaraEiKasvaJosEiTarpeeksiRahaa() {
        kassapaate.syoMaukkaasti(300);
        assertEquals(0, kassapaate.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void summanVeloitusKortiltaToimiiE() {
        assertEquals(true, kassapaate.syoEdullisesti(kortti));
    }
    
    @Test
    public void summanVeloitusKortiltaToimiiM() {
        assertEquals(true, kassapaate.syoMaukkaasti(kortti));
    }
    
    @Test
    public void edullistenLounaidenMaaraKasvaaMaksukortillaMaksettaessa() {
        kassapaate.syoEdullisesti(kortti);
        assertEquals(1, kassapaate.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void maukkaidenLounaidenMaaraKasvaaMaksukortillaMaksettaessa() {
        kassapaate.syoMaukkaasti(kortti);
        assertEquals(1, kassapaate.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void josEiTarpeeksiRahaaEdullistenLounaidenMaaraEiMuutu() {
        kassapaate.syoEdullisesti(toinenKortti);
        assertEquals(0, kassapaate.edullisiaLounaitaMyyty());
    }
    
    @Test
    public void josEiTarpeeksiRahaaMaukkaidenLounaidenMaaraEiMuutu() {
        kassapaate.syoMaukkaasti(toinenKortti);
        assertEquals(0, kassapaate.maukkaitaLounaitaMyyty());
    }
    
    @Test
    public void maksuEiMeneLapiKunEiTarpeeksiRahaaKortillaE() {
        assertEquals(false, kassapaate.syoEdullisesti(toinenKortti));
    }
    
    @Test
    public void maksuEiMeneLapiKunEiTarpeeksiRahaaKortillaM() {
        assertEquals(false, kassapaate.syoMaukkaasti(toinenKortti));
    }
    
    @Test
    public void kassanRahamaaraEiMuutuKunOstetaanEdullinenLounasKortilla() {
        kassapaate.syoEdullisesti(kortti);
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void kassanRahamaaraEiMuutuKunOstetaanMaukasLounasKortilla() {
        kassapaate.syoMaukkaasti(kortti);
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void kassanRahamaaraKasvaaKunKortilleLadataanRahaa() {
        kassapaate.lataaRahaaKortille(kortti, 100);
        assertEquals(100100, kassapaate.kassassaRahaa());
    }
    
    @Test
    public void rahamaaraEiMuutuJosKortilleLadataanNegatiivistaTaiEiMitaan() {
        kassapaate.lataaRahaaKortille(kortti, -5);
        assertEquals(100000, kassapaate.kassassaRahaa());
    }
}
