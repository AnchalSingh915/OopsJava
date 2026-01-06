import java.util.*;
public class q3
{
    
       double sal,tax=0;
       public void accept()
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Monthly salary");
           sal=sc.nextDouble();
       }
       public void dis()
       {
           System.out.println("Monthly salary:Rs."+sal);
           System.out.println("Income tax:Rs."+tax);
       }
       public void cal()
       {
           if(12*sal>175000)
           tax=(sal*12)*5/100;
           else 
           tax=0;
       }
    
    public static void main(String args[])
    {
        q3 o1=new q3();
        o1.accept();
        o1.cal();
        o1.dis();
    }
}

