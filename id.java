import java.io.*;
class add//Inheritance program
{
  int num1;
  int num2;
  public int addNum()
  {
      int sum=0;
      sum=num1+num2;
      return sum;
  }
}
class Sub extends add
{
    int subNum()
    {
        int res=0;
        res=num1-num2;
        return res;
    }
}
public class id
{
   public static void main(String ar[])
   {
     Sub obj=new Sub();
     obj.num1=10;
     obj.num2=5;
     int a=obj.addNum();
     int b=obj.subNum();
     System.out.println("\n Number1="+obj.num1);
     System.out.println("\n Number2="+obj.num2);
     System.out.println("\n Sum="+a);
     System.out.println("\n Difference="+b);
   }
}