//Swapping without third varaible
import java.util.*;
class swaps
{
int a,b;
public void initialise()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the numbers");
a=sc.nextInt();
b=sc.nextInt();
}
public void display()
{
System.out.println(a+""+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println(a+""+b);
}
public static void main(String []args)
{
swaps s=new swaps();
s.initialise();
s.display();
}
}

