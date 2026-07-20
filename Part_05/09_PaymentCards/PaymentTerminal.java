public class PaymentTerminal {


    private double money; 
    private int affordableMeals; 
    private int heartyMeals; 
    
    public PaymentTerminal() {
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        if(payment>=2.50){
            payment -= 2.50;
            affordableMeals++;
            this.money += 2.50;
        }
        return payment;
        
    }

    public double eatHeartily(double payment) {
        if(payment>=4.30){
            payment -= 4.30;
            heartyMeals++;
            this.money += 4.30;
        }
        return payment;
    }
    
    public boolean eatAffordably(PaymentCard card){
        if(card.balance()>=2.50){
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean eatHeartily(PaymentCard card){
        if(card.balance()>=4.30){
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        }else{
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if(sum>0){
            card.addMoney(sum);
            this.money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
