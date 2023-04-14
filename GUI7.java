import java.awt.*;
class M5 extends Frame{

    Label l1,l2,l3,l4,l5;
    Button b1,b2;
    CheckboxGroup cbg,cbg2;
    Checkbox c1,c2,c3,c4,c5;
    TextField t1,t2,t3;
M5(){
    setLayout(null);

    l1=new Label("Rno.");
    l2=new Label("Name");
    l3=new Label("Address");
    l4=new Label("Gender");
    l5=new Label("Course");


    b1=new Button("OK");
    b2=new Button("CANCEL");

    
    t1=new TextField();
    t2=new TextField();
    t3=new TextField();

   
    l1.setBounds(50,30,40,30);
    t1.setBounds(100,30,80,30);

    l2.setBounds(200,30,40,30);
    t2.setBounds(250,30,80,30);

    l3.setBounds(60,80,50,30);
    t3.setBounds(120,80,150,60);

    l4.setBounds(50,150,40,30);
    cbg=new CheckboxGroup();
    c1=new Checkbox("Male",cbg,true);
    c2=new Checkbox("Female",cbg,false);
    c1.setBounds(120,150,40,30);
    c2.setBounds(160,150,60,30);

    l5.setBounds(50,170,40,30);
    cbg2=new CheckboxGroup();
    c3=new Checkbox("C",cbg2,true);
    c4=new Checkbox("C+",cbg2,false);
    c5=new Checkbox("JAVA",cbg2,false);
    c3.setBounds(120,170,40,30);
    c4.setBounds(160,170,40,30);
    c5.setBounds(200,170,40,30);

    b1.setBounds(300,200,50,20);
    b2.setBounds(300,220,50,20);
    
    

    add(b1);
    add(b2);

    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(l5);
    
    add(t1);
    add(t2);
    add(t3);

    add(c1);
    add(c2);
    add(c3);
    add(c4);
    add(c5);

}
    public static void main(String[] args){
        M5 f= new M5();
        f.setSize(400,300);
        f.setVisible(true);
    }
}