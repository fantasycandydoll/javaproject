import java.awt.*;
import java.awt.event.*;

class tf extends Frame implements ItemListener,ActionListener
{
 Label l1,l2;
 TextField t;
 Checkbox c1,c2;
 Button b;
 tf()
 {
   super("Temperature Converter");
   setLayout(null);
   setSize(500,400);
   setVisible(true);
   l1=new Label();
   l2=new Label();
   t=new TextField();
   b=new Button("Clear");
   CheckboxGroup cg=new CheckboxGroup();
   c1=new Checkbox("Celsius to Fahrenheit",cg,true);
   c2=new Checkbox("Fahrenheit to Celsius",cg,false);
   l1.setBounds(50,100,200,20);
   add(l1);
   l2.setBounds(200,130,100,20);
   add(l2);
   t.setBounds(260,100,50,20);
   add(t);
   c1.setBounds(50,300,250,20);
   add(c1);
   c2.setBounds(50,330,250,20);
   add(c2);
   b.setBounds(200,250,50,20);
   add(b);
   c1.addItemListener(this);
   c2.addItemListener(this);
   b.addActionListener(this);
   
 }

 public void itemStateChanged(ItemEvent ae)
 {
  float c,f;
  if(c1.getState())
  {
   l1.setText("Enter temperature in Celsius");
   if(t.getText()!=null)
   {
    c=Float.parseFloat(t.getText());
    f=(9/(float)5)*c+32;
    l2.setText(Float.toString(f)+"F");
   }
  }
   if(c2.getState())
   {
    l1.setText("Enter temperature in Fahrenheit");
    if(t.getText()!=null)
    {
     f=Float.parseFloat(t.getText());
     c=5/(float)9*(f-32);
     l2.setText(Float.toString(c)+"C");
    }
   }  
 }


 public void actionPerformed(ActionEvent ae)
 {
  t.setText(null);
  l2.setText(null);
  t.requestFocus();
 }

 public static void main(String[] args)
 {
  tf ob=new tf();
 }
}