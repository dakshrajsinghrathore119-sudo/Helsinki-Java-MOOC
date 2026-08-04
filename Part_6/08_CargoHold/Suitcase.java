import java.util.ArrayList;
public class Suitcase{
    private ArrayList<Item> items;
    private int totalWeight;
    
    public Suitcase(int TotalWeight){
        this.totalWeight = TotalWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item){
        int a = 0;
        for(Item ite:items){
            a += ite.getWeight();
        }
        if(a+item.getWeight()>this.totalWeight){
            
        }else{
            items.add(item);
        }   
    }
    
    public void printItems(){
        for(Item ite:items){
            System.out.println(ite);
        }
    }
    
    public int totalWeight(){
        int total = 0;
        for(Item ite:items){
            total += ite.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item heaviest = items.get(0);
        for(Item ite:items){
            if(ite.getWeight()>heaviest.getWeight()){
                heaviest = ite;
            }
        }
        return heaviest;
    }
    public String toString(){
        if(items.isEmpty()){
            return "no items (0 kg)";
        }else{
            int total = 0;
            for(Item it:items){
                total += it.getWeight();
                
        }
            if(items.size()==1){
                return "1 item "+"("+total+" kg)";
            }else{
                return items.size()+" items "+"("+total+" kg)"; 
            }
        }

    }
}