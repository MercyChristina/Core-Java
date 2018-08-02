
//Factorial using recursion 
import java.util.*;
class Fact
{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[])
{  
 int result;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n=sc.nextInt();
result=fact(n);
  System.out.println("Factorial of number is: "+result);    
 }  

