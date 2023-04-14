import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class HashArray7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,ArrayList<String>> h=new HashMap<String,ArrayList<String>>();
    
            ArrayList<String>l;

            l=new ArrayList<String>();
            l.add("B");
            l.add("C");     
            h.put("A",l);

            l=new ArrayList<String>();
            l.add("C");     
            h.put("B",l);

            
            l=new ArrayList<String>();
            l.add("D");     
            h.put("C",l);

            l=new ArrayList<String>();
            l.add("B");  
            l.add("C");    
            h.put("D",l);

            l=new ArrayList<String>();
            l.add("A");  
            l.add("D");    
            h.put("E",l);


            System.out.println("Enter vertex ");
            String p=sc.next();
            if(h.containsKey(p))
            {
                for(String v:h.get(p))
                    {
                        System.out.println(v);
                    }
            }
else
{
    System.out.println("Invalid ");
}

          

        }
    }