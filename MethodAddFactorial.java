import java.util.Scanner;
class MethodAddFactorial{
    public void add(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers ");

    int a=sc.nextInt();
    int b=sc.nextInt();

    System.out.println("A is " +a);
    
    System.out.println("B is "+b);
    int c= a+b;
    System.out.println("The sum is "+c);
    }
    
    public void factorial(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");

    int a=sc.nextInt();
    int f=1,i;
    System.out.println("A is " +a);
    for(i=a;i>=1;i--)
    {
        f=f*i;
    }
    System.out.println("The factorial is "+f);
    }


    public static void main(String[] args){
    MethodAddFactorial a=new MethodAddFactorial();
    a.factorial();
    a.add();
    }
}





