import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Person tea = new Teacher("Ada darlow","66th strasse , aufsburg",1200);
        System.out.println(tea);
    }
    
    public static void printPersons(ArrayList<Person> person){
        for(Person pers:person){
            System.out.println(pers);
        }
    }
}