import java.util.Scanner;
public class UserInterface {
    private Scanner scan;
    private TodoList list;
    
    public UserInterface(TodoList List,Scanner scanner){
        this.scan = scanner;
        this.list = List;
    }
    
    public void start(){
        while(true){
        System.out.print("Command: ");
        String input = this.scan.nextLine();
        if(input.equals("stop")){
            break;
        }
        if(input.equals("add")){
            System.out.print("To add:");
            String adding = this.scan.nextLine();
            this.list.add(adding);
        }else if(input.equals("list")){
            this.list.print();
        }else if(input.equals("remove")){
            System.out.println("Which one is removed? ");
            int id = Integer.valueOf(this.scan.nextLine());
            this.list.remove(id);
        }
       }
    }
}