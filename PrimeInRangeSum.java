import java.util.Scanner;
class PrimeInRangeSum{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int i,j,c=0,s=0;
    System.out.println("Enter the range ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("A is from "+a);
    System.out.println("B is till "+b);
    for(i=a;i<=b;i=i+1)
    {
        for(j=1;j<=i;j=j+1)
        {
           if(i%j==0)
           {
               c=c+1;
           }
        }
        if(c==2)
        {
            s=s+i;
        }
        c=0;
    }
    System.out.println("The sum of prime numbers in the given range is" +s);
    }
 }

