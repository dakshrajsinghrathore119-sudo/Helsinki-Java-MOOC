import java.util.ArrayList;
public class GradeDistibution {
    private Points grades;
    
    public GradeDistibution(Points Grades){
        this.grades = Grades;
    }
    
    public void grading(){
        ArrayList<Integer> points = grades.getList();
        String g5 = "";String g4 = "";String g3 = "";String g2 = ""; String g1 = "";String g0 = "";
        for(int point:points){
            if(point>=90){
                g5 += "*";
            }else if(point>=80){
                g4 += "*";
            }else if(point>=70){
                g3 += "*";
            }else if(point>=60){
                g2 += "*";
            }else if(point>=50){
                g1 += "*";
            }else{
                g0 += "*";
            }
        }
        System.out.println("Grade distribution:");
        System.out.println("5:"+g5);
        System.out.println("4:"+g4);
        System.out.println("3:"+g3);
        System.out.println("2:"+g2);
        System.out.println("1:"+g1);
        System.out.println("0:"+g0);
    }
}
