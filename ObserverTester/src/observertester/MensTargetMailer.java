package observertester;

/**
 *This class is one of the Observer concrete classes for the Observer design pattern.
 * 
 * @author Patrick Trahan
 */
public class MensTargetMailer implements TargetMailer
{
    private String department;
    private Subscriber sub;
    
    public MensTargetMailer(String userName)
    {
        department = userName;
    }
    
    /**
     * This method checks to see if the department is for pets. If it is,
     * then display the message.
     */
    @Override
    public void update()
    {
        String message = (String) sub.getUpdate(this);
        
        if(message == null)
        {
            System.out.println(department + " has no new discounts");
        }
        else
        {
            System.out.println(department + " updating the discounts " + message);
        }
    }
    
    @Override
    public void setSubscriber(Subscriber userSub)
    {
        sub = userSub;
    }
    
    public String getDepartment()
    {
        return department;
    }
}
