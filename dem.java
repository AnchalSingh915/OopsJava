import java.util.*;
class dem
{
    int rno;
    String name;
    public  void init(int rno, String name)
    {
        this.rno=rno;
        this.name=name;
    }
    public void display()
    {
      System.out.println("roll no. is    "+this.rno+"  name is  " +this.name);
    }
    public static void main(String args[])
    {
      dem obj=new dem();
      obj.init(1,"Namit");
      obj.display();
    }
}
