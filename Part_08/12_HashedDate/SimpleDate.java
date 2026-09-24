public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        
        if(!(obj instanceof SimpleDate)){
            return false;
        }
        
        SimpleDate object = (SimpleDate) obj;
        
        if(this.day == object.day && this.month == object.month && this.year == object.year){
            return true;
        }
        return false;
    }

    public int hashCode(){
        int hash = 7;
        hash = 31*hash+day;
        hash  = 31*hash+month;
        hash = 31*hash+year;
        return hash;
    }
}