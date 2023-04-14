class Constructor3{

    Constructor3(){
        System.out.println("Default constructor");
    }
    Constructor3(int a){
        System.out.println("int a= "+a);
    }
    Constructor3(int a,int b){
        System.out.println(a+"= 2 int ="+b);
    }
    Constructor3(float a){
        System.out.println("1 float= "+a);
    }
    public static void main(String[] args){
        Constructor3 c1= new Constructor3();
        Constructor3 c2= new Constructor3(2);
        Constructor3 c3= new Constructor3(4,6);
        Constructor3 c4= new Constructor3(34.22f);
    }
}