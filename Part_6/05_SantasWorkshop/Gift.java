public class Gift {
    private String name;
    private int weight;
    
    public Gift(String Name,int Weight){
        this.name = Name;
        this.weight = Weight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
        return this.name+" "+"("+this.weight+" kg)";
    }
    
}
