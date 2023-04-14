class NestedException{
    public static void main(String[] args){
    public void show(){
 int[] a=new int[5];
        int x=4,b=0;

try {
    try {
        System.out.println(x/b);
    } catch (ArithmeticException ex) {
        System.out.println("Divide by 0 can't happen ");
    }
    System.out.println(a[7]);
} catch (ArrayIndexOutOfBoundsException ex) {
    System.out.println("Incorrect ");
}
 }
    }}