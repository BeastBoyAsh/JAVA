import java.util.Scanner;
class Input4
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the marks ");
float a=sc.nextFloat();
float b=sc.nextFloat();
float c=sc.nextFloat();
System.out.println("Marks in 1st Subject is "+a);
System.out.println("Marks in 2nd Subject is "+b);
System.out.println("Marks in 3rd Subject is "+c);

float d;
d=(a+b+c);
System.out.println("The Average marks  is "+d);

if(d>80 && d<=100)
{
System.out.println("Grade A");
}
if(d>60 && d<=80)
{
System.out.println("Grade B");
}
if(d>40 && d<=60)
{
System.out.println("Grade C");
}
if(d>20 && d<=40)
{
System.out.println("Grade D");
}
if(d>=0 && d<=20)
{
System.out.println("FAIL");
}
}}
