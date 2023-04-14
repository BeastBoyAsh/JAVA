import java.awt.*;
class M2 extends Frame{
    Label l1,l2,l3;
    Choice c1,c2,c3;
    Button b1,b2;
M2(){
    l1=new Label("Branch");
    l2=new Label("Sem");
    l3=new Label("Marks");

    c1=new Choice();
    c1.add("IT");
    c1.add("CSE");
    c1.add("EE");
    c1.add("CIVIl");
    c1.add("MECH.");
    c1.add("EEE");

    c2=new Choice();
    int i;
    for(i=1;i<=8;i++)
    {
        c2.add(i+ "SEMESTER");
    }

    c3=new Choice();
    int j;
    for(j=1;j<=100;j++)
    {
        c3.add(j+ "MARKS");
    }
  

    b1=new Button("OK");
    b2=new Button("CANCEL");

    GridLayout g=new GridLayout(4,2);
    setLayout(g);
    add(l1);
    add(c1);
    add(l2);
    add(c2);
    add(l3);
    add(c3);
    add(b1);
    add(b2);
}
    public static void main(String[] args){
        M2 f= new M2();
        f.setSize(1000,700);
        f.setVisible(true);
    }
}