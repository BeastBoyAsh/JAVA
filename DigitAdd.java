class DigitAdd
{
public static void main(String[]args)
{
int a=12345,b,c,d,e,f;

b=a%10;
a=a/100;
c=a%10;
a=a/100;
d=a%10;
e=b+c+d;
System.out.println("Total Sum is  "+e);
if(e%2==0)
{
System.out.println("Its even ");
}	 
 if(e%2!=0) 	 
{
System.out.println("Its odd ");
}
		
else
System.out.println("Not valid ");
	
}}