import java.util.Scanner;
class MatrixDiagonaSum{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

int s=0,i,j,t=0;
int[][] a=new int[3][3];

for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.println("Enter numbers ");
a[i][j]=sc.nextInt();
}}

System.out.print("Matrix is ");
System.out.println();
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
if(i==j)
{
s=s+a[i][j];
}
if(i+j==2)
{
t=t+a[i][j];
}
System.out.print(a[i][j]+"\t");
}
System.out.println();
}


System.out.println("Sum is "+s);
System.out.println("Sum is "+t);
}}}