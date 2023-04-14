import java.util.Scanner;
class While3{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b,c=0;
    System.out.println("Enter the number ");
    int n=sc.nextInt();
    System.out.println("Entered number is "+n);
    while(n!=0)
    {
        b=n%10;
        c=c+1;
        n=n/10;
    }
    System.out.println("The number of digits is "+c);
    }
 }

