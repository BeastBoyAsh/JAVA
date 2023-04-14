class  Parent{
    void show()
    {
        System.out.ptinyln("Parents show()");
    }
}

class Child extends Parent{
    @Override
    void show()
    {
        System.out.println("Childs show()");
    }
}
class Main{
    public static void main(String args[]) {
        Parent obj1=new Parent();
        obj1.show();
        
    }
}