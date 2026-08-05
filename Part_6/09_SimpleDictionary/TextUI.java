import java.util.Scanner;
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;   
    public TextUI(Scanner scan,SimpleDictionary dictionary){
        this.scanner = scan;
        this.dict = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String word = this.scanner.nextLine();
            if(word.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(word.equals("add")){
                System.out.println("Word");
                String word1 = this.scanner.nextLine();
                System.out.println("Translation:");
                String trans = this.scanner.nextLine();
                this.dict.add(word1,trans);
            }else if(word.equals("search")){
                System.out.println("To be translated:");
                String trans1 = this.scanner.nextLine();
                if(!(this.dict.contains(trans1))){
                    System.out.println("Word "+trans1+" was not found");
                }else{
                    System.out.println("Translation:"+this.dict.translate(trans1));
                }
                
            }else
                System.out.println("Unknown command");
            }
        
    }
   }
