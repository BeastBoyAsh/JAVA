import java.util.Scanner;
class MethodAdd2{
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
    public static void main(String[] args){
    int i;
    for(i=1;i<=5;i++)
    {
    MethodAdd2 a=new MethodAdd2();
    a.add();
    }
    }
}



