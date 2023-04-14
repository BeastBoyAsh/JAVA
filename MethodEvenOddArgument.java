import java.util.Scanner;
class MethodEvenOddArgument{
    public void evenodd(int a){   
    if(a%2==0)
    {
        System.out.println("A is Even "+a);
    }
    else
    {
        System.out.println("A is Odd "+a);
    }
    }

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
    int a=sc.nextInt();
    MethodEvenOddArgument b=new MethodEvenOddArgument();
    b.evenodd(a);
    }
}



