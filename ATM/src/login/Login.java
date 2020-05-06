package login;
import Atmsumm.Conn;
import javax .swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JFrame frame;
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField jp;
    JButton b1,b2,b3;

    /**
     *
     */
    public  Login(){
     setTitle("BONG ATM");
     l1=new JLabel("WELCOME TO BONG'S ATM");
     l2=new JLabel("CARD NO");
     l3=new JLabel("PIN");
     tf1=new JTextField(15);
     jp=new JPasswordField();
     b1=new JButton("sing in");
     b2=new JButton("clear");
     b3=new JButton("create account");
     setLayout(null);
     l1.setBounds(175,50 ,450 ,200);
     add(l1);
     l2.setBounds(125,150,375 , 200);
     add(l2);

    l3.setBounds(125,225 ,375 ,200);
         add(l3);

    tf1.setBounds(300,235 ,230 ,30);
         add(tf1);

     jp.setBounds(300,310 ,230 ,30);
          add(jp);

     b1.setBounds(300,400 ,100 ,30);
          add(b1);

     b2.setBounds(430,400 ,100 ,30);
          add(b2);

     b3.setBounds(300,450 ,230 ,30);
          add(b3);
b1.addActionListener((ActionListener) this);
b2.addActionListener((ActionListener) this);

b3.addActionListener((ActionListener) this);
setSize(800,800); 
setVisible(true);

          

               
     }
    public void actionPerformed(ActionEvent ae){
    try{
    Conn co =new Conn();
    String a= tf1.getText();
    String b = jp.getText();
    String q= "select * from login where cardno='"+a+"' and pin ='"+b+"'";
    ResultSet rs= co.s.executeQuery(q);
    if (ae.getSource()==b1){
        if(rs.next()){
       new Transcations().setVisible(true);
              setVisible(false);}
        else{
                    JOptionPane.showMessageDialog(null,"problem"+a+";;"+rs);

        }
    }
    else if(ae.getSource()==b2){
        tf1.setText("");
        jp.setText("");
    }
    else if(ae.getSource()==b3){
    new Signup().setVisible(true);
    setVisible(false); 
    }
    }
    catch(Exception e){
    e.printStackTrace();
    }}
    

public static void main(String[] args){
   new Login();}  
}

