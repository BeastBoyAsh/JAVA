import java.util.ArrayList;
import java.util.Scanner;

class ArrayListWhileFirstDigitSum{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
ArrayList<Integer> l=new ArrayList<Integer>();
System.out.println("Enter numbers ");
int s=0,b=0;
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
    while(v!=0)
        {
           b=v%10;
           v=v/10;
        }
        s=s+b;
}
System.out.println("The sum of first digit is "+s);
}
}