import java.lang.Math;
import java.util.Scanner;

class Power8{
    public static void main(String[] args){
    int i;
    double  d;
    double s=0.0f;
  
        for(i=1;i<=9;i=i+2){
        d=Math.pow(5,i);
             
            s=s+d;
        
    }
    System.out.println(s);
} 
}