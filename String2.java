import java.util.String;
import java.util.Scanner;

class String2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,u=0,l=0,d=0,s=0;
        String x=sc.nextLine();
       for(i=0;i<x.length();i++)
       {
        if(x.charAt(i)>=65 && x.charAt(i)<=90)
        {
            u++;
        }
        else if
        (x.charAt(i)>=97 && x.charAt(i)<=122)
        {
            l++;
        }
        else if
        (x.charAt(i)>=48 && x.charAt(i)<=57)
        {
            d++;
        }
        else 
        s++;
       }

       System.out.println("Upper = "+u);
       System.out.println("Lower = "+l);
       System.out.println("Digits = "+d);
       System.out.println("Special = "+s);
       }

}