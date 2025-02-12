// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str=sc.next();
        String revstr="";
        System.out.println("");

        for(int i=str.length()-1;i>=0;i--)
        {
            revstr=revstr+str.charAt(i);
        }
        
        System.out.println("Reverse String is :"+revstr);
        
        
        if(str.equals(revstr))
        {
            System.out.println("String is palindrome:");
        }
        else
        {
            System.out.println("String is not palindrome:");

        }

    }
}
