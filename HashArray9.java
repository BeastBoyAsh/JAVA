import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

class HashArray9{
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


int c=0;
if(h.containsKey(p))
       {
        for(String k:h.keySet())
            {
                for(String v:h.get(k))
                  {
                          if(v==p)
                          {
                              c=c+1;
                          }
                  }
            }
            System.out.println("Indegree is "+c);
        }
            else
                {
                    System.out.println("Invalid ");
                }
        }
}