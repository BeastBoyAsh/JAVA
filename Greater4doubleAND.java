class Greater4doubleAND
{
public static void main(String[]args)
{
float m1=37.5f,m2=38.3f,m3=39.4f,t,p;

System.out.println(" Marks in sub 1 " +m1);
System.out.println(" Marks in sub 1 " +m2);
System.out.println(" Marks in sub 1 " +m3);

t=m1+m2+m3;
p=t*(100/300);
if(p>=75 && p<=100)
{
System.out.println("Grade A");
}
if(p>=60 && p<=74)
{
System.out.println("Grade B");
}
if(p>=40 && p<=59)
{
System.out.println("Grade Barely Pass");
}
if(p>=
0 && p<=40)
{
System.out.println("Grade Fail");
}
}}