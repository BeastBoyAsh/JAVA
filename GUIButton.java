import java.awt.*;
class M extends Frame{
    Button b1,b2;

M(){
    b1=new Button("OK");
    b2=new Button("CANCEL");
    GridLayout g=new GridLayout(1,2);
    setLayout(g);
    add(b1);
    add(b2);
}
    public static void main(String[] args){
        M f= new M();
        f.setSize(1000,300);
        f.setVisible(true);
    }
}