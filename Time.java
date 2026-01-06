import java.io.*;
class Time
{
        int hr,min,sec;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        public void take()throws IOException
        {
            System.out.println("Enter Hour:");
            hr=Integer.parseInt(br.readLine());
            System.out.println("Enter minute:");
            min=Integer.parseInt(br.readLine());
            System.out.println("Enter seconds:");
            sec=Integer.parseInt(br.readLine());
        }
        public void showT(Time ob)
        {
         System.out.println("The time is"+hr+":"+min+":"+sec);
        }
    public static void main(String args[]) throws IOException 
    {
        Time ob1=new Time();
        Time ob2=new Time();
        ob1.take();
        ob2.take();
        ob1.showT(ob1);
        ob2.showT(ob2);
    }
   }
