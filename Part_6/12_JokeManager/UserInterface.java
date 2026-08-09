import java.util.Scanner;
public class UserInterface {
    private JokeManager joke;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes,Scanner scan){
        this.joke = jokes;
        this.scanner = scan;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3- list jokes");
            System.out.println("X - stop");
            String word = this.scanner.nextLine();
            
            if(word.equals("X")){
                break;
            }
            if(word.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                this.joke.addJoke(joke);
            }else if(word.equals("2")){
                System.out.println(this.joke.drawJoke());
            }else if(word.equals("3")){
                System.out.println("Printing the jokes.");
                this.joke.printJokes();
            }
        }
    }
}
