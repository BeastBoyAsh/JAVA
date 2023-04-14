import java.util.Scanner;
class Switch
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a,b,c,n;
System.out.println(" Input Variables ");
a=sc.nextInt();
b=sc.nextInt();

System.out.println(" A is . "+a);
System.out.println(" B is . "+b);

System.out.println(" Enter Your choice ");

System.out.println(" 1. for Add ");

System.out.println(" 2. for Sub ");

System.out.println(" 3. for Mul ");
n=sc.nextInt();
switch (n)
{
case 1:
c=a+b;
System.out.println(" Add is  "+c);
break;
case 2:
c=a-b;
System.out.println(" Sub is  "+c);
break;
case 3:
c=a*b;
System.out.println(" Mul is  "+c);
break;
default:
System.out.println(" Invalid Entry ");

}
}}

