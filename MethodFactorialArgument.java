import java.util.Scanner;
class MethodFactorialArgument{
    public void factorial(int a){   
    int i,f=1;
    for(i=a;i>=1;i--)
    {
        f=f*i;
    }
    System.out.println("Factorial is "+f);
    }

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    int a=sc.nextInt();
    MethodFactorialArgument b=new MethodFactorialArgument();
    b.factorial(a);
    }
}



