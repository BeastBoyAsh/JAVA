import java.awt.*;
import java.awt.event.*;

class M18v2 extends Frame implements ActionListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Button badd,bsub,bmul,bdiv,bdec,bper,bint,cal,back,clear;
    TextField t1;
    double xd;
    double num1,num2,check;

M18v2(){
    setLayout(null);

    b1=new Button("7");
    b2=new Button("8");
    b3=new Button("9");
    b4=new Button("4");
    b5=new Button("5");
    b6=new Button("6");
    b7=new Button("1");
    b8=new Button("2");
    b9=new Button("3");
    b10=new Button("0");

    badd=new Button("+");
    bsub=new Button("-");
    bmul=new Button("*");
    bdiv=new Button("/");
    bdec=new Button(".");
    bint=new Button("+/-");
    bper=new Button("%");
    back=new Button("BACK");
    clear=new Button("C");
    cal=new Button("=");

    t1=new TextField();

    t1.setBounds(50,50,200,50);

    clear.setBounds(50,100,50,50);
    back.setBounds(100,100,50,50);
    bper.setBounds(150,100,50,50);
    bdiv.setBounds(200,100,50,50);

    b1.setBounds(50,150,50,50);
    b2.setBounds(100,150,50,50);
    b3.setBounds(150,150,50,50);
    bmul.setBounds(200,150,50,50);
    

    b4.setBounds(50,200,50,50);
    b5.setBounds(100,200,50,50);
    b6.setBounds(150,200,50,50);
    bsub.setBounds(200,200,50,50);

    b7.setBounds(50,250,50,50);
    b8.setBounds(100,250,50,50);
    b9.setBounds(150,250,50,50);
    badd.setBounds(200,250,50,50);

    bint.setBounds(50,300,50,50);
    b10.setBounds(100,300,50,50);
    bdec.setBounds(150,300,50,50);
    cal.setBounds(200,300,50,50);


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

    add(t1);

    add(badd);
    add(bsub);
    add(bmul);
    add(bdiv);
    add(bdec);
    add(bint);
    add(cal);
    add(bper);
    add(back);
    add(clear);

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
    badd.addActionListener(this);
    bsub.addActionListener(this);
    bmul.addActionListener(this);
    bdiv.addActionListener(this);
    bdec.addActionListener(this);
    bint.addActionListener(this);
    clear.addActionListener(this);
    bper.addActionListener(this);
    back.addActionListener(this);

}

    public static void main(String[] args){
        M18v2 f= new M18v2();
        f.setSize(310,370);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ex){
        String a,b;

        if(ex.getSource()==b1){
            b=t1.getText();
            a=b+"7";
            t1.setText(a);
        }
        if(ex.getSource()==b2){
            b=t1.getText();
            a=b+"8";
            t1.setText(a);
        }
        if(ex.getSource()==b3){
            b=t1.getText();
            a=b+"9";
            t1.setText(a);
        }
        if(ex.getSource()==b4){
            b=t1.getText();
            a=b+"4";
            t1.setText(a);
        }
        if(ex.getSource()==b5){
            b=t1.getText();
            a=b+"5";
            t1.setText(a);
        }
        if(ex.getSource()==b6){
            b=t1.getText();
            a=b+"6";
            t1.setText(a);
        }
        if(ex.getSource()==b7){
            b=t1.getText();
            a=b+"1";
            t1.setText(a);
        }
        if(ex.getSource()==b8){
            b=t1.getText();
            a=b+"2";
            t1.setText(a);
        }
        if(ex.getSource()==b9){
            b=t1.getText();
            a=b+"3";
            t1.setText(a);
        }
        if(ex.getSource()==b10){
            b=t1.getText();
            a=b+"0";
            t1.setText(a);
        }
        if(ex.getSource()==bdec){
            b=t1.getText();
            a=b+".";
            t1.setText(a);
        }
        if(ex.getSource()==bint){
            b=t1.getText();
            a="-"+b;
            t1.setText(a);
        }
        if(ex.getSource()==back){
            b=t1.getText();
            try{
                a=b.substring(0, b.length()-1);
                }catch(StringIndexOutOfBoundsException f){return;}
              t1.setText(a);
        }

        if(ex.getSource()==badd){                     
            try{
              num1=Double.parseDouble(t1.getText());
              }catch(NumberFormatException f){
                t1.setText("Invalid Format");
                return;
              }
            a="";
            t1.setText(a);
            check=1;
          }
          if(ex.getSource()==bsub){                    
            try{
              num1=Double.parseDouble(t1.getText());
              }catch(NumberFormatException f){
                t1.setText("Invalid Format");
                return;
              }
            a="";
            t1.setText(a);
            check=2;
          }
          if(ex.getSource()==bmul){                    
            try{
              num1=Double.parseDouble(t1.getText());
              }catch(NumberFormatException f){
                t1.setText("Invalid Format");
                return;
              }
            a="";
            t1.setText(a);
            check=3;
          }
          if(ex.getSource()==bdiv){                  
            try{
              num1=Double.parseDouble(t1.getText());
              }catch(NumberFormatException f){
                t1.setText("Invalid Format");
                return;
              }
            a="";
            t1.setText(a);
            check=4;
          }
          if(ex.getSource()==bper){                     
            try{
              num1=Double.parseDouble(t1.getText());
              }catch(NumberFormatException f){
                t1.setText("Invalid Format");
                return;
              }
            a="";
            t1.setText(a);
            check=5;
          }
          if(ex.getSource()==cal){          
            try{
              num2=Double.parseDouble(t1.getText());
              }catch(NumberFormatException f){
                t1.setText("ENTER NUMBER FIRST ");
                return;
              }
              
            if(check==1)
              xd =num1+num2;
            if(check==2)
              xd =num1-num2;
            if(check==3)
              xd =num1*num2;
            if(check==4)
              xd =num1/num2; 
            if(check==5)
              xd =num1%num2;    
            t1.setText(String.valueOf(xd));
          }
          if(ex.getSource()==clear){
            num1=0;
            num2=0;
            check=0;
            xd=0;
            a="";
            t1.setText(a);
            }
    }
}