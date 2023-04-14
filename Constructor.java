class Constructor{
    static int c;
    Constructor(){
        c=c+1;
    }
    static void display(){
        System.out.println(c);
    }
    public static void main(String[] args){
        Constructor c1= new Constructor();
        Constructor c2= new Constructor();
        Constructor c3= new Constructor();
        Constructor c4= new Constructor();
        display();
    }
}