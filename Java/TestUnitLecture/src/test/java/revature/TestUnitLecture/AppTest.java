package revature.TestUnitLecture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
*/
import org.junit.jupiter.api.Test;

public class AppTest 
{
	MyClass mc = new MyClass();
	// the @Test annotation marks a method as a test method to be run by the test runner
	// a test runner is a program that runs test methods and reports the results
	MyCalculator calc = new MyCalculator();
	// This first method tests if the new MyClass mc object is null
    @Test
    public void firstTest() {
    	//checks for empty or null references
    	assertNotNull(mc);
    }
    
    @Test
    public void addTest() {
    	// By calling the method here and returning the result to integer x
    	// we can reuse integer x futher, and the add() method is called only once
    	int x = mc.add(5, 8); // this should equal 13
    	
    	//This line is asserting that the variable x is equal to 13
    	// (actual, expected)
    	assertEquals(x, 13);
    	
    	//This line is asserting that x is not equal to 0
    	// (actual, expected)
    	assertNotEquals(x, 0);
    	
    	//This is asserting that x is equal to 13 by returning true
    	// (boolean comparison)
    	assertTrue(x==13);
    }
    
   /*@BeforeEach
    public void beforeEach() {
    	System.out.println("I am before each!");
    }
    
    @AfterEach
    public void afterEach() {
    	System.out.println("I am after each!");
    }
    
    @BeforeAll
    public static void beforeAll() {
    	System.out.println("I am before all!");
    }
    
    @AfterAll
    public static void afterAll() {
    	System.out.println("I am after all!");
    }*/
    
    @Test
    public void testAdd() {
    	double x = calc.calculate("1+2");
    	assertEquals(x, 3);
    }
    
}
