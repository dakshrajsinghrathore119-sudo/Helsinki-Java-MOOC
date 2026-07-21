public class Apartment {
    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public int getSquares(){
        return this.squares;
    }
    public int getPrice(){
        return this.princePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(squares>compared.getSquares()){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    public int priceDifference(Apartment compared){
        int a = this.princePerSquare*this.squares;
        int b = compared.getSquares()*compared.getPrice();
        if(a>b){
            return a-b;
        }else{
            return b-a;
        }
    }
    public boolean moreExpensiveThan(Apartment verrattva){
        if((this.princePerSquare*this.squares)>(verrattva.getPrice()*verrattva.getSquares())){
            return true;
        }else{
            return false;
        }
    }
}
