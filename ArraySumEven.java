import java.util.Scanner;
class ArraySumEven{
    public static void main(String[]args){
    int s=0;
    int i;
    int[] x=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number ");
    for(i=0;i<x.length;i++)
    {
        x[i]=sc.nextInt();
    }
    for(i=0;i<x.length;i++)
    {
        if(x[i]%2==0)
        {
            s=s+x[i];
        }
    }
    System.out.println("The sum of odd is "+s);

    }
}