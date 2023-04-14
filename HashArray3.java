import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class HashArray3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,ArrayList<Integer>> h=new HashMap<String,ArrayList<Integer>>();
        ArrayList<Integer>l;
        l=new ArrayList<Integer>();
        l.add(10);
        l.add(2);     
        l.add(3);
        l.add(4);
        h.put("Ayush",l);
      
        l=new ArrayList<Integer>();
        l.add(4);
        l.add(4);     
        l.add(3);
        l.add(1);
        h.put("Ashu",l);

        l=new ArrayList<Integer>();
        l.add(11);
        l.add(2);     
        l.add(6);
        l.add(9);
        h.put("Ayuuu",l);

        System.out.println("Enter the key to be searched and sum");
        String n=sc.next();
        int s=0;
if(h.containsKey(n))
{
        for(String k:h.keySet())
        {
            System.out.println("Key is "+k);
            for(int v:h.get(n))
            {
                System.out.println(v);
                s=s+v;
            }
            System.out.println("Sum is "+s);
        }
    }
    else
    System.out.println("Not found");
    }
}