import java.util.HashMap;
public class Abbreviations {
    public HashMap<String, String> abbreviation;
    
    public Abbreviations(){
        this.abbreviation = new HashMap<>();
    }
    
    public void addAbbreviation(String Abbreviation,String Explanation){
            this.abbreviation.put(Abbreviation,Explanation);
    }
    
    public boolean hasAbbreviation(String abbre){
        if(this.abbreviation.containsKey(abbre)){
            return true;
        }else{
            return false;
        }
    }
    
    public String findExplanationFor(String abb){
        if(!(this.abbreviation.containsKey(abb))){
            return null;
        }
        return this.abbreviation.get(abb);
    }
}
