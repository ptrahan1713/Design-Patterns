package observertester;

/**
 * This class is the Observer interface of Observer design pattern. 
 * 
 * @author Patrick Trahan
 */
public interface TargetMailer
{
    //updates the Observer 
    public void update();
    
    public String getDepartment();
    
    //sets the subscriber to the oberserver
    public void setSubscriber(Subscriber sub);
}
