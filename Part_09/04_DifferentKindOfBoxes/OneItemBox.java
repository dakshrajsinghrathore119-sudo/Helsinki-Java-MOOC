import java.util.ArrayList;
public class OneItemBox extends Box{
    private int capacity;
    private ArrayList<Item> item;
    
    public OneItemBox(){
        this.capacity = 1;
        this.item = new ArrayList<>();
    }
    
    public void add(Item item){
        if(!(this.item.size()==1)){
            this.item.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        if(this.item.size()==0){
            return false;
        }
        if(this.item.contains(item)){
            return true;
        }
        return false;
    }
}