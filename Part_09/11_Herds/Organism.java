public class Organism implements Movable{
    private int x;
    private int y;
    
    public Organism(int X,int Y){
        this.x = X;
        this.y = Y;
    }
    
    public void move(int dx,int dy){
        this.x += dx;
        this.y += dy;
    }
    
    public String toString(){
        return "x: "+this.x+"; y: "+this.y;
    }
}