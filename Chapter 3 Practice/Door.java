

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    /** specifies the name of the door*/
    private String doorName;
    
    /** the state (open or closed) */
    private String doorState;
    

    /**
     * Constructor for class Door
     */
    public Door(String doorName, String doorState)
    {
        this.doorName = doorName;
        this.doorState = "closed";
    }
    
    /**
     * Accessor method
     *
     * @pre     door must have a name
     * @post    should returun name of door
     *          
     * 
     * @return  string value of name of door
     */
    public String getName()
    {
        return this.doorName;
    }

    /**
     * changes state of the door to open
     *
     * @pre        Door must be closed
     *            
     * @post   door must be open
     * @param   state of the door
     * @return    specifies if door has succesfully opened
     */
    public void open()
    {
       if (this.doorState == "closed")
       {
           this.doorState = this.doorState.replace("closed", "open");
       }
    }   
    /**
     * changes state of the door to closed
     *
     * @pre     door must be oepn 
     * @post    door should be closed
     * @param   state of the door
     * @return  specifies whether the door is closed or not
     */
    public void close(String doorState)
    {
        if (this.doorState == "open")
        {
         this.doorState = this.doorState.replace("open", "closed");   

        }
   
    }
}
