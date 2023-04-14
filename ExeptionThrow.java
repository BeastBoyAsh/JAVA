class ExeptionThrow{
    public void show(){
        throw new ArithmeticException();
    }
    public static void main(String[] args) {
        ExeptionThrow m=new ExeptionThrow();
        m.show();
    }
   }