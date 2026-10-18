import java.util.Map;
import java.util.HashMap;
public class mainProgram {

    public static void main(String[] args) {
        Map<String , String> names = new HashMap<>();
        names.put("Daksh","Lalu");
        names.put("chakarwati","kansa");
        System.out.println(mainProgram.returnSize(names));
        // test your method here

    }
    
    public static int returnSize(Map<String , String> names){
        return names.size();
    }

    // Implement here a method returnSize, which takes a Map-object as a parameter 
    // and returns the size of the map object
}