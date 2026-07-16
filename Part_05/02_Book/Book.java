public class Book {
    private String author;
    private String name;
    private int pages;
    
    public Book(String Author,String Name,int Pages){
        this.author = Author;
        this.name = Name;
        this.pages = Pages;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public String toString(){
        return this.author+", "+this.name+", "+this.pages+" pages";
    }
    
}
