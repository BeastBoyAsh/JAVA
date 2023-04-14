import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

class ArrayList{
public static void main(String[] args){
ArrayList l=new ArrayList();
l.add(1);
l.add("Ayush");
l.add(82.3);
l.add(2,"Singh");
for (Object v:l){
    System.out.println(v);
}
}
}