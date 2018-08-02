//Reverse a number
import java.util.Scanner;
public class numrev
{
  public static void main(String[] args) 
{
      int n,s,REV = 0;
      System.out.println("enter the number");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(n!=0){
          s=n%10;
          REV= REV*10+s;
          n=n/10;
          }
    System.out.println("reversed number="+REV);  
       }
}