import java.awt.*;
class M4 extends Frame{

    Button b1,b2,b3,b4,b5;
M4(){


    
    setLayout(null);

    b1=new Button("B1");
    b2=new Button("B2");
    b3=new Button("B3");
    b4=new Button("B4");
    b5=new Button("B5");
    b1.setBounds(100,70,80,30);
    b2.setBounds(200,70,80,30);
    b3.setBounds(300,70,80,30);
    b4.setBounds(150,140,80,30);
    b5.setBounds(250,140,80,30);

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);

    

}
    public static void main(String[] args){
        M4 f= new M4();
        f.setSize(500,300);
        f.setVisible(true);
    }
}