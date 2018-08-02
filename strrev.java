//Reverse a String
import java.util.Scanner;
public class Reversestring
 {
  public static void main(String[] args)
 {
      String s;
      System.out.println("enter the string");
      Scanner sc=new Scanner(System.in);
      s=sc.next();
      char c[]=s.toCharArray();
      for(int i=s.length()-1;i>=0;i--)
{
          System.out.println(c[i]);
      }
}
}
