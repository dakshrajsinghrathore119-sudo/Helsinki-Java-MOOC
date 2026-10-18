import java.util.ArrayList;
public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> boxes;
    private double weight;
    
    public Box(double Capacity){
        this.capacity = Capacity;
        this.boxes = new ArrayList<>();
        this.weight = 0;
    }
    
    public void add(Packable pack){
        double total = 0;
        for(Packable val:this.boxes){
            total += val.weight();
        }
        if((total+pack.weight())<=this.capacity){
            this.boxes.add(pack);
            this.weight = total;
        }
    }
    
    public double weight(){
        double total = 0;
        for(Packable pack:this.boxes){
            total += pack.weight();
        }
        return total;
    }
    
    public String toString(){
        return "Box: "+this.boxes.size()+" items, "+"total weight "+weight() +" kg";
    }
}