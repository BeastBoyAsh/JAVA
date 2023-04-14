import java.util.HashMap;
import java.util.Scanner;

class Hash3{
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> s=new HashMap<Integer,String>();
        System.out.println("Enter Marks & Name ");
for(i=0;i<5;i++)
{
    s.put(sc.nextInt(),sc.next());
}        
for(Integer z:s.keySet())
        {
           if(z>m)
           {
            m=z;
           }
        }
        System.out.println("Highest marks is "+m);
        System.out.println("Highest marks is scored by "+s.get(m));
        
}
}