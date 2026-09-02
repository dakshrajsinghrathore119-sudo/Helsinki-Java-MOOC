public class Bird {
    private String name;
    private String nameLatin;
    private int observation;
    
    public Bird(String Name,String NameLatin){
        this.name = Name;
        this.nameLatin = NameLatin;
        this.observation = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNameLatin(){
        return this.nameLatin;
    }
    
    public void addObserve(){
        this.observation++;
    }
    
    public int getObserve(){
        return this.observation;
    }
    
    public String toString(){
        return getName()+" ("+getNameLatin()+"): "+getObserve();
    }
}

