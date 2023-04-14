import java.util.String;
import java.util.Scanner;

class String11{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,s=0;
        String z="";
        for(i=0;i<=5;i++)
        {
            s=s+i;
            z=z+i+"+";
        }
        z=z.substring(0,z.length()-1);
        System.out.println(z+"+"+s);
    }
}