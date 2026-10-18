import java.util.ArrayList;
import java.util.List;
public class mainProgram {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("daksh");
        names.add("lalu");
        names.add("vansa");
        System.out.println(mainProgram.returnSize(names));
        
        // test your method here

    }
    
    public static int returnSize(List<String> names){
        return names.size();
    }

    // Implement here a method returnSize
    // which returns the size of the list given to it
    //as a parameter
}