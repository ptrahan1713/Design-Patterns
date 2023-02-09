package observertester;

import java.util.ArrayList;

/**
 * This class is the concrete Subject class in the Observer design pattern.
 *
 * @author Patrick Trahan
 */
public class SubscriberData implements Subscriber
{
    private ArrayList<TargetMailer> subscriber;
    private String message;
    private boolean hasChanged;

    /**
     * This constructor creates a new arraylist for subscriber
     */
    public SubscriberData()
    {
        subscriber = new ArrayList();
    }

    /**
     * This method adds the TargetMailer object to the subscriber arraylist.
     * 
     * @param department is an TargetMailer object.
     */
    @Override
    public void addObserver(TargetMailer department)
    {
        if(!subscriber.contains(department))
        {
            subscriber.add(department);
        }
    }

    /**
     * This method removes the TragetMailer object from the arraylist. If the object
     * is in the arraylist it will be removed and if the object is not then nothing
     * happens.
     * 
     * @param department is an TargetMailer object.
     */
    @Override
    public void removeObserver(TargetMailer department)
    {
        int index = subscriber.indexOf(department);

        if (index >= 0)
        {
            subscriber.remove(department);
        }
    }

    /**
     * This method will notify the TargetMailer object of the message
     * that was given by calling the update method.
     * 
     */
    @Override
    public void notifyObserver()
    {
        if(hasChanged)
        {
            for(int i = 0; i < subscriber.size(); i++)
            {
                TargetMailer observer = (TargetMailer) subscriber.get(i);
                
                //if(observer.getDepartment().equals(department))
                observer.update();
            }
            
            hasChanged = false;
        }
    }
    
    @Override
    public Object getUpdate(TargetMailer department)
    {
        return message;
    }
    
    public void postMessage(String userMessage)
    {
        System.out.println("New Sale on: " + userMessage);
        
        message = userMessage;
        
        hasChanged = true;
        
        notifyObserver();
    }
}
