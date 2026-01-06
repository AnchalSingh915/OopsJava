import java.util.*;
class Cylinder
{
    public double radius,height;
    public Cylinder()
    {
        double radius,height;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        radius=sc.nextDouble();
        System.out.println("enter the height");
        height=sc.nextDouble();
        this.radius=radius;
        this.height=height;
    }
    public double area()
    {
        double pi=3.14;
        double area;
        area=2*pi*radius*radius+2*pi*radius*height;
        return area;
    }
    public static void main(String args[])
    {
        Cylinder object=new Cylinder();
        System.out.println("area of cylinder"+object.area());
    }
}