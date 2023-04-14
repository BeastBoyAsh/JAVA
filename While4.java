import java.util.Scanner;
class While4{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,m=0;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    while(n!=0)
    {
        b=n%10;
        if(m<b)
        {
         m=b;
        }
        n=n/10;
    }
    System.out.println("The Max digit is "+m);
    }
 }

