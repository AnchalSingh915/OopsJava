import java.util.*;
public class q2
{
    public void checkChar(char ch)
    {
       System.out.println("Entered character is:"+ch);
       System.out.println("Is entered character a letter:"+Character.isLetter(ch));
       System.out.println("Is entered character a digit:"+Character.isDigit(ch));
       System.out.println("Is entered character in lowercase:"+Character.isLowerCase(ch));
       System.out.println("Is entered character in uppercase:"+Character.isUpperCase(ch));
       System.out.println("");
    }
    public static void main(String args[])
    {
        q2 o1=new q2();
        o1.checkChar('s');
        o1.checkChar('B');
        o1.checkChar('9');
    }
}

