import java.util.HashMap;
import java.util.Map;
public class ShoppingCart {
    private Map<String,Item> cart;
    
    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    
    public void add(String product,int price){
        if(this.cart.containsKey(product)){
            Item item = this.cart.get(product);
            item.increaseQuantity();
        }else{
        Item item = new Item(product,1,price);
        this.cart.put(product, item);}
    }
    
    public int price(){
        int value = 0;
        for(Item item:this.cart.values()){
            value += item.price();
        }
        return value;
    }
    
    public void print(){
        for(Item item:this.cart.values()){
            System.out.println(item.toString());
        }
    }
}