public class Item {
    private String product;
    private int qty;
    private int price;
    
    public Item(String Product,int Qty,int Price){
        this.product = Product;
        this.qty = Qty;
        this.price = Price;
    }
    
    public int price(){
        return (this.qty*this.price);
    }
    
    public void increaseQuantity(){
        this.qty++;
    }
    
    public String toString(){
        return this.product+": "+this.qty;
    }
}