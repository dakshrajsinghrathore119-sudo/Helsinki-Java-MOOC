import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
public class Warehouse {
    private Map<String,Integer> product;
    private Map<String,Integer> stock;
    
    public Warehouse(){
        this.product = new HashMap<>();
        this.stock = new HashMap<>();
    }
    public void addProduct(String name,int price,int stock){
        this.product.put(name,price);
        this.stock.put(name, stock);
    }
    
    public int price(String product){
        if(this.product.containsKey(product)){
            return this.product.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if(this.stock.containsKey(product)){
            return this.stock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(this.stock.containsKey(product)){
            int stock = this.stock.get(product)-1;
            if(stock(product)>0){
                this.stock.put(product,stock);
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> set = new HashSet<>();
        for(String val:this.product.keySet()){
            set.add(val);
        }
        return set;
    }
}
