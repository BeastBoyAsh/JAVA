import java.util.ArrayList;
import java.util.Scanner;

class ArrayListWhilePrime{
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
    int i,c=0;
    for(i=1;i<=v/2;i++)
    {
        if(v%i==0){
            c=c+1;
        }
    }
    if(c==1)
    {
        System.out.println("Prime numbers are "+v);
    }
}
}
}