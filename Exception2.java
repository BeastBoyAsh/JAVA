class Exception2{
    public static void main(String[] args){
int[] x=new int[5];

try{
    System.out.println(x[7]);
}
catch(ArrayIndexOutOfBoundsException ex){
    System.out.println("Error ");
}
    }
}