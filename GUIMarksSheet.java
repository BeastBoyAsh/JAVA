import java.awt.*;
import java.awt.event.*;

class M17 extends Frame implements ActionListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,bnext,bprev,bans;
    Label l1;
    CheckboxGroup cbg;
    Checkbox c1,c2,c3,c4;
    int index;

    String[]a={"Q1. PM of India ? ","Q2. Inventor of JAVA ","Q3. 2 + 4 = ? "};
    String[]OP1={"Kejriwal ?","James Goshy ","88 "};
    String[]OP2={"Rahul Gandhi ?","Sonu ","6 " };
    String[]OP3={"Narendra Modi ","Monu ","8 "};
    String[]OP4={"Shaktimaan ","Chintu ","3 "};
    int[]ans={3,1,2};

M17(){
    setLayout(null);

    b1=new Button("Q1.");
    b2=new Button("Q2.");
    b3=new Button("Q3.");
    b4=new Button("Q4.");
    b5=new Button("Q5.");
    b6=new Button("Q6.");
    b7=new Button("Q7.");
    b8=new Button("Q8.");
    b9=new Button("Q9.");
    b10=new Button("Q10.");

    bnext=new Button("NEXT");
    bprev=new Button("PEVIOUS");
    bans=new Button("ANS");

    l1=new Label("");

    cbg=new CheckboxGroup();
    c1=new Checkbox("",cbg,true);
    c2=new Checkbox("",cbg,false);
    c3=new Checkbox("",cbg,false);
    c4=new Checkbox("",cbg,false);

    b1.setBounds(50,50,30,30);
    b2.setBounds(100,50,30,30);
    b3.setBounds(150,50,30,30);
    b4.setBounds(200,50,30,30);
    b5.setBounds(250,50,30,30);
    b6.setBounds(50,100,30,30);
    b7.setBounds(100,100,30,30);
    b8.setBounds(150,100,30,30);
    b9.setBounds(200,100,30,30);
    b10.setBounds(250,100,30,30);

    l1.setBounds(100,150,150,40);

    c1.setBounds(70,200,100,30);
    c2.setBounds(200,200,100,30);
    c3.setBounds(70,250,100,30);
    c4.setBounds(200,250,100,30);

    bnext.setBounds(50,300,60,30);
    bprev.setBounds(150,300,60,30);
    bans.setBounds(250,300,60,30);


    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
    add(b10);

    add(l1);

    add(c1);
    add(c2);
    add(c3);
    add(c4);

    add(bnext);
    add(bprev);
    add(bans);

    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    bnext.addActionListener(this);
    bprev.addActionListener(this);
    bans.addActionListener(this);
}

    public static void main(String[] args){
        M17 f= new M17();
        f.setSize(350,450);
        f.setVisible(true);
    }
public void actionPerformed(ActionEvent ex){
        if(ex.getSource()==b1){
            index=0;
            l1.setText(a[0]);
            c1.setLabel(OP1[0]);
            c2.setLabel(OP2[0]);
            c3.setLabel(OP3[0]);
            c4.setLabel(OP4[0]);
        }
        if(ex.getSource()==b2){
            index=1;
            l1.setText(a[1]);
            c1.setLabel(OP1[1]);
            c2.setLabel(OP2[1]);
            c3.setLabel(OP3[1]);
            c4.setLabel(OP4[1]);
        }
        if(ex.getSource()==b3){
            index=2;
            l1.setText(a[2]);
            c1.setLabel(OP1[2]);
            c2.setLabel(OP2[2]);
            c3.setLabel(OP3[2]);
            c4.setLabel(OP4[2]);
        }
        if(ex.getSource()==b4){
            index=3;
            l1.setText(a[3]);
            c1.setLabel(OP1[3]);
            c2.setLabel(OP2[3]);
            c3.setLabel(OP3[3]);
            c4.setLabel(OP4[3]);
        }
        if(ex.getSource()==bnext){
            index=index+1;
            l1.setText(a[index]);
            c1.setLabel(OP1[index]);
            c2.setLabel(OP2[index]);
            c3.setLabel(OP3[index]);
            c4.setLabel(OP4[index]);
        }
        if(ex.getSource()==bprev){
            index=index-1;
            if(index<0){
            index=1;
            }
            else{
            l1.setText(a[index]);
            c1.setLabel(OP1[index]);
            c2.setLabel(OP2[index]);
            c3.setLabel(OP3[index]);
            c4.setLabel(OP4[index]);
            }
        }

    }
}
    
