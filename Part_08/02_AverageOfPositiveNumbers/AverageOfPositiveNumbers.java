import java.util.Scanner;
public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int values = 0;
        while(true){
            int nums = Integer.valueOf(scanner.nextLine());
            if(nums==0){
                break;
            }
            if(nums>0){
                total += nums;
                values++;
            }
        }
        if(total==0){
            System.out.println("Cannot calculate the average");
        }else{
            double avg = (1.0*total)/values;
            System.out.println(avg);
        }
    }
}
