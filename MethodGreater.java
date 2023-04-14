import java.util.Scanner;
class MethodGreater{
    public void greater(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers ");

    int a=sc.nextInt();
    int b=sc.nextInt();

    System.out.println("A is " +a);
    
    System.out.println("B is "+b);
    
    if(a>b)
    {
        System.out.println("A is greater "+a);
    }
    else
    {
        System.out.println("B is greater "+b);
    }
    }

    public static void main(String[] args){
    MethodGreater a=new MethodGreater();
    a.greater();
    }
}



