public class Fitbyte {
    private int age;
    private int restingHR;
    
    public Fitbyte(int Age,int RestingHR){
        this.age = Age;
        this.restingHR = RestingHR;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double max =  206.3 - (0.711 * age);
        return (max-this.restingHR)*(percentageOfMaximum)+this.restingHR;
    }
}
