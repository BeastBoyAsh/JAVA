import java.util.ArrayList;
import java.util.Scanner;

class ArrayListMin{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
ArrayList<Integer> l=new ArrayList<Integer>();
System.out.println("Enter 3 numbers ");
int i,s;
for(i=0;i<=2;i++){
l.add(sc.nextInt());
}
s=l.get(0);
for (int v:l){
  if(s>v)
  {
    s=v;
  }
}
System.out.println("The min is "+s);
}
}