import java.util.*;
public class abc4
{
    public static void main(String args[])
    {
        Sum ob=new Sum();
        ob.x=5;
        ob.y=10;
        ob.add();
        ob.display();
    }
}
class Sum
{
    int x,y,z;//default 
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
