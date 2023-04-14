import java.util.HashMap;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class HashArrayLLs{
    public static void main(String[] args){
        int i;
        Scanner sc=new Scanner(System.in);
        HashMap<String,ArrayList<Integer>> h=new HashMap<String,ArrayList<Integer>>();
        ArrayList<Integer>l;
        l=new ArrayList<Integer>();
        l.add(10);
        l.add(2);     
        l.add(3);
        l.add(4);
        h.put("Ayush");
      
        l=new ArrayList<Integer>();
        l.add(4);
        l.add(4);     
        l.add(3);
        l.add(1);
        h.put("Ashu");

        l=new ArrayList<Integer>();
        l.add(11);
        l.add(2);     
        l.add(6);
        l.add(9);
        h.put("Ayuuu");

        for(String k:h.keySet())
        {
            System.out.println("Key is "+k);
            for(int v:h.get(k))
            {
                system.out.println(v);
            }

        }


    }
}