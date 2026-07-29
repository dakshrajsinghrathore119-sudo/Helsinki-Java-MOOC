import java.util.ArrayList;
public class MessagingService {
    private ArrayList <Message> text;
    
    public MessagingService(){
        this.text = new ArrayList<>();
    }
    
    public void add(Message message){
        String a = message.getContent();
        if(a.length()<=280){
            text.add(message);        
        }
    }
    
    public ArrayList<Message> getMessages(){
        int a = text.size()-1;
        return text;
    }
    
}
