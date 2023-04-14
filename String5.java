import java.util.String;
import java.util.Scanner;

class String5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,c=0;
        String x=sc.nextLine();
        for(i=0;i<x.length();i++)
        {
         if(x.charAt(i)=='a'|| x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u'||x.charAt(i)=='A'||x.charAt(i)=='E'||x.charAt(i)=='I'||x.charAt(i)=='O'||x.charAt(i)=='U')
         {
            c++; 
         }
        }
        System.out.println("Total no. of vowels "+c);
    }
}