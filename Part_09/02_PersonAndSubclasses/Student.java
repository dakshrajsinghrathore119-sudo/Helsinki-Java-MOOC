public class Student extends Person{
    private int credits;
    
    public Student(String Name,String Address){
        super(Name,Address);
        this.credits = 0;
    }
    
    public void study(){
        this.credits++;
    }
    
    public int credits(){
        return this.credits;
    }
    
    public String toString(){
        return super.toString() + "\n"+"  Study credits "+this.credits;
    }
}