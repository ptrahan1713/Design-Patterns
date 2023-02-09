package observertester;

/**
 * This is the main method to the Observer design pattern. 
 * @author pattr
 */
public class ObserverTester
{
    public static void main(String[] args)
    {
        //creates the subject object
        SubscriberData subscriber = new SubscriberData();
        
        //creates the observers
        TargetMailer sub1 = new PetTargetMailer("Pets");
        
        TargetMailer sub2 = new MensTargetMailer("Men's");
        
        //attach Observer to subject
        sub1.setSubscriber(subscriber);
        sub2.setSubscriber(subscriber);
        
        //checks if update is available
        sub1.update();
        
        //send a message to subject
        subscriber.postMessage("Sale of dog food");
        
        sub1.update();
        
        sub2.update();
    }
    
}
