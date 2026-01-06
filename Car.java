import java.util.*;
class Vehicle//Inheritance program
{
  String vehicleType;
  public Vehicle()
  {
      vehicleType="N/A";
  }
  public void set(String vt)
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the vehicle type");
      vt=sc.nextLine();
      vehicleType=vt;
  }
  public void show()
  {
      System.out.println("The vehicle type is:"+vehicleType);
  }
}
public class Car extends Vehicle
{
    String modelType;
    public Car()
    {
        modelType="N/A";
    }
    public void set()
    {
        String mt,vt="";
        super.set(vt);                                                                                                                                                                                                                                                                                                 Scanner sc=new Scanner(System.in);
        System.out.println("Enter the model type");
        mt=sc.nextLine();
        modelType=mt;
    }
    public void show()
    { 
        super.show();
        System.out.println("The model type is:"+modelType);
    }
    public static void main()
    {
        Car c1=new Car();
        c1.set();
        c1.show(); 
             
    }
}
