import java.io.*;

public class TestStaticNestdClass{

    private static String str="Hello World";
    String str1="bye";

    static class MyNestedClass{
        public void disp(){
            System.out.println(str);
            System.out.println(str1);
        }
    }
    public static void main(String args[])
    {
        TestStaticNestdClass.MyNestedClass obj=new TestStaticNestdClass.MyNestedClas();
        obj.disp();
    }
}