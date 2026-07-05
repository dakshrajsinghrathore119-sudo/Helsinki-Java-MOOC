import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        
        Statistics total = new Statistics();
        Statistics eve = new Statistics();
        Statistics od = new Statistics();
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num==-1){
                break;
            }
            if(num%2==0){
                eve.addNumber(num);
            }else{
                od.addNumber(num);
            }
            total.addNumber(num);
        }
        int sEve = eve.sum();
        int sOd = od.sum(); 
        int sTotal = total.sum();
        System.out.println("Count: "+total.getCount());
        System.out.println("Sum: "+sTotal);
        System.out.println("Sum of even numbers: "+sEve);
        System.out.println("Sum of odd numbers: "+sOd);
        System.out.println("Average: "+total.average());

    }
}
