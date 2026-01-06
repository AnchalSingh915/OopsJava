import java.util.*;
public class q4
{
    double pri,time,rate,CIamt;
    public q4(double rate,double time,double pri)
    {
        this.rate=rate;
        this.time=time;
        this.pri=pri;
    }
    public void calCI()
    {
        CIamt=pri*(Math.pow(1+rate/100,time)-1);
    }
    public static void main(String args[])
    {
        q4 ob=new q4(9,5,10000);
        ob.calCI();
        System.out.println("Compound Interest is:"+ob.CIamt);
    }
}
