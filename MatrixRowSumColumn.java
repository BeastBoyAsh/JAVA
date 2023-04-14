import java.util.Scanner;
class MatrixRowSumColumn{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [][] a=new int[3][3];
        int i,j,t=0,s=0;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.println("Enter the number ");
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("The matrix is ");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println(" ");
        }


        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                s=s+a[i][j];
                t=t+a[j][i];
            }
            System.out.println("The sum of R"+i+" is " +s);
            System.out.println("The sum of C"+i+" is " +t);
            s=0;
            t=0;
        }

    }  
    }


    
                  
