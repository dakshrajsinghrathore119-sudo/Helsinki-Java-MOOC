import java.util.Scanner;
public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = "0/100";
        String second = "0/100";
        String[] partF = first.split("/");
        String[] partS = second.split("/");
        int valueF = Integer.valueOf(partF[0]);
        int valueS = Integer.valueOf(partS[0]);
        while (true){
            System.out.println("First: "+valueF+"/100");
            System.out.println("Second: "+valueS+"/100"); 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] split = input.split(" ");
            int value = Integer.valueOf(split[1]);
            if(split[0].equals("add")){
                if(value<0){
                    valueF += 0;
                }else if((valueF+value)<100){
                    valueF += value;
                }else{
                    valueF = 100;
                }
            }else if(split[0].equals("move")){
                if(value<=valueF){
                    if((valueS+value)<100){
                        valueS += value;
                        valueF -= value;
                    }else{
                        valueS = 100;
                        valueF -= value;
                    }
                }else{
                    int valve = valueF;
                    if((valueS+valve)<100){
                        valueS += valve;
                        valueF = 0;
                    }else{
                        valueS = 100;
                        valueF = 0;
                    }
                }
            }else if(split[0].equals("remove")){
                if((valueS-value)>0){
                    valueS -= value;
                }else{
                    valueS = 0;
                }
            }
//            System.out.println("First: "+valueF+"/100");
//            System.out.println("Second: "+valueS+"/100");            

        }
    }

}
