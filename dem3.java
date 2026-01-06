import java.util.*;
public class dem3//interger wrapper class
{
    public static void main()
    {
        String str="10",str2;
        int num,num1,num2;
        long num3,num4;
        int x=50;
        float y;
        float y1=56.3f;
        double t,t1=45.3332232323233232323;
        num=Integer.parseInt(str);
        System.out.println("Int value of the String is:"+num);
        num1=Integer.valueOf(str);
        System.out.println("Int value of the String is:"+num);
        str2=Integer.toString(x);
        System.out.println("Int value of the String is:"+str2);
        //long wrapper class
        num3=Long.parseLong(str);
        System.out.println("Int value of the String is:"+num3);
        num4=Long.valueOf(str);
        System.out.println("Int value of the String is:"+num4);
        //float wrapper class
        y=Float.parseFloat(str);
        System.out.println("Float value of the String is:"+y);
        y=Float.valueOf(str);
        System.out.println("Float value of the String is:"+y);
        str2=Float.toString(y1);
        System.out.println("Float value of the String is:"+str2);
        //Double wrapper class
        t=Double.parseDouble(str);
        System.out.println("Double value of the String is:"+y);
        t=Double.valueOf(str);
        System.out.println("Double value of the String is:"+y);
        str2=Double.toString(t1);
        System.out.println("Double value of the String is:"+str2);
    }
}
