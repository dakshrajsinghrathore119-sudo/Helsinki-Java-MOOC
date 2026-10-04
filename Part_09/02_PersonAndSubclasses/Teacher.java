public class Teacher extends Person{
    private int salary;
    
    public Teacher(String Name,String Address,int Salary){
        super(Name,Address);
        this.salary = Salary;
    }
    
    public String toString(){
        return super.toString()+"\n"+"  salary "+this.salary+" euro/month";
    }
}