import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = "0/100";
        String second = "0/100";
        String[] contain1 = first.split("/");
        String[] contain2 = second.split("/");
        int valueContain1 = Integer.valueOf(contain1[0]);
        int valueContain2 = Integer.valueOf(contain2[0]);  

        while (true) {
            System.out.println("First: "+valueContain1+"/100");
            System.out.println("Second: "+valueContain2+"/100");
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");            
            int value = Integer.valueOf(parts[1]);            
            if(parts[0].equals("add")){
                if(((valueContain1+value)<=100)){
                    if(value<0){
                        valueContain1 = valueContain1;
                    }else{
                        valueContain1 += value;
                    }
                }else{
                    valueContain1 = 100;
                }
            }else if(parts[0].equals("move")){
                if(valueContain1>=value){
                    if((value+valueContain2)<=100){
                        valueContain2 += value;
                        valueContain1 -= value;
                    }else{
                        valueContain2 = 100;
                        valueContain1 -= value;
                    }
                }else{
                    if((valueContain2+valueContain1)<=100){
                        valueContain2 += valueContain1;
                        valueContain1 = 0;
                    }else{
                        valueContain2 = 100;
                        valueContain1 = 0;
                    }
                }
            }else if(parts[0].equals("remove")){
                if(valueContain2<value){
                    valueContain2 -= valueContain2; 
                }else{
                    valueContain2 -= value;
                }
            }
        }
    }

}
