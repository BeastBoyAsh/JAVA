import java.util.Scanner;
class TossCall
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=10,k=5;
int num;
num=sc.nextInt();
if(num>=1 && num <=5){
System.out.println("Number of candies sold "+num);
System.out.println("Numbver of candies left "+(n-num));
}
else
{
System.out.println("Invalid");
System.out.println("Number of candles left");
}
}}