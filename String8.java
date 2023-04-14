import java.util.String;
import java.util.Scanner;

class String8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String x="Ayush Singh IT 4th Semester BITD";
        String y=sc.next();
      if(x.indexOf(y)==-1)
      {
        System.out.println("NO");
      }
      else
      {
        System.out.println("YES");
      }
    }
}