import java.util.*;
class probablity
{
    public static void main(String args[])
    {
        int g=0,r=0,y=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the frequency of red ball");
        r=sc.nextInt();
        System.out.println("enter the frequency of yellow ball");
        y=sc.nextInt();
        System.out.println("enter the frequency of green ball");
        g=sc.nextInt();
        if(r==1 && y==1)
        System.out.println("using red and yellow ball or yellow and red ball in a straight line");
        if(r==1 && g==1)
        System.out.println("using red and green ball or green and red ball in a straight line");
        if(g==1 && y==1)
        System.out.println("using green and yellow ball or yellow and red ball in a straight line");
    }
}