import java.util.TreeMap;
import java.util.Scanner;

class Tree{
    public static void main(String[] args){ 
        Scanner sc=new Scanner(System.in);
        TreeMap<String,Integer> s=new TreeMap<String,Integer>();
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