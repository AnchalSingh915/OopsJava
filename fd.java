import java.util.*;
class fd
{ Scanner sc=new Scanner(System.in);
   int amount;
   float time;
   float interest;
   float total;
   float rate=8.5f;
    void accept()
   {  
     System.out.println("enter the amount");
     amount=sc.nextInt();
     System.out.println("enter the time");
     time=sc.nextFloat();
   }
   public void calc()
   {
       interest=(amount*time*rate)/100;
       total=amount+interest;
   }
   public void dis()
   {
       System.out.println("Amount:"+amount);
       System.out.println("Time:"+time);
       System.out.println("Interest rate:"+rate);
       System.out.println("********************************");
       System.out.println("Interest:"+interest);
       System.out.println("Net payable amount:"+total);
   }
   public static void main ()
   {
       fd f1=new fd();
       f1.accept();
       f1.calc();
       f1.dis();
   }
}
   
   
    
   
