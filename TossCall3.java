import java.util.Scanner;
class TossCall3
{
public static void main(String[]args)
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Total Weight of Clothes  ");
a=sc.nextInt();

if(a==0)
{
System.out.println("TotalTime Estimate: 0 mins. ");
}
else
if(a<=2000 && a>0)
{
System.out.println("Total Time Estimated:25 mins. ");
}
 else	
if(a<=4000 && a>2001)
{
System.out.println("Total Time Estimated:35 mins. ");
}	
else	
if(a>=4001&& a<=7000)
{
System.out.println("Total Time Estimated:45 mins. ");
}	
else	
System.out.println("SYSTEM OVERLOAD ");	
}}