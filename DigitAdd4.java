class DigitAdd4
{
public static void main(String[]args)
{
int a=12345,b,c,d,e,f;

if(a>=10000 && a<=99999)
{
b=f%10;
f=f/100;
c=f%10;
f=f/100;
d=f%10;
e=b+c+d;
System.out.println("Total Sum is  "+e);
}
else
{
System.out.println("Invalid ");
}
}}
