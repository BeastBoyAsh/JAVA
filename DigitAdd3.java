class DigitAdd3
{
public static void main(String[]args)
{
int a=12345,b,c,d,e,f,z=0;
f=a;
while(a!=0){
a=a/10;
z++;
}
System.out.println("Total elements "+z);
if(z==5){
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
