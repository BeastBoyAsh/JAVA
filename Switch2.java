import java.util.Scanner;
class Switch2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a,b,c,n;

System.out.println(" Enter Your choice ");

System.out.println(" 1. for Add. ");

System.out.println(" 2. for Even & Odd. ");

System.out.println(" 3. for Greater of Three numbers. ");
n=sc.nextInt();
switch (n)
{
case 1:
System.out.println(" Input Variables ");
a=sc.nextInt();
b=sc.nextInt();
System.out.println(" A is . "+a);
System.out.println(" B is . "+b);
c=a+b;
System.out.println(" Sum is  "+c);

break;
case 2:
System.out.println(" Input Variable ");
a=sc.nextInt();
System.out.println(" A is . "+a);
if(a%2==0){
System.out.println(" Its Even  "+a);
}
else
{
System.out.println(" Its Odd  "+a);
}

break;
case 3:
System.out.println(" Input Variables ");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.println(" A is . "+a);
System.out.println(" B is . "+b);
System.out.println(" C is . "+c);

if(a>b && a>c)
{
System.out.println(" A is Greater. "+a);
}
if(b>a && b>c)
{
System.out.println(" B is Greater. "+b);
}
if(c>b && c>a)
{
System.out.println(" C is Greater. "+c);
}
break;
default:
System.out.println(" Invalid Entry ");
}
}}

