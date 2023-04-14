import java.util.HashMap;
import java.util.Scanner;

class Hash4{
    public static void main(String[] args){
        int i,m=0;
        Scanner sc=new Scanner(System.in);
        HashMap<String,String> s=new HashMap<String,String>();
        System.out.println("Enter Phone no. & Name ");
for(i=0;i<3;i++)
{
    s.put(sc.next(),sc.next());
}        

System.out.println("Enter the number ");
String r=sc.next();

        System.out.println(s.get(r));
        
        
}
}