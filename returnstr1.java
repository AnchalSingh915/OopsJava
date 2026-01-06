import java.util.*;
class returnstr1
{
    public String pcu(String str)
    {
        int i=0,j=0,k=0;
        String str2="";
        Scanner sc=new Scanner(System.in);
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
              k=k+1;
        }
        str2=str2+str.charAt(0)+".";
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                j=j+1;
                if(j<k)
                str2=str2+str.charAt(i+1)+".";
                else
                str2=str2+str.charAt(i+1);
            }
        }
        return(str2);
    }   
        public static void main(String ar[])
        {
            String s="";
            String s1="";
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the string");
            s=sc.nextLine();
            returnstr1 obj=new returnstr1();
            s=obj.pcu(s);
            System.out.print(s);
            
        }
    }      