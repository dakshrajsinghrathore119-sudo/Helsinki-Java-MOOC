import java.util.Scanner;
import java.util.ArrayList;
public class Points {
    private Scanner scan;
    private double avg;
    private double avgPass;
    private double passPercent;
    private ArrayList<Integer> point;
    public Points(Scanner Scan){
        this.scan = Scan;
        this.avg = 0;
        this.avgPass = 0;
        this.passPercent = 0;
        this.point = new ArrayList<>();
    }
    
    public void Start(){
        System.out.println("Enter points totals, -1 stops:");
        int total = 0;
        int nums = 0;
        int total1 = 0;
        int nums1 = 0;
//        int g5 = 0;
//        int g4 = 0;
//        int g3 = 0;
//        int g2 = 0;
//        int g1 = 0;
//        int g0 = 0;
        
        while(true){
            int input = Integer.valueOf(this.scan.nextLine());
            if(input==-1){
                break;
            }
            if(input>0 && input<100){
                total += input;
                nums++;
                point.add(input);
//                if(input>=90){
//                    g5++;
//                }else if(input>=80){
//                    g4++;
//                }else if(input>=70){
//                    g3++;
//                }else if(input>=60){
//                    g2++;
//                }else if(input>=50){
//                    g1++;
//                }else{
//                    g0++;
//                }
            }
            if(input>=50 && input<100){
                total1 += input;
                nums1++;
            }
        }
        this.avg = (1.0*total)/nums;
        this.avgPass = (1.0*total1)/nums1;
        this.passPercent = 100*((1.0*nums1)/nums);
        
    }
    
    public ArrayList<Integer> getList(){
        return this.point;
    }
    
    public String toString(){
        return "Point average (all): "+this.avg+"\n"+
                "Point average(passing): "+this.avgPass+"\n"+
                "Pass percentage: "+this.passPercent;
    }
}
