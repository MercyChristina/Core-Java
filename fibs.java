//Fibonocci series
import java.util.*;
class fibs
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int n1=0;
int n2=1;
int n3=sc.nextInt();
int count=0;    
System.out.print(n1+" "+n2);    
for(int i=2;i<count;i++)    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;    
  n2=n3;
}
}
}