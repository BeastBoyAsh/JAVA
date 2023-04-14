import java.util.Scanner;
import java.util.Arrays;

class ArrayAscending{
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
    Arrays.sort(x);
    System.out.println("The numbers in ascending order is");
    for(i=0;i<x.length;i++)
    {
        System.out.println(+x[i]);
    }
    

    }
}