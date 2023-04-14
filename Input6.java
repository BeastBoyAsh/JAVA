import java.util.Scanner;
class Input6
{
public static void main(String[]args)
{
int b,c,d,e,s;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Three Numbers ");
int a=sc.nextInt();

System.out.println("The number is "+a);

if(a>=1000 && a<=9999)
{
b=a%10;
a=a/10;
c=a%10;
a=a/10;
d=a%10;
a=a/10;
e=a%10;
s=b+c+d+e;
System.out.println("The Sum is "+s);
if(s%2==0)
{
System.out.println("Even ");
}
else
{
System.out.println("Odd ");
}}
else
System.out.println("Invalid ");
}}
