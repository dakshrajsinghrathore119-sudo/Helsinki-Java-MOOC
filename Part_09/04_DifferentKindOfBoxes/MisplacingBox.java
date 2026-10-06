import java.util.ArrayList;
public class MisplacingBox extends Box{
    private ArrayList<Item> item;
    
    public MisplacingBox(){
        this.item = new ArrayList<>();
    }
    
    public void add(Item item){
        this.item.add(item);
    }
    
    public boolean isInBox(Item item){
        return false;
    }
}