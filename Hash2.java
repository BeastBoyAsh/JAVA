import java.util.HashMap;
import java.util.Scanner;

class Hash2{
    public static void main(String[] args){
        int d=0,i;
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> s=new HashMap<String,Integer>();
        System.out.println("Enter Name & Marks ");
for(i=0;i<5;i++)
{
    s.put(sc.next(),sc.nextInt());
}        
for(String z:s.keySet())
        {
            d=d+s.get(z);
        }
        d=d/5;
        System.out.println("Avg marks is "+d);
}
}