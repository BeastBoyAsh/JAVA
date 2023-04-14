import java.util.Scanner;

class PerfectNumber
{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number - " );
    int a=sc.nextInt();
    System.out.println("A is "+a);
    int i,s=0;
    for(i=1;i<=a/2;i++){
        if(a%i==0){
            s=s+i;
        }
    }
    if(s==a){
    System.out.println("This is a perfect number "+a);
    }
    else
    System.out.println("This is a imperfect number "+a);
} 
}