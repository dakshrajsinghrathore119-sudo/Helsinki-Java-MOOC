import java.util.ArrayList;
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int MaximumWeight){
        this.maximumWeight = MaximumWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int total = 0;
        for(Suitcase suit:suitcases){
            total += suit.totalWeight();
        }
        if(!(total+suitcase.totalWeight()>this.maximumWeight)){
            suitcases.add(suitcase);
        }
    }
    
    public void printItems(){
        for(Suitcase suit:suitcases){
            suit.printItems();
        }
    }
    
    public String toString(){
        int a = 0;
        for(Suitcase suit:suitcases){
            a += suit.totalWeight();
        }
        return suitcases.size()+" suitcases"+" ("+a+" kg)";
    }
}