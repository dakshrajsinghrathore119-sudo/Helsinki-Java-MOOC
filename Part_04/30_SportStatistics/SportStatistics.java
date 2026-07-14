import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Name:");
        String name = scan.nextLine();
        int games = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner scanner = new Scanner(Paths.get(file))){
            
            while(scanner.hasNextLine()){
                String row = scanner.nextLine();
                String[]parts = row.split(",");
                String home = parts[0];
                String visit = parts[1];
                int hPoints = Integer.valueOf(parts[2]);
                int vPoints = Integer.valueOf(parts[3]);
                if(home.equals(name)){
                    games++;
                    if(hPoints>vPoints){
                        wins++;
                    }else if(vPoints>hPoints){
                        losses++;
                    }
                }else if(visit.equals(name)){
                    games++;
                    if(vPoints>hPoints){
                        wins++;
                    }else if(hPoints<vPoints){
                        losses++;
                    }
                }
                
            }
            
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Games: "+games);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);
        

    }

}

