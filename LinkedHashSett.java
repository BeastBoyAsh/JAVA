import java.util.LinkedHashSet;
import java.util.Scanner;

class linkedHashSett{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedHashSet<Integer> s=new LinkedHashSet<Integer>();
        s.add(2);
        s.add(3);
        s.add(6);
        s.add(1);
        s.add(8);
        s.add(7);
        s.add(2);
        s.add(3);
for(int v:s)
{
    System.out.println(v);
}

}
}