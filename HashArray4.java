import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class HashArray4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,ArrayList<Long>> h=new HashMap<String,ArrayList<Long>>();
        int i,j;
        for(i=1;i<=2;i++)
        {
            ArrayList<Long>l=new ArrayList<Long>();
            System.out.println("Enter Name ");
            String z=sc.next();
            System.out.println("Enter No. of mobile no. ");
            int n=sc.nextInt();
            for(j=1;j<=n;j++){
            System.out.println("Enter mobile no. ");
            l.add(sc.nextLong());
            }
            h.put(z,l);
        }
        
        for(String k:h.keySet())
        {
            System.out.println("key is "+k);
              
                for(long v:h.get(k))
                {
                    System.out.println(v);
                }
        }
    
    }
}