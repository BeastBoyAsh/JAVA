import java.util.Scanner;
class Input5
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Three Numbers ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println("a is "+a);
System.out.println("b is "+b);
System.out.println("c is "+c);

int d=a+b+c;
System.out.println("The Sum is "+d);

if(a>b && c>a || a>c && b>a)
{
System.out.println("a is second greater");
}
if(b>a && c>b || b>c && a>b )
{
System.out.println("b is second greater");
}
if(c>a && b>c || c>b && a>c )
{
System.out.println("c is second greater");
}
}}
