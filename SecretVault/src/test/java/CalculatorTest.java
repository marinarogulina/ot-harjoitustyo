

import secretvault.domain.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {
    Calculator calculator;
    int num1;
    int num2;
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        calculator = new Calculator();
        num1 = 10;
        num2 = 5;
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
    public void addition() {
        assertEquals(15, calculator.calculate(num1, num2, "+"));
    }
    
    @Test
    public void subtraction() {
        assertEquals(5, calculator.calculate(num1, num2, "-"));
    }
    
    @Test
    public void multiplication() {
        assertEquals(50, calculator.calculate(num1, num2, "*"));
    }
    
    @Test
    public void division() {
        assertEquals(2, calculator.calculate(num1, num2, "/"));
    }
}
