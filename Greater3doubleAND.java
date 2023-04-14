class Greater3doubleAND
{
public static void main(String[]args)
{
int a=15;
System.out.println(" a is =  " +a);

if(a%3==0 && a%5==0)
{
System.out.println("Divisible by both 3 and 5");
}
if(a%3!=0 && a%5!=0)
{
System.out.println("Not divisible by both 3 and 5");
}
if(a%3!=0 && a%5==0)
{
System.out.println("Divisible by 5");
}
if(a%3==0 && a%5!=0)
{
System.out.println("Divisible by 3");
}
}}