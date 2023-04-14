import java.util.Scanner;
class MethodGreater2{
    public void greater(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers ");

    int a=sc.nextInt();
    int b=sc.nextInt();
    int c
    =sc.nextInt();

    System.out.println("A is " +a);
    
    System.out.println("B is "+b);

    System.out.println("C is "+c);
    
    if(a>b && a>c)
    {
        System.out.println("C is greater "+c);
    }
    else
    if(b>c && b>a)
    {
        System.out.println("B is greater "+b);
    }
    else
    if
    (c>a && c>b)
    {
        System.out.println("C is greater "+c);
    }
    
    }

    public static void main(String[] args){
    MethodGreater2 a=new MethodGreater2();
    a.greater();
    }
}



