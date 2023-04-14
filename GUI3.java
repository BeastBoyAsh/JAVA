import java.awt.*;
class M1 extends Frame{
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
M1(){
    l1=new Label("Rno.");
    l2=new Label("Name");
    l3=new Label("Marks");

    t1=new TextField();
    t2=new TextField();
    t3=new TextField();

    b1=new Button("SAVE");
    b2=new Button("CANCEL");

    GridLayout g=new GridLayout(4,2);
    setLayout(g);
    add(l1);
    add(t1);
    add(l2);
    add(t2);
    add(l3);
    add(t3);
    add(b1);
    add(b2);
}
    public static void main(String[] args){
        M1 f= new M1();
        f.setSize(1000,700);
        f.setVisible(true);
    }
}