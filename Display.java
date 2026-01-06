import java.util.*;
class Emp//Inheritance program
{
  int ppfno;
  int Basicpay;
  public void set()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the ppf number");
      ppfno=sc.nextInt();
      System.out.println("ENter the Basic pay");
      Basicpay=sc.nextInt();
  }
  public void show()
   {
       System.out.println("\nppf number"+ppfno+"\nBasic pay"+Basicpay);
   }
}
class OfficialStaff extends Emp
{
    String name;
    int Hra,ta,da;
    public void set()
    {
      super.set();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Name");
      name=sc.nextLine();
      da=(Basicpay*25)/100;
      Hra=(da*35)/100;
      ta=(Hra*25)/100;
    }
    public void show()
    {
       super.show(); 
       System.out.println("\nName"+name+"\nHRA"+Hra+"\nTA"+ta+"\n da"+da);
    }
}
class Teacher extends Emp
{
   String name;
    int Hra,da,ta;
   public void set()
   {
      super.set();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Name");
      name=sc.nextLine();
      da=(Basicpay*40)/100;
      Hra=(da*50)/100;
      ta=(Hra*40)/100;
   }
   public void show()
   {
       super.show(); 
       System.out.println("\nName"+name+"\nHRA"+Hra+"\nDA"+da+"\nTA"+ta);
   }
}
class GroupD extends Emp
{
    String name;
      int adno,Hra,da,ta;
   public void set()
   {
      super.set();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Name");
      name=sc.nextLine();
      System.out.println("Enter the Adhaar Number");
      adno=sc.nextInt();
      da=(Basicpay*20)/100;
      Hra=(da*25)/100;
      ta=(Hra*20)/100;
   }
   public void show()
   {
       super.show(); 
       System.out.println("\nName"+name+"\nadhaar number"+adno+"\nHRA"+Hra+"\nDA"+da+"\nTA"+ta);
   }
}
public class Display
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("1 for officialStaff");
       System.out.println("2 for Teacher");
       System.out.println("3 for GroupD");
       System.out.println("Enter the choice");
       int x=sc.nextInt();
       if(x==1)
       {
       OfficialStaff obj1=new OfficialStaff();
       obj1.set();
       obj1.show();
       }
       if(x==2)
       {
       Teacher obj2=new Teacher();
       obj2.set();
       obj2.show();
       }
       if(x==3)
       {
       GroupD obj3=new GroupD();
       obj3.set();
       obj3.show();
       }
    }
}