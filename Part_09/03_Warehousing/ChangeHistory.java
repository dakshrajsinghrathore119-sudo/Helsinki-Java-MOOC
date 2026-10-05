import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> obj;
    
    public ChangeHistory(){
        this.obj = new ArrayList<>();
    }
    
    public void add(double status){
        this.obj.add(status);
    }
    
    public void clear(){
        this.obj.clear();
    }
    
    public String toString(){
        String val = String.valueOf(obj);
        return val;
    }
    
    public double maxValue(){
        if(this.obj.isEmpty()){
            return 0;
        }
        double maximum = this.obj.get(0);
        for(double val:this.obj){
            if(val>maximum){
                maximum = val;
            }
        }
        return maximum;
    }
    
    public double minValue(){
        if(this.obj.isEmpty()){
            return 0 ;
        }
        double minimum = this.obj.get(0);
        for(double val:this.obj){
            if(val<minimum){
                minimum = val;
            }
        }
        return minimum;
    }
    
    public double average(){
        if(this.obj.isEmpty()){
            return 0;
        }
        int vals = 0;
        double total = 0;
        for(double val:this.obj){
            total += val;
            vals++;
        }
        double avg = total/vals;
        return avg;
    }
}