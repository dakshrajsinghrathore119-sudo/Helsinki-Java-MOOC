import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        ArrayList<Recipe> recipes = new ArrayList<>();  
        Start(recipes);
}
    public static void Start(ArrayList<Recipe> recipes){
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String fileName = scanner.nextLine();        
        try(Scanner files = new Scanner(Paths.get(fileName))){
            while(files.hasNextLine()){
                String name = files.nextLine();
                if(name.isEmpty()){
                    continue;
                }
                int time = Integer.valueOf(files.nextLine());
                ArrayList<String> ingre = new ArrayList<>();
                while(files.hasNextLine()){
                    String ingredient = files.nextLine();
                    if(ingredient.isEmpty()){
                        break;
                    }
                    ingre.add(ingredient);
                }
                Recipe adding = new Recipe(name,time,ingre);
                recipes.add(adding);
            }
            
        } catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("Stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while(true){
            System.out.println("Enter Command:");
            String command = scanner.nextLine();            
            if(command.equals("stop")){
                break;
            }
            if(command.equals("list")){
                System.out.println("Recipes");
                for(Recipe recipe:recipes){
                    System.out.println(recipe.getName()+", "+"cooking time: "+recipe.getCookingTime()+".");
                }
            }else if(command.equals("find name")){
                System.out.println("Searched word:");
                String word = scanner.nextLine();
                System.out.println("Recipes:");
                for(Recipe recipe:recipes){
                    if(recipe.getName().contains(word)){
                        System.out.println(recipe.getName()+", "+"cooking time: "+recipe.getCookingTime()+".");
                    }
                }
            }else if(command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                for(Recipe recipe:recipes){
                    if(recipe.getCookingTime()<=time){
                        System.out.println(recipe.getName()+", "+"cooking time: "+recipe.getCookingTime()+".");
                    }
                }
            }else if(command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String ingre = scanner.nextLine();
                for(Recipe recipe:recipes){
                    ArrayList<String> ingres = recipe.getRecipe();
                    if(ingres.contains(ingre)){
                        System.out.println(recipe.getName()+", "+"cooking time: "+recipe.getCookingTime()+".");
                    }
                }
            }
            
        }
    }
}
