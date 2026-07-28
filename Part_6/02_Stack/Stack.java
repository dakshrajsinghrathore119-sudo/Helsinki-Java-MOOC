import java.util.ArrayList;
public class Stack {
    private ArrayList<String> stack;
    
    public Stack(){
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(stack.size()==0){
            return true;
        }else{
            return false;
        }
    }
    public void add(String value){
        stack.add(value);
    }
    public ArrayList<String> values(){
        ArrayList <String> value = new ArrayList<>();
        int a = 0;
        while(a<stack.size()){
            value.add(stack.get(a));
            a++;
        }
        return value;
    }
    
    public String take(){
        String a = stack.get(stack.size()-1);
        stack.remove(a);
        return a;
        
    }
}
