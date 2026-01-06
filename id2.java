import java.util.*;
class add//Inheritance program
{
  int num1;
  int num2;
  public int addNum(int x,int y)
  {
      int sum=0;
      num1=x;
      num2=y;
      sum=num1+num2;
      return(sum);
  }
}
class Sub extends add
{
    int subNum()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number1");
      num1=sc.nextInt();
      System.out.println("Enter the number2");
      num2=sc.nextInt();
      int z=super.addNum(num1,num2);
      System.out.println("sum is"+z);
      int res=num1-num2;
      return res ;
    }
}
public class id2
{
   public static void main(String ar[])
   {  
     Sub obj=new Sub();
     int b=obj.subNum();
     System.out.println("\n Difference="+b);
   }
}
