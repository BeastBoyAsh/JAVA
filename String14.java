import java.util.String;
import java.util.Scanner;

class String14{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String x=sc.next();
        String[]y=x.split(",");
        int i,s=0;
        for(i=0;i<y.length;i++)
        {
            s=s+Integer.parseInt(y[i]);
        }
        System.out.println(s);
    }
}