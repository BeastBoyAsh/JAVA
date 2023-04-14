import java.util.ArrayList;
import java.util.Scanner;

class ArrayListAdd{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
ArrayList<Integer> l=new ArrayList<Integer>();
System.out.println("Enter 5 numbers ");
int i,s=0;
for(i=0;i<=5;i++){
l.add(sc.nextInt());
}
for (int v:l){
   s=s+v;
}
System.out.println(s);
}
}