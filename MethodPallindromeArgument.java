import java.util.Scanner;
class MethodPallindromeArgument{
    public void pallindrome(int n){
    int c=0,a,z=0;
    c=n;
    while(c!=0)
    {
        a=c%10;
        z=z*10+a;
        c=c/10;
    }   
    if(z==n)
    {
        System.out.println("Its a Pallindrome number "+n);
    }
    else
    System.out.println("Its Not a Pllindrome number "+n);
    }

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    MethodPallindromeArgument b=new MethodPallindromeArgument();
    b.pallindrome(n);
    }
}



