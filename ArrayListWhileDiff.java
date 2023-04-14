import java.util.ArrayList;
import java.util.Scanner;

class ArrayListWhileDiff{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
ArrayList<Integer> l=new ArrayList<Integer>();
System.out.println("Enter numbers ");
while(true){
int a=sc.nextInt();
if(a==-0){
    break;
}
if(a<0){
    l.add(0,a);
}
else
{
    l.add(a);
}
}

for (int v:l){
        System.out.println(v);
    }
  }
}