public class HealthStation {
    private int count;
    

    public int weigh(Person person) {
        count++;
        return person.getWeight();
        
    }
    public void feed(Person person){
        person.increaseWeight() ;
    }
    
    public int weighings(){
        return count;
    }

}
