import java.util.Scanner;
class ArraySumOfFirstDigit{
    public static void main(String[]args){
    int s=0;
    int i,b=0;
    int[] x=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number ");
    for(i=0;i<x.length;i++)
    {
        x[i]=sc.nextInt();
    }
    for(i=0;i<x.length;i++)
    {
        while(x[i]!=0)
        {
           b=x[i]%10;
           x[i]=x[i]/10;
        }
        s=s+b;
    }
    System.out.println("The sum of first digit is "+s);

    }
}