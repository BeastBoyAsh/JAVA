import java.util.String;
import java.util.Scanner;

class String15{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String[]y=x.split(" ");
        int i;
        for(i=y.length-1;i>=0;i--)
        {
            System.out.println(y[i]);
        }
       
    }
}