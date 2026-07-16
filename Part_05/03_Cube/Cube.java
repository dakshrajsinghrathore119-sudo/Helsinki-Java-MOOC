public class Cube {
    private int edgeLength;
    
    public Cube(int EdgeLength){
        this.edgeLength = EdgeLength;
    }
    
    public int volume(){
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }
    
    public String toString(){
        return "The length of the edge is "+this.edgeLength+" and the volume "+volume();
    }
}
