import java.util.Scanner;
class Matrix{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

int s=0,i,j;
int[][] a=new int[3][2];

for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.println("Enter numbers ");
a[i][j]=sc.nextInt();
}}

for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
s=s+a[i][j];
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("Sum is "+s);
}}