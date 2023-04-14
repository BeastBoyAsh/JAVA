import java.util.Scanner;
class MatrixTranspose{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

int s=0,i,j;
int[][] a=new int[3][3];

for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.println("Enter numbers ");
a[i][j]=sc.nextInt();
}}


System.out.print("Normal matrix is ");
System.out.println();
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}



System.out.print("Transpose matrix is ");
System.out.println();
for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print(a[j][i]+"\t");
}
System.out.println();

}}}