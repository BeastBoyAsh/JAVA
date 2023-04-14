class DigitAdd5
{
public static void main(String[]args)
{
int a=12345,b,c,d,e;

if(a>=10000 && a<=99999)
{
b=a%10;
a=a/100;
c=a%10;
a=a/100;
d=a%10;
e=b+c+d;
System.out.println("Total Sum is  "+e);
}
else
{
System.out.println("Invalid ");
}
}}
