import java.util.Scanner;
class While7{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,i,f=1;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    while(n!=0)
    {
        b=n%10;
          for(i=b;i>=1;i--)
          {
             f=f*i;
          }
        n=n/10;
        System.out.println("The factorial of "+b+" is "+f);
        f=1;
    }
    }
 }

