

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class VendingMachineTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VendingMachineTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class VendingMachineTest
     */
    public VendingMachineTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    
    @Test
    public void testfillUp()
    {
        VendingMachine machine = new VendingMachine();
        machine.fillUp(10);
        assertEquals(110, machine.getCanCount(), 1e-6);
    }
    
    @Test
    public void testgetCanCount()
    {
        VendingMachine machine = new VendingMachine();
        machine.getCanCount();
        assertEquals(100, machine.getCanCount() );
    }
    
    @Test
    public void testggetTokenCount()
    {
        VendingMachine machine = new VendingMachine();
        machine.getTokenCount();
        assertEquals(0, machine.getTokenCount() );
    }
}