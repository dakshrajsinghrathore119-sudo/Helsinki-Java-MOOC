import java.util.ArrayList;
public class Herd implements Movable{
    private ArrayList<Movable> herd;
    
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable move){
        this.herd.add(move);
    }
    
    public void move(int dx,int dy){
        for(Movable move:this.herd){
            move.move(dx, dy);
        }
    }
    
    public String toString(){
        String separate = "";
        for(Movable move:this.herd){
            separate += move.toString()+"\n";
        }
        return separate;
    }
}