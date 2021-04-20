/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import secretvault.domain.DiaryEntry;
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
public class DiaryEntryTest {
    DiaryEntry diaryentry;
    
    public DiaryEntryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        diaryentry = new DiaryEntry();
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
    public void settingAndGettingTheTitle() {
        diaryentry.setTitle("New Entry");
        assertEquals("New Entry", diaryentry.getTitle());
    }
    
    @Test
    public void writing() {
        diaryentry.write("Dear Diary...");
        assertEquals("Dear Diary...", diaryentry.getText());
    }
    
    
}
