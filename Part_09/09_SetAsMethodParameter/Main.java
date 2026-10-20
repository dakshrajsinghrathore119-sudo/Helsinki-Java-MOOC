import java.util.Set;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Daksh");
        names.add("Lalu");
        names.add("Bhalu");
        System.out.println(Main.returnSize(names));
        // You can test your method here

    }
    
    public static int returnSize(Set<String>names){
        return (names.size());
    }

    // implement the method returnSize here, which returns
    // the number of elements in the set that it receives as a parameter.

}