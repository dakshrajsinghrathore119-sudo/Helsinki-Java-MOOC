import java.util.ArrayList;
import java.util.HashMap;
public class StorageFacility {
    private HashMap<String, ArrayList<String>> unit;
    
    public StorageFacility(){
        this.unit = new HashMap<>();
    }
    
    public void add(String unit,String item){
        this.unit.putIfAbsent(unit, new ArrayList<>());
        
        this.unit.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String units){
        if(this.unit.containsKey(units)){
            return this.unit.get(units);
        }
        return new ArrayList<>();
    }
    
    public void remove(String unit,String item){
        if(this.unit.containsKey(unit)){
            this.unit.get(unit).remove(item);
            if(this.unit.get(unit).equals("")){
            this.unit.remove(unit);
        }
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for(String unit:this.unit.keySet()){
            if(!(this.unit.get(unit).isEmpty())){
                units.add(unit);
            }
            
        }
        return units;
    }    
}