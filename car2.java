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
      vehicleType=vt;
  }
  public void show()
  {
      System.out.println("The vehicle type is:"+vehicleType);
  }
}
public class car2 extends Vehicle
{
    String modelType;
    public car2()
    {
        modelType="N/A";
    }
    public void set(String mt,String vt)
    {
        super.set(vt);
        modelType=mt;
    }
    public void show()
    {
        super.show();
        System.out.println("The model type is:"+modelType);
    }
    public static void main()
    {
        car2 c1=new car2();
        c1.set("bus","123@");
        c1.show();
        car2 c2=new car2();
        c2.set("train","fgh");
        c2.show();
    }
}
