import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class HashArray6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,ArrayList<String>> h=new HashMap<String,ArrayList<String>>();
        int i,j;
        for(i=1;i<=5;i++)
        {
            ArrayList<String>l=new ArrayList<String>();
            System.out.println("Enter Key ");
            String z=sc.next();
            System.out.println("Enter no. of adjacent ");
            int n=sc.nextInt();
            for(j=1;j<=n;j++){
            System.out.println("Enter Adjacent  ");
            l.add(sc.next());
            }
            h.put(z,l);
        }
        
        for(String k:h.keySet())
        {
            System.out.println("key is "+k);
              
                for(String v:h.get(k))
                {
                    System.out.println(v);
                }
        }
    
    }
}