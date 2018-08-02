//palindrome
import java.util.Scanner;
public class JavaApplication21 {
  public static void main(String[] args) {
      int n,s,REV = 0,temp;
      System.out.println("enter the number");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      temp=n;
      while(n!=0){
          s=n%10;
          REV= REV*10+s;
          n=n/10;
          
      }
      System.out.println(REV);  
       
      if(REV==temp){
          System.out.println("palliandrome");
      }
      else{
          System.out.println(" not a palliandrome");
      }
}
     
}
 