public class PaymentCard {
    private double balance;
    
    public PaymentCard(double initial_Balance){
        this.balance = initial_Balance;
    }
    
    public String toString(){
        return("The card has a balance of "+this.balance+" euros");
    }
    
    public void eatAffordably(){
        if(this.balance>=2.60){
            this.balance -= 2.60;
        }
        
    }
    
    public void eatHeartily(){
        if(this.balance>=4.60){
            this.balance -= 4.60;
        }
    }
    
    public void addMoney(double amount){
        if(amount<0){
            this.balance = this.balance;
        }else if(amount+this.balance>150.0){
            this.balance = 150.0;
        } else{
            this.balance += amount;
        }
    }
    
}
