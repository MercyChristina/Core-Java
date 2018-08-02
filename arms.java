//Armstrong
import java.util.*;
class arms
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int c=0,a,temp=0;
int n=sc.nextInt();
temp=n;
while(n>0)
{
a=n%10;
n=n/10;
c=c+(a*a*a);
}
if(temp==c)
System.out.println("armstrong");
else
System.out.println("not armstrong");
}
}



