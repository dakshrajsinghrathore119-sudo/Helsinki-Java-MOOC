import java.util.HashMap;
import java.util.ArrayList;
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String> > dict;
    
    public DictionaryOfManyTranslations(){
        this.dict = new HashMap<>();
    }
    
    public void add(String word,String trans){
        this.dict.putIfAbsent(word, new ArrayList<>());
        this.dict.get(word).add(trans);
    }
    
    public ArrayList<String> translate(String word){
        if(this.dict.containsKey(word)){
            return this.dict.get(word);
        }
        return new ArrayList<>();
    }
    
    public void remove(String word){
        this.dict.remove(word);
    }
}