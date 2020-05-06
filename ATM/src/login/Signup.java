/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import Atmsumm.Conn;
import javax .swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

public class Signup extends JFrame implements ActionListener
{
    JFrame frame;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
    JTextField t1,t2,t3,t4,t5,t6,t7;
 JRadioButton r1,r2,r3,r4,r5;
    JButton b1;
    JComboBox c1,c2,c3;
 Random ran = new Random();
  long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);
 
   
    public  Signup(){
        setTitle("BONGS SIGN UP 1");
     
     l1=new JLabel("APP FORM :"+first);
     l1.setFont(new Font("Raleway", Font.BOLD, 38));
     l2=new JLabel("PAGE 1");
     l3=new JLabel("NAME");
     l4=new JLabel("FATHER NAME");
     l5=new JLabel("DOB");
     l6=new JLabel("GENDER");
      l7=new JLabel("EMAIL");
     l8=new JLabel("MARITAL STATUS");
     l9=new JLabel("ADDRESS");
     l10=new JLabel("CITY");
     l11=new JLabel("PIN CODE");
     l12=new JLabel("STATE");
     l13 = new JLabel("Date");
       l14 = new JLabel("Month");
         l15 = new JLabel("Year");
     
     t1=new JTextField(15);
     t2=new JTextField(15);
     t3=new JTextField(15);
     t4=new JTextField(15);
     t5=new JTextField(15);
     t6=new JTextField(15);
     t7=new JTextField(15);
     
     r1 = new JRadioButton("MALE");
     r2 = new JRadioButton("FEMALE");
     r3 = new JRadioButton("MARID");
     r4 = new JRadioButton("UNMARID");
     r5 = new JRadioButton("OTHER");
     
     
       String date[] = {"1","2","3","4","5","6","7","8","9"};
        c1 = new JComboBox(date);
        
        
        String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        c2 = new JComboBox(month);
        
        
        String year[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
        c3 = new JComboBox(year);
        
        
     b1=new JButton("NEXT");
    
             setLayout(null);
        l1.setBounds(140,20,600,40);
        add(l1);
        
        l2.setBounds(290,70,600,30);
        add(l2);
        
        l3.setBounds(100,140,100,30);
        add(l3);
        
        t1.setBounds(300,140,400,30);
        add(t1);
        
        l4.setBounds(100,190,200,30);
        add(l4);
        
        t2.setBounds(300,190,400,30);
        add(t2);
        
        l5.setBounds(100,240,200,30);
        add(l5);
        
        l13.setBounds(300,240,40,30);
        add(l13);
        
        c1.setBounds(340,240,60,30);
        add(c1);
        
        l14.setBounds(410,240,50,30);
        add(l14);
        
        c2.setBounds(460,240,100,30);
        add(c2);
        
        l15.setBounds(570,240,40,30);
        add(l15);
        
        c3.setBounds(610,240,90,30);
        add(c3);
        
        l6.setBounds(100,290,200,30);
        add(l6);
        
        r1.setBounds(300,290,60,30);
        add(r1);
        
        r2.setBounds(450,290,90,30);
        add(r2);
        
        l7.setBounds(100,340,200,30);
        add(l7);
        
        t3.setBounds(300,340,400,30);
        add(t3);
        
        l8.setBounds(100,390,200,30);
        add(l8);
        
        r3.setBounds(300,390,100,30);
        add(r3);
        
        r4.setBounds(450,390,100,30);
        add(r4);
        
        r5.setBounds(635,390,100,30);
        add(r5);
        
        
        
        l9.setBounds(100,440,200,30);
        add(l9);
        
        t4.setBounds(300,440,400,30);
        add(t4);
        
        l10.setBounds(100,490,200,30);
        add(l10);
        
        t5.setBounds(300,490,400,30);
        add(t5);
        
        l11.setBounds(100,540,200,30);
        add(l11);
        
        t6.setBounds(300,540,400,30);
        add(t6);
        
        l12.setBounds(100,590,200,30);
        add(l12);
        
        t7.setBounds(300,590,400,30);
        add(t7);
        
        b1.setBounds(620,660,80,30);
        add(b1);
        b1.addActionListener((ActionListener) this);
          setSize(850,850);
        setLocation(500,90);
        setVisible(true);
         
    }
public void actionPerformed(ActionEvent ae){
  String a = t1.getText();
        String b = t2.getText();
        
        String ac = (String)c1.getSelectedItem(); 
        String bc = (String)c2.getSelectedItem();
        String cc = (String)c3.getSelectedItem();
        
        String d = null;
        if(r1.isSelected()){ 
            d = "Male";
        }
        else if(r2.isSelected()){ 
            d = "Female";
        }
            
        String e = t3.getText();
        String f = null;
        if(r3.isSelected()){ 
            f = "Married";
        }else if(r4.isSelected()){ 
            f = "Unmarried";
        }else if(r5.isSelected()){ 
            f = "Other";
        }
           
        String g = t4.getText();
        String h = t5.getText();
        String i = t6.getText();
        String j = t7.getText();
        
  try{
           
            if(t6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                
                Conn c2 = new Conn();
                String q1 = "insert into signup values('"+a+"','"+b+"','"+ac+"','"+bc+"','"+cc+"','"+d+"','"+e+"','"+f+"','"+g+"','"+h+"','"+i+"','"+j+"','"+first+"')";
               String q2 ="commit";
                c2.s.executeUpdate(q1);
                c2.s.executeUpdate(q2);
                
                
                new Signup2().setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
}
    public static void main(String[] args){
        new Signup().setVisible(true);
    }
}
