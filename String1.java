import java.util.String;
import java.util.Scanner;

class String1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i;
        String x=sc.nextLine();
       for(i=0;i<x.length();i++)
       {
        System.out.println(x.charAt(i));
       }
       }

}