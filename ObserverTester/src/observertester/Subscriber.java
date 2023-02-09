package observertester;

/**
 * This class is the Subject interface in the Observer design pattern.
 * 
 * @author Patrick Trahan
 */
public interface Subscriber
{
    public void addObserver(TargetMailer department);
    
    public void removeObserver(TargetMailer department);
    
    public void notifyObserver();
    
    public Object getUpdate(TargetMailer department);
}
