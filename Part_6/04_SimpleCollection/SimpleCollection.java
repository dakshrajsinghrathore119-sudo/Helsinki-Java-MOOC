import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String output = "The collection "+this.name+" has "+elements.size()+" elements:";
        String output0 = "The collection "+this.name+" has "+elements.size()+" element:";
        String input = "";
        if(this.elements.isEmpty()){
            return "The collection "+this.name+" is empty.";
        }
        for(String el:elements){
            if(elements.size()==1){
                input += el;
            }else{
                input += el+"\n";
            }
        }
        if(elements.size()==1){
            return output0+"\n"+input;
        }else{
            return output+"\n"+input;
        }
        
    }
}
