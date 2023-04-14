import java.awt.*;
import java.awt.event.*;

class M16 extends Frame implements ActionListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
    Label l1,l2,l3,l4,l5,l6;
    int t=1,x=0,y=0;

void restart(){
    b1.setLabel("");
    b2.setLabel("");
    b3.setLabel("");
    b4.setLabel("");
    b5.setLabel("");
    b6.setLabel("");
    b7.setLabel("");
    b8.setLabel("");
    b9.setLabel("");
    t=1;  
}
void scorerestart(){
    x=0;
    y=0;
    l4.setText("0");
    l5.setText("0");
}
void steprestart(){
    l1.setText("");
}

M16(){
    setLayout(null);

    b1=new Button("");
    b2=new Button("");
    b3=new Button("");
    b4=new Button("");
    b5=new Button("");
    b6=new Button("");
    b7=new Button("");
    b8=new Button("");
    b9=new Button("");
    b10=new Button("RESET");
    b11=new Button("START");

    l1=new Label(" ");
    l2=new Label("P1:");
    l3=new Label("P2:");
    l4=new Label("");
    l5=new Label("");
    l6=new Label("TIC TAC TOE");
    

    
    
    b1.setBounds(100,50,50,30);
    b2.setBounds(100,100,50,30);
    b3.setBounds(100,150,50,30);
    b4.setBounds(150,50,50,30);
    b5.setBounds(150,100,50,30);
    b6.setBounds(150,150,50,30);
    b7.setBounds(200,50,50,30);
    b8.setBounds(200,100,50,30);
    b9.setBounds(200,150,50,30);
    b10.setBounds(270,250,50,30);
    b11.setBounds(30,250,50,30);
    l1.setBounds(150,200,100,50);
    l2.setBounds(50,80,30,30);
    l3.setBounds(280,80,30,30);
    l4.setBounds(50,100,30,30);
    l5.setBounds(280,100,30,30);
    l6.setBounds(140,20,90,30);
    

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
    add(b11);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(l5);
    add(l6);

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
    b11.addActionListener(this);
}

