import java.util.String;
import java.util.Scanner;

class String3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        String x=sc.nextLine();
        String y="";
       for(i=x.length()-1;i>=0;i--)
       {
        y=y+x.charAt(i);
       }
       System.out.println(y);
       }

}