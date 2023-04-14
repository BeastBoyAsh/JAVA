import java.lang.Math;

class Power3{

    public static void main(String[] args){
    int i;
    double d;
    for(i=1;i<=5;i++){
        d=Math.pow(i,6-i);
        System.out.println(d);
    }
} 
}