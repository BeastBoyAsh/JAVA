import java.util.Stack;
import java.util.Scanner;

class Stackv2{
public static void main(String[] args){
Stack<Integer> s=new Stack<Integer>();
Scanner sc=new Scanner(System.in);
while(true)
{
    System.out.println("Press 1 for insertion");
    System.out.println("Press 2 for pop");
    System.out.println("Press 3 for sum");
    System.out.println("Press 4 to exit");
    
    int n=sc.nextInt();
    if(n==1)
    {
        System.out.println("Enter number to be inserted ");
        s.push(sc.nextInt()); 
    }
    else
    if(n==2)
    {
        if(s.isEmpty())
        {
            System.out.println("Empty stack "); 
        }
                   else
        {
            System.out.println(s.pop()); 
        }
    }
    else
    if(n==3)
    {
        int d=0;
        for(int v:s)
        {
            d=d+v;
        }
        System.out.println("Sum of stack is "+d);
    }
    else
    if(n==4)
    {
        break;
    }
}
}
}