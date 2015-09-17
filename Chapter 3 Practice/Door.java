

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
        doorName = doorName;
        doorState = doorState;
    }
    

    /**
     * gets name of door
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
     * gets state of door
     *
     * @pre     door must be either open or closed
     * @post    retruns "closed" or "open", depending on state of door
     * 
     * @return  state of door
     */
    public String getState()
    {
        return this.doorState;
    }
    

    /**
     * mutates the name of the door
     *
     * 
     * @post    should mutate door name
     * @param   new name of door
     * 
     */
    public void setName(String newName)
    {
        this.doorName = newName;
    }

    /**
     *  mutates state of door 
     *
     * @pre     state can only be "open" or "close"
     * @post    mutates state of door
     * @param   new state of door
     * 
     */
    public void setState(String newState)
    {
        this.doorState = newState;
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
