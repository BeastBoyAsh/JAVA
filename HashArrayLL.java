import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class HashArrayLL{
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

        for(String k:h.keySet())
        {
            System.out.println("Key is "+k);
            for(int v:h.get(k))
            {
                System.out.println(v);
            }

        }


    }
}