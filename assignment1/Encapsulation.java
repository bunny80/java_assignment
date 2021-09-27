class EncapsulationDemo{
    private int id;
    private String name;
    private int age;

    //Getter and Setter methods
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newValue){
        age = newValue;
    }

    public void setName(String newValue){
        name = newValue;
    }

    public void setId(int newValue){
        id = newValue;
    }
}
public class Encapsulation{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setName("XYZ");
         obj.setAge(21);
         obj.setId(22334);
         System.out.println("Employee Name: " + obj.getName());
         System.out.println("Employee Id: " + obj.getId());
         System.out.println("Employee Age: " + obj.getAge());
    } 
}