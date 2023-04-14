class DigitAdd2
{
public static void main(String[]args)
{
int a=123456,b,c,d,e,f,z=0;
while(a!=0){
a=a/10;
z++;
}
System.out.println("Total elements "+z);
if(z==5){
b=a%10;
a=a/100;
c=a%10;
a=a/100;
d=a%10;
e=b+c+d;
System.out.println("Total Sum is  "+e);
}
else{System.out.println("Invalid ");}
}}
