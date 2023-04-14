import java.util.String;
import java.util.Scanner;

class String9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        String y="";
        int i;
     for(i=0;i<x.length();i++){
        char c=x.charAt(i);
        if(y.indexOf(c)==-1)
        {
            y=y+c;
        }
     }
     System.out.println(y);
    }
}