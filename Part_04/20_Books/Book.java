public class Book {
    private String name;
    private String pages;
    private String year;
    
    public Book(String n,String p,String y){
        this.name = n;
        this.pages = p;
        this.year = y;
        
    }
    
    public String getPages(){
        return this.pages;
    }
    public String getName(){
        return this.name;
    }
    public String getYear(){
        return this.year;
    }
    
}
