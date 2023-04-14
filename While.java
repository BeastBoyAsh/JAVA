import java.util.Scanner;
class While{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    while(n!=0)
    {
        b=n%10;
        System.out.println(b);
        n=n/10;
    }
    }
 }

