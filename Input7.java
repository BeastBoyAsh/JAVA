import java.util.Scanner;
class Input7
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

if(a>b && a>c)
{
if(b>c){
System.out.println("b is second greater");
       }
else
System.out.println("c is second greater");
}


if(b>a && b>c)
{
if(a>c){
System.out.println("a is second greater");
}
else{
System.out.println("c is second greater");
}

}
if(c>a && c>b)
{
if(a>b){
System.out.println("a is second greater");
}
else
System.out.println("b is second greater");
}
}}
