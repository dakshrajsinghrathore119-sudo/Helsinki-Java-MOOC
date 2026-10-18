public class Book implements Packable{
    private String name;
    private String bookName;
    private double weight;
    
    public Book(String Name,String BookName,double Weight){
        this.name = Name;
        this.bookName = BookName;
        this.weight = Weight;
    }
    
    public double weight(){
        return this.weight;
    }
    
    public String toString(){
        return this.name+": "+this.bookName;
    }
}