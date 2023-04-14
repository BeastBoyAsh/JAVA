import java.util.ArrayList;
import java.util.Scanner;

class ArrayListWhilePositive{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
ArrayList<Integer> l=new ArrayList<Integer>();
System.out.println("Enter numbers ");

while(true){
int a=sc.nextInt();
if(a==-1){
    break;
}
else{
    l.add(a);
}
}

for (int v:l){
    if(v>0)
    {
        System.out.println(v);
    }
}
}
}