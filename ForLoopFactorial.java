import java.util.Scanner;
class ForLoopFactorial{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int i,j,s=1;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    for(i=n;i>=1;i=i-1)
    {
        for(j=i;j>=1;j=j-1)
        {
            s=s*j;
        }
        System.out.println("The factorial is "+s);
        s=1;
    }
    }
 }

