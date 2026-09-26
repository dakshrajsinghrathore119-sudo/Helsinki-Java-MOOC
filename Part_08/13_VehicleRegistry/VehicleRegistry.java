import java.util.ArrayList;
import java.util.HashMap;
public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> vr;
    
    public VehicleRegistry(){
        this.vr = new HashMap<>();
    }
    
    public boolean add(LicensePlate license, String owner){
        if(this.vr.containsKey(license)){
            return false;
        }
        this.vr.put(license, owner);
        return true;
    }
    
    public String get(LicensePlate license){
        if(this.vr.containsKey(license)){
            return this.vr.get(license);
        }
        return null;
    }
    
    public boolean remove(LicensePlate license){
        if(this.vr.containsKey(license)){
            this.vr.remove(license);
            return true;
        }
        return false;
    }
    
    public void printLicensePlates(){
        for(LicensePlate li:this.vr.keySet()){
            System.out.println(li);
        }
    }
    
    public void printOwners(){
        ArrayList<String> values = new ArrayList<>();
        for(String ow:this.vr.values()){
            if(values.contains(ow)){
                continue;
            }else{
                System.out.println(ow);
                values.add(ow);
            }
        }
    }
}
