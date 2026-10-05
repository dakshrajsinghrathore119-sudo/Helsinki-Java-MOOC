public class ProductWarehouse extends Warehouse{
    private String name;
    
    public ProductWarehouse(String Name,double capacity){
        super(capacity);
        this.name = Name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public String toString(){
        return this.getName() +": "+super.toString();
    }
}