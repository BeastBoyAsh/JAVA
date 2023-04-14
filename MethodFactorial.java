import java.util.Scanner;
class MethodFactorial{
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
    MethodFactorial a=new MethodFactorial();
    a.factorial();
    }
}



