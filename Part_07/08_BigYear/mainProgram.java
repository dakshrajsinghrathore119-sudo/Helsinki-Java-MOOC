import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        
        Start(scan);

    }
    
    public static void Start(Scanner s){
        ArrayList<Bird> b = new ArrayList<>();
        while(true){    
            System.out.println("?");
            String command = s.nextLine();
            if(command.equals("Quit")){
                break;
            }
            if(command.equals("Add")){
                System.out.println("Name:");
                String name = s.nextLine();
                System.out.println("Name in Latin:");
                String nameL = s.nextLine();
                Bird bird = new Bird(name,nameL);
                b.add(bird);
            }
            if(command.equals("Observation")){
                System.out.println("Bird:");
                String nameS = s.nextLine();
                boolean check = false;
                for(Bird birde:b){
                    if(birde.getName().equals(nameS)){
                        birde.addObserve();
                        check = true;
                        break;
                    }
                }  
                if(check==false){
                    System.out.println("Not a bird!");
                }   
            }else if(command.equals("All")){
                for(Bird birde:b){
                    System.out.println(birde);
                }
            }else if(command.equals("One")){
                System.out.println("Bird?");
                String bird = s.nextLine();
                for(Bird birde:b){
                    if(birde.getName().equals(bird)){
                        System.out.println(birde);
                    }
                }
            }
        }
    }

}
