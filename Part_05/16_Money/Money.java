public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition){
        Money money = new Money(this.euros+addition.euros,this.cents+addition.cents);
        return money;
    }
    
    public boolean lessThan(Money compared){
        if(compared.euros>this.euros){
            return true;
        }else if(compared.euros==this.euros && compared.cents>this.cents){
            return true;
        }else{
            return false;
        }
    }
    
    public Money minus(Money decreaser){
        
        Money money = new Money(this.euros-decreaser.euros,this.cents-decreaser.cents);
        Money money0 = new Money(this.euros-this.euros,this.cents-this.cents);
        Money money1 = new Money(this.euros-(decreaser.euros+1),(100+this.cents)-decreaser.cents);
        if(money.euros<0 ){
            money = money0;
        }
        if(decreaser.cents>this.cents){
            money = money1;
        }
        return money;
    }

}
