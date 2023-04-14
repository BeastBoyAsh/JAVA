import java.util.Scanner;
import java.util.Arrays;

class ArrayDescending{
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
    System.out.println("The numbers in descending order is");
    for(i=x.length-1;i>=0;i--)
    {
        System.out.println(+x[i]);
    }
    }
}