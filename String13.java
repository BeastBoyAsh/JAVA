import java.util.String;
import java.util.Scanner;

class String13{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String x="A,B,CDE,FG";
        int i;
        String[]y=x.split(",");
        for(i=0;i<=y.length;i++)
        {
            System.out.println(y[i]);
        }
    }
}