class A{
    class B
    {
        void show()
        {
            System.out.println("Hello nested class");
        }
    }
    public static void main(String args[])
    {
        A obj=new A();
        A.B b=obj.new B();
        b.show();
    }
}