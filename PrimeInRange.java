import java.util.Scanner;
class PrimeInRange{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int i,j,c=0;
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
            System.out.println("The prime numbers in range is "+i);
        }
        c=0;
    }
    }
 }

