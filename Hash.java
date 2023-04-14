import java.util.HashMap;
import java.util.Scanner;

class Hash{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> s=new HashMap<String,Integer>();
        s.put("Ayu",40);
        s.put("Ashu",30);
        s.put("Aks",20);
        System.out.println(s.get("Aks"));

        
        for(String z:s.keySet())
        {
            System.out.println(z+"   "+s.get(z));
        }
}
}