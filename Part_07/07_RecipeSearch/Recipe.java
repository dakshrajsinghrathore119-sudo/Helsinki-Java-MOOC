import java.util.ArrayList;
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String Name,int Time,ArrayList<String> ingredient){
        this.name = Name;
        this.cookingTime = Time;
        this.ingredients = ingredient;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCookingTime(){
        return this.cookingTime;
    }
    
    public ArrayList<String> getRecipe(){
        return this.ingredients;
    }
}
