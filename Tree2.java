import java.util.TreeMap;
import java.util.Scanner;

class Tree2{
    public static void main(String[] args){
        int d=0,i;
        Scanner sc=new Scanner(System.in);
        TreeMap<String,Integer> s=new TreeMap<String,Integer>();
        System.out.println("Enter Name & Marks ");
for(i=0;i<5;i++)
{
    s.put(sc.next(),sc.nextInt());
}        
for(String z:s.keySet())
        {
            System.out.println(z+"   "+s.get(z));
            d=d+s.get(z);
        }
        d=d/5;
        System.out.println("Avg marks is "+d);
}
}