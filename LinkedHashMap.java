import java.util.LinkedHashMap;
import java.util.Scanner;

class Linked{
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        LinkedHashMap<String,Integer> s=new LinkedHashMap<String,Integer>();
        s.put("Ayu",40);
        s.put("Ashu",30);
        s.put("Aks",20);
        s.put("Nam",17);
        s.put("Lol",33);

        for(String z:s.keySet())
        {
            System.out.println(z+"   "+s.get(z));
        }
}
}