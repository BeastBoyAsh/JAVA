import java.util.HashSet;
import java.util.Scanner;

class HashSett2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> s=new HashSet<Integer>();
       int i,x[]=new int[6];
       for(i=0;i<x.length;i++)
       {
        s.add(x[i]=sc.nextInt());
       }
for(int v:s)
{
    System.out.println(v);
}

}
}