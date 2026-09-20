import java.util.HashMap;
public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
        HashMap<String, String> hm = new HashMap<>();
        hm.put("a", "b");
        hm.put("c", "d");
        hm.put("e", "f");
        printKeysWhere(hm, "a");
        // Test your program here!
    }
    
    public static void printKeys(HashMap<String,String> hashmap){
        System.out.println(hashmap.keySet());
    }
    
    public static void printKeysWhere(HashMap<String , String> hashmap,String value){
        for(String vmax:hashmap.keySet()){
            if(vmax.contains(value)){
                System.out.println(vmax);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap,String value){
        for(String vmax:hashmap.keySet()){
            if((vmax).contains(value)){
                System.out.println(hashmap.get(vmax));
            }
        }
    }
}

