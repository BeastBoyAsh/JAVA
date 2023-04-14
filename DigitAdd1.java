class DigitAdd1
{
public static void main(String[]args)
{
int a=123456,b,c,d,e,f,z=0;

if(a%100000!=0){
System.out.println("Not valid ");
}
else{
b=a%10;
a=a/100;
c=a%10;
a=a/100;
d=a%10;
e=b+c+d;
System.out.println("Total Sum is  "+e);
}
}}
