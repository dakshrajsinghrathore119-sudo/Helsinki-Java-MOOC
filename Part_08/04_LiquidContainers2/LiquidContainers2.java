import java.util.Scanner;
public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: "+first);
            System.out.println("Second: "+second);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] split = input.split(" ");
            int value = Integer.valueOf(split[1]);
            String command = split[0];            
            if(command.equals("add")){
                first.add(value);
            }else if(command.equals("move")){
                if((first.contains()-value)>=0){
                    first.remove(value);
                    second.add(value);
                }else{
                    second.add(first.contains());
                    first.remove(first.contains());
                }
            }else if(command.equals("remove")){
                second.remove(value);
            }

        }
    }

}
