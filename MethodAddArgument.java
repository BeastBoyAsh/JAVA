import java.util.Scanner;
class MethodAddArgument{
    public void add(int a,int b){   
    int c;
    c=a+b;
    System.out.println("Sum is "+c);
    }

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    MethodAddArgument d=new MethodAddArgument();
    d.add(a,b);
    }
}



