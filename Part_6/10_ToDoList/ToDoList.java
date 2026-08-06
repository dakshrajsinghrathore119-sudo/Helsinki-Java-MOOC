import java.util.ArrayList;
public class ToDoList {
    private ArrayList<String> list;
    
    public ToDoList(){
      this.list = new ArrayList<>();  
    }
    
    public void add(String task){
        list.add(task);
    }
    
    public void print(){
        int i = 1;
        int a = 0;
        while(i<=list.size()){
            System.out.println(i+": "+list.get(a));
            i++;
            a++;
        }
    }
    
    public void remove(int number){
        list.remove(number-1);
    }
    
}
