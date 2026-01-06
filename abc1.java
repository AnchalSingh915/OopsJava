import java.util.*;
import java.util.*;
class abc1//public
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
    public int x,y,z;
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
