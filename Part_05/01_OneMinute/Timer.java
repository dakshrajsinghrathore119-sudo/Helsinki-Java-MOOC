public class Timer{
    private ClockHand seconds;
    private ClockHand hundreds;
    
    public Timer(){
        this.seconds = new ClockHand(60);
        this.hundreds  = new ClockHand(100);
    }
    public void advance(){
        hundreds.advance();
        if(hundreds.value()==0){
            seconds.advance();
        }
    }
    
    public String toString(){
        return seconds.toString() +":"+hundreds.toString();
    }
    
    
}
