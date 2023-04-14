import java.util.Scanner;
class ArrayPrime{
    public static void main(String[]args){
    int i,b=0,j,c=0;
    int[] x=new int[5];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number ");
    for(i=0;i<x.length;i++)
    {
        x[i]=sc.nextInt();
    }
    for(i=0;i<x.length;i++)
    {
        for(j=1;j<=x[i];j++)
        {
          if(x[i]%j==0)
          {
              c=c+1;
          }
        }
        if(c==2)
        {
            System.out.println("The prime in series is "+x[i]);

        }
        c=0;
    }
    
    }
}