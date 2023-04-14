import java.util.Scanner;
class ArrayMax{
    public static void main(String[]args){
    int s=0;
    int i,m;
    int[] x=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number ");
    for(i=0;i<x.length;i++)
    {
        x[i]=sc.nextInt();
    }

    m=x[0];
    for(i=0;i<x.length;i++)
    {
        if(m<x[i])
        {
            m=x[i];
        }
    }
    System.out.println("The max is "+m);

    }
}