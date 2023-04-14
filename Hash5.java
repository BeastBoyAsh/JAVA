import java.util.HashMap;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class Hash5{
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> s=new HashMap<String,Integer>();
        System.out.println("Enter Name & Marks ");
for(i=0;i<3;i++)
{
    s.put(sc.next(),sc.nextInt());
}        

System.out.println("Enter the name ");
String r=sc.next();
if(s.containsKey(r))
        System.out.println(s.get(r)); 
        else 
        System.out.println("Not found");     
    }
}