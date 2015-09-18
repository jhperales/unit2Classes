

/**
 * Resembles a real-life vending machine
 * 
 * @author Jerome 
 * @version Alpha 1.0
 */
public class VendingMachine
{
    /** specifies number of cans in machine and tokens collected */
    private int tokens;
    private int cans;
    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine()
    {
        tokens = 0;
        cans = 100;
    }
    
    /**
     * acts as a mechinism to accept tokens
     *
     * @pre     token count cannot be negative int
     * @post    token count goes up 1
     * 
     *
     */
    public void insertToken()
    {
        // Instructions for updating token and can counts
        this.tokens += 1;
        this.cans -= 1;
    }
    
    /**
     * resembles restocking machine with cans
     *
     * @post    can count updated
     * @param   specified int value of number of cans to add
     * 
     */
    public void fillUp(int cans)
    {
        // adds cans
        this.cans += cans;
    }

}
