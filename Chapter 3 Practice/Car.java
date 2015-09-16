

/**
* 
* a representation of an automobile.
 * 
 * @author Jerome
 * @version 9-10-15 (Alpha v 1.0)
 */
public class Car
{
    /** specifies the fuel efficiency of the car in units of miles per gallon (mpg) ) */
    private double fuelInTank;
    private double fuelEfficiency;
    /**
     * constructor for objects of class Car that specify the fuel the efficiency of the car
     */
    public Car( double fuelEfficiency )
    
    {
        this.fuelInTank = 0.0;
        this.fuelEfficiency = fuelEfficiency;
    }

    /**
     * Simulates driving the car the specified distance in miles and reduces the amount of fuel in the car's tank
     * 
     * @pre        the specified distance cannot consume more than the fuel availavle in the tank
     *
     * @param    distance the specified distance to drive in miles
     */
    public void drive( double distance )
    {
        double gas = this.getGasInTank();
        fuelInTank -= distance / fuelEfficiency;
    }

    
    /**
     * Retruns number of gallons
     *
     * @pre     preconditions for the method
     *     
     * @return  number of gallons of gas in tank
     */
    public double getGasInTank()
    {
        return fuelInTank;
    }

    /**
     * increments the fuel stored in the car's tank by the sapecified amount in gallons
     *
     * @pre     gallonsOfGas must  be positive
     *
     * @param   gallonsOfGas amount in gallons to increment the fuel in the car's tank
     */
    public void addGas(double gallonsOfGas )
    {
     fuelInTank += gallonsOfGas;
    }


}
