import java.util.*;
import java.io.*;
class UsingScanneriou
{
    public static void main(String args[]) throws IOException
    {
        Scanner obj1=new Scanner(new File("C:\\Users\\infomax\\Desktop\\hellofile.txt"));
        Scanner obj2=new Scanner(new File("C:\\Users\\infomax\\Desktop\\contacnumber.txt"));
        System.out.println("*****************************");
        System.out.println("Name  contact Number");
        System.out.println("*****************************");
        while(obj1.hasNext ()==true && obj2.hasNext ()==true)
        {
            System.out.println(obj1.next()+":"+obj2.next());
        }
    }
}
