/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import secretvault.domain.User;
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
public class UserTest {
    User user;
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        user = new User();
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
    public void creatingNewUser() {
        assertEquals("", user.getPasscode());
    }
    
    @Test
    public void settingThePasscode() {
        user.setPasscode("1234");
        assertEquals("1234", user.getPasscode());
    }
    
    @Test
    public void addsNewEntryToTheList() {
        user.writeNewEntry();
        assertEquals(1, user.getEntries().size());
    }
}
