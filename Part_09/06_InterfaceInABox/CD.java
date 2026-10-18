public class CD implements Packable{
    private String artist;
    private String name;
    private int publicationYear;
    
    public CD(String Artist,String Name,int PublicationYear){
        this.artist = Artist;
        this.name = Name;
        this.publicationYear = PublicationYear;
    }
    
    public double weight(){
        return 0.1;
    }
    
    public String toString(){
        return this.artist+": "+this.name+" ("+this.publicationYear+")";
    }
}