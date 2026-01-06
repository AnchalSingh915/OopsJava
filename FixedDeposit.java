class FixedDeposit
{ 
   int amount;
   float time;
   float interest;
   float total;
   float rate=8.5f;
    void accept(int b,float c)
   {
       amount=b;
       time=c;
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
   public static void main (int a,float t)
   {
       FixedDeposit f1=new FixedDeposit();
       f1.accept(a,t);
       f1.calc();
       f1.dis();
   }
}
   
   
    
   