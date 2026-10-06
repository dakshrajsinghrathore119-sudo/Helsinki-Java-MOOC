import java.util.ArrayList;
public class BoxWithMaxWeight extends Box{
    private int capacity;
    private ArrayList<Item> boxes;
    
    public BoxWithMaxWeight(int capa){
        this.capacity = capa;
        this.boxes = new ArrayList<>();
    }
    
    public void add(Item item){
        int total = 0;
        for(Item items:this.boxes){
            total += items.getWeight();
        }
        if((item.getWeight()+total)<=this.capacity){
            this.boxes.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        for(Item items:this.boxes){
            if(items.equals(item)){
                return true;
            }
        }
        return false;
    }
    
}