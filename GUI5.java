import java.awt.*;
class M3 extends Frame{
    CheckboxGroup cbg;
    Checkbox c1,c2;
    Button b1;
M3(){
    cbg=new CheckboxGroup();
    c1=new Checkbox("Male",cbg,true);
    c2=new Checkbox("Female",cbg,true);

    b1=new Button("OK");
  
    add(c1);
    add(c2);
    add(b1);

    GridLayout g=new GridLayout(3,1);
    setLayout(g);

}
    public static void main(String[] args){
        M3 f= new M3();
        f.setSize(300,190);
        f.setVisible(true);
    }
}