public static void main(String[] args){
    M16 f= new M16();
    f.setSize(360,300);
    f.setVisible(true);
}
public void actionPerformed(ActionEvent ex){

        if(ex.getSource()==b10){
            restart();
            scorerestart();
            steprestart();
        }
        
        if(ex.getSource()==b11){
            scorerestart();
            l1.setText("New Match.");
            restart();
        }

if(b1.getLabel().length()==0){
        if(ex.getSource()==b1){
        if(t%2==1)
        {
            b1.setLabel("X");
            {
                steprestart();
            }
        }
        else
        {
           b1.setLabel("O");
           {
            steprestart();
           }
        }
    t++;
    }
}
if(b2.getLabel().length()==0){
        if(ex.getSource()==b2){
        if(t%2==1)
        {
            b2.setLabel("X");
            {
                steprestart();
            }
        }
        else
        {
           b2.setLabel("O");
           {
            steprestart();
           }
        }
     t++;
    }
}
if(b3.getLabel().length()==0){
        if(ex.getSource()==b3){
        if(t%2==1)
        {
            b3.setLabel("X");
            {
                steprestart();
            }
        }
        else
        {
           b3.setLabel("O");
           {
            steprestart();
           }
        }
     t++;
    }
}   
if(b4.getLabel().length()==0){
        if(ex.getSource()==b4){
        if(t%2==1)
        {
            b4.setLabel("X");
            {
                steprestart();
            }
        }
        else
        {
           b4.setLabel("O");
           {
            steprestart();
           }
        }
     t++;
    }
}
if(b5.getLabel().length()==0){
        if(ex.getSource()==b5){
        if(t%2==1)
        {
            b5.setLabel("X");
            {
                steprestart();
            }
        }
        else
        {
           b5.setLabel("O");
           {
            steprestart();
           }
        }
     t++;
    }
}
if(b6.getLabel().length()==0){
        if(ex.getSource()==b6){
        if(t%2==1)
        {
            b6.setLabel("X");
            {
                steprestart();
            }
        }
        else
        {
           b6.setLabel("O");
           {
            steprestart();
           }
        }
     t++;
    }
}
if(b7.getLabel().length()==0){
        if(ex.getSource()==b7){
        if(t%2==1)
        {
            b7.setLabel("X");
            {
                steprestart();
            }
        }
        else
        {
           b7.setLabel("O");
           {
            steprestart();
           }
        }
     t++;
    }
}
if(b8.getLabel().length()==0){
        if(ex.getSource()==b8){
        if(t%2==1)
        {
            b8.setLabel("X");
            {
                steprestart();
            }
        }
        else
        {
           b8.setLabel("O");
           {
            steprestart();
           }
        }
     t++;
    }
}
if(b9.getLabel().length()==0){
        if(ex.getSource()==b9){
        if(t%2==1)
        {
            b9.setLabel("X");
            {
                steprestart();
            }
        }
        else
        {
           b9.setLabel("O");
           {
            steprestart();
           }
        }
     t++;
    }
}

    String a=b1.getLabel();
    String b=b2.getLabel();
    String c=b3.getLabel();
    String d=b4.getLabel();
    String e=b5.getLabel();
    String f=b6.getLabel();
    String g=b7.getLabel();
    String h=b8.getLabel();
    String i=b9.getLabel();

if(a.length()!=0 && b.length()!=0 && c.length()!=0) 
{
    if(a.equals(b) && a.equals(c))
    {
        if(a.equals("X"))
        {
            l1.setText("Point for P1.");
            x=x+1;
            l4.setText(x+"");
            {
                if(x==3)
                {
                    l1.setText("P1 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        else
        {
            l1.setText("Point for P2.");
            y=y+1;
            l5.setText(y+"");
            {
                if(y==3)
                {
                    l1.setText("P2 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        restart();
    }
    if(t==10)
    {
        l1.setText("Draw");
        restart();
    }
}

if(d.length()!=0 && e.length()!=0 && f.length()!=0) 
{
    if(d.equals(e) && d.equals(f))
    {
        if(d.equals("X"))
        {
            l1.setText("Point for P1.");
            x=x+1;
            l4.setText(x+"");
            {
                if(x==3)
                {
                    l1.setText("P1 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        else
        {
            l1.setText("Point for P2.");
            y=y+1;
            l5.setText(y+"");
            {
                if(y==3)
                {
                    l1.setText("P2 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        restart();
    }
    if(t==10)
    {
        l1.setText("Draw");
        restart();
    }
}

if(g.length()!=0 && h.length()!=0 && i.length()!=0) 
{
    if(g.equals(h) && g.equals(i))
    {
        if(g.equals("X"))
        {
            l1.setText("Point for P1.");
            x=x+1;
            l4.setText(x+"");
            {
                if(x==3)
                {
                    l1.setText("P1 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        else
        {
            l1.setText("Point for P2.");
            y=y+1;
            l5.setText(y+"");
            {
                if(y==3)
                {
                    l1.setText("P2 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        restart();
    }
    if(t==10)
    {
        l1.setText("Draw");
        restart();
    }
}

if(a.length()!=0 && d.length()!=0 && g.length()!=0) 
{
    if(a.equals(d) && a.equals(g))
    {
        if(a.equals("X"))
        {
            l1.setText("Point for P1.");
            x=x+1;
            l4.setText(x+"");
            {
                if(x==3)
                {
                    l1.setText("P1 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        else
        {
            l1.setText("Point for P2.");
            y=y+1;
            l5.setText(y+"");
            {
                if(y==3)
                {
                    l1.setText("P2 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        restart();
    }
    if(t==10)
    {
        l1.setText("Draw");
        restart();
    }
}

if(b.length()!=0 && e.length()!=0 && h.length()!=0) 
{
    if(b.equals(e) && b.equals(h))
    {
        if(b.equals("X"))
        {
            l1.setText("Point for P1.");
            x=x+1;
            l4.setText(x+"");
            {
                if(x==3)
                {
                    l1.setText("P1 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        else
        {
            l1.setText("Point for P2.");
            y=y+1;
            l5.setText(y+"");
            {
                if(y==3)
                {
                    l1.setText("P2 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        restart();
    }
    if(t==10)
    {
        l1.setText("Draw");
        restart();
    }
}

if(c.length()!=0 && f.length()!=0 && i.length()!=0) 
{
    if(c.equals(f) && c.equals(i))
    {
        if(c.equals("X"))
        {
            l1.setText("Point for P1.");
            x=x+1;
            l4.setText(x+"");
            {
                if(x==3)
                {
                    l1.setText("P1 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        else
        {
            l1.setText("Point for P2.");
            y=y+1;
            l5.setText(y+"");
            {
                if(y==3)
                {
                    l1.setText("P2 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        restart();
    }
    if(t==10)
    {
        l1.setText("Draw");
        restart();
    }
}

if(a.length()!=0 && e.length()!=0 && i.length()!=0) 
{
    if(a.equals(e) && a.equals(i))
    {
        if(a.equals("X"))
        {
            l1.setText("Point for P1.");
            x=x+1;
            l4.setText(x+"");
            {
                if(x==3)
                {
                    l1.setText("P1 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        else
        {
            l1.setText("Point for P2.");
            y=y+1;
            l5.setText(y+"");
            {
                if(y==3)
                {
                    l1.setText("P2 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        restart();
    }
    if(t==10)
    {
        l1.setText("Draw");
        restart();
    }
}

if(c.length()!=0 && e.length()!=0 && g.length()!=0) 
{
    if(c.equals(e) && c.equals(g))
    {
        if(c.equals("X"))
        {
            l1.setText("Point for P1.");
            x=x+1;
            l4.setText(x+"");
            {
                if(x==3)
                {
                    l1.setText("P1 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        else
        {
            l1.setText("Point for P2.");
            y=y+1;
            l5.setText(y+"");
            {
                if(y==3)
                {
                    l1.setText("P2 WON .");
                    restart();
                    scorerestart();
                }
            }
        }
        restart();
    }
    if(t==10)
    {
        l1.setText("Draw");
        restart();
    }
}
}
}