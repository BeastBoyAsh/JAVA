import java.util.String;
import java.util.Scanner;

class String6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        String x=sc.nextLine();
        for(i=0;i<x.length();i++)
        {
            int j;
            for(j=i;j>=i-1;j++)
            {
                System.out.println(x.charAt(i));
            }
        }
    }
}