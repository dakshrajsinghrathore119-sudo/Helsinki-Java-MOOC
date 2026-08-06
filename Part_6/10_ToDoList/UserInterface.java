import java.util.Scanner;
public class UserInterface {
    private ToDoList list;
    private Scanner scanner;
    
    public UserInterface(ToDoList List,Scanner scan){
        this.list = List;
        this.scanner = scan;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String word = this.scanner.nextLine();
            if(word.equals("stop")){
                break;
            }
            if(word.equals("add")){
                System.out.println("To add:");
                String add = this.scanner.nextLine();
                list.add(add);
            }else if(word.equals("list")){
                list.print();
            }else if(word.equals("remove")){
                System.out.println("Which one is removed? ");
                int num = Integer.valueOf(this.scanner.nextLine());
                list.remove(num);
            }
        }
    }
}
