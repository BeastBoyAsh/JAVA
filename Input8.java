import java.util.Scanner;
class Input8
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Three Numbers ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println("First side "+a);
System.out.println("Second side "+b);
System.out.println("Third side "+c);

int d=a+b+c;
System.out.println("The Sum of sides are "+d);

if(a==b && b==c)
{
System.out.println("Equilateral triangle");
}

if(a==b || a==b || b==c)
{
System.out.println("Scalene traingle");
}
else
{
System.out.println("Isosceles triangle");
}

}}
