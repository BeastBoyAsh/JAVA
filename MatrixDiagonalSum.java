import java.util.Scanner;
class MatrixDiagonalSum{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [][] a=new int[3][3];
        int i,j,s=0,t=0;
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
                if(i+j==2){
                    s=s+a[i][j];
                }
                if(i==j){
                    t=t+a[i][j];
                }
            }
            System.out.println(" ");
        }
        System.out.println("The sum of D1 is "+s);
        System.out.println("The sum of D2 is "+t);

   }
}











    
    
                  
