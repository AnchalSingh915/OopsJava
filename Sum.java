import java.util.*;
public class Sum
{
    protected int x=5,y=8,z;
    void add()
    {
        z=x+y;
        System.out.println("output will be displayed in display function");
    }
    void display()
    {
       System.out.println("Sum of the number is"+z); 
    }
}
 class abc3//protected
{
    public static void main(String args[])
    {
        Sum ob=new Sum();
        ob.add();
        ob.display();
    }
}
