import java.util.ArrayList;
import java.util.Random;
public class JokeManager {
    private ArrayList<String> list;
    
    public JokeManager(){
        this.list = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        list.add(joke);
    }
    
    public String drawJoke(){
        if(list.isEmpty()){
            return "Jokes are in short supply.";
        }else{
            Random rand = new Random();
            int n = rand.nextInt(list.size());
            return list.get(n);
        }
    }
    
    public void printJokes(){
        for(String joke:list){
            System.out.println(joke);
        }
    }
    
}
