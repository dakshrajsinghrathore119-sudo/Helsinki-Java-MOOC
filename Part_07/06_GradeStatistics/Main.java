import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Points point = new Points(scanner);
        GradeDistibution grades = new GradeDistibution(point);
        
        point.Start();
        System.out.println(point);
        grades.grading();
        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
