public class Person {
   private String name;
   private String address;
   
   public Person(String Name,String Address){
       this.name = Name;
       this.address = Address;
   }
   
   public String toString(){
       return this.name + "\n" +"  "+this.address;
   }
}