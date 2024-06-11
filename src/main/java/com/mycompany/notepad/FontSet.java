/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notepad;

/**
 *
 * @author TANISHQ
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FontSet extends JFrame implements ItemListener,ActionListener,AdjustmentListener,WindowListener
{
    JLabel text1;
    JCheckBox bold,italic;
    JComboBox size,color,font;
    JButton changetext,reset,apply,exit;
    JScrollBar chgsize;
    Color fgc,bgc;
    public FontSet(Color fgc,Color bgc)
    {
        this.bgc=bgc;
        this.fgc=fgc;
        setSize(400,550);
        setTitle("FONT");
        text1=new JLabel("Abc",JLabel.CENTER);
        text1.setFont(new Font("Serif",Font.PLAIN,15));
        //text.setBackground(Color.red);
        text1.setOpaque(true);
        text1.setBounds(40,20,300,120);
        
        bold=new JCheckBox("BOLD");
        bold.setBounds(30,150,80,30);
        
        italic=new JCheckBox("ITALIC");
        italic.setBounds(30,200,80,30);
        
        size=new JComboBox();
        size.setBounds(230,150,80,30);
        size.setEditable(true);
        size.addItem("Size");
        size.addItem("8");
        size.addItem("9");
        size.addItem("10");
        size.addItem("11");
        size.addItem("12");
        size.addItem("14");
        size.addItem("16");
        size.addItem("18");
        size.addItem("20");
        size.addItem("22");
        size.addItem("24");
        size.addItem("26");
        size.addItem("28");
        size.addItem("36");
        size.addItem("48");
        size.addItem("72");
        size.addItem("85");
        size.addItem("100");
        
        chgsize=new JScrollBar(JScrollBar.HORIZONTAL,15,2,6,150);
        chgsize.setBounds(220,190,100,20);
        
        
        font=new JComboBox();
        font.setEditable(false);
        font.setBounds(230,240,80,30);
        font.addItem("Font");
        font.addItem("DialogInput");
        font.addItem("Serif");
        font.addItem("SansSerif");
        font.addItem("Monospaced");
        font.addItem("Dialog");
        
        
        
        color=new JComboBox();
        color.setBounds(40,240,80,30);
        //color.setEditable(false);
        color.addItem("Color");
        color.addItem("Blue");
        color.addItem("Cyan");
        color.addItem("Dark Gray");
        color.addItem("Gray");
        color.addItem("Green");
        color.addItem("Light Gray");
        color.addItem("Magenta");
        color.addItem("Orange");
        color.addItem("Pink");
        color.addItem("Red");
        color.addItem("White");
        color.addItem("Yellow");
        color.addItem("Black");
        
        changetext=new JButton("CHANGE TEXT");
        changetext.setFont(new Font("Dialog",Font.BOLD,20));
        changetext.setBounds(40,330,300,40);
        
        reset=new JButton("RESET");
        reset.setFont(new Font("Dialog",Font.BOLD,15));
        reset.setBounds(20,400,100,30);
        
        apply=new JButton("APPLY");
        apply.setFont(new Font("Dialog",Font.BOLD,15));
        apply.setBounds(140,400,100,30);
        
        exit=new JButton("EXIT");
        exit.setFont(new Font("Dialog",Font.BOLD,15));
        exit.setBounds(260,400,100,30);
        
        
        Container con=getContentPane();
        con.setLayout(null);
        con.setBackground(Color.GRAY);
        con.add(text1);
        con.add(bold);
        con.add(italic);
        con.add(size);
        con.add(font);
        con.add(color);
        con.add(changetext);
        con.add(apply);
        con.add(reset);
        con.add(exit);
        con.add(chgsize);
        setLocationRelativeTo(null);
        reset.addActionListener(this);
        apply.addActionListener(this);
        exit.addActionListener(this);
        changetext.addActionListener(this);
        color.addItemListener(this);
        bold.addItemListener(this);
        italic.addItemListener(this);
        font.addItemListener(this);
        size.addItemListener(this);
        chgsize.addAdjustmentListener(this);
        
        addWindowListener(this);
        show();
    }
    public static void main(String args[])
    {
        FontSet fs=new FontSet(Color.BLACK,Color.white);
        
    }   

    @Override
    public void itemStateChanged(ItemEvent ie) 
    {
        
        if(ie.getSource()==color)
        {
            Font tem=text1.getFont();
            String cl=color.getSelectedItem().toString();
            //text.setForeground(Color.getColor(color.getSelectedItem().toString().toLowerCase()));
            if(cl=="Black")
            {
                text1.setForeground(Color.black);
            }
            if(cl=="Blue")
            {
                text1.setForeground(Color.blue);
            }
            if(cl=="Cyan")
            {
                text1.setForeground(Color.cyan);
            }
            if(cl=="Dark Gray")
            {
                text1.setForeground(Color.DARK_GRAY);
            }
            if(cl=="Gray")
            {
                text1.setForeground(Color.gray);
            }
            if(cl=="Green")
            {
                text1.setForeground(Color.green);
            }
            if(cl=="Light Gray")
            {
                text1.setForeground(Color.LIGHT_GRAY);
            }
            if(cl=="Magenta")
            {
                text1.setForeground(Color.magenta);
            }
            if(cl=="Orange")
            {
                text1.setForeground(Color.ORANGE);
            }
            if(cl=="Pink")
            {
                text1.setForeground(Color.pink);
            }
            if(cl=="Red")
            {
                text1.setForeground(Color.red);
            }
            if(cl=="White")
            {
                text1.setForeground(Color.white);
            }
            if(cl=="Yellow")
            {
                text1.setForeground(Color.yellow);
            }
            if(cl=="Color")
            {
                text1.setForeground(Color.black);
            }
            
        }
        if(ie.getSource()==size)
        {
            Font tem=text1.getFont();
            String cl=size.getSelectedItem().toString();
            if(cl=="Size")
            {
                text1.setFont(new Font("Arial",Font.PLAIN,15));
            }
            else
            {
            int n=Integer.parseInt(cl);
           
            text1.setFont(new Font(tem.getName(),tem.getStyle(),n));
            chgsize.setValue(n);
            }
           
        }
        if(ie.getSource()==font)
        {
            Font tem=text1.getFont();
            String cl=font.getSelectedItem().toString();
            text1.setFont(new Font(cl,tem.getStyle(),tem.getSize()));

        }
        if(ie.getSource()==bold||ie.getSource()==italic)
        {
            Font tem=text1.getFont();
            if(bold.isSelected()==true&&italic.isSelected()==true)
            {
                text1.setFont(new Font(tem.getName(),Font.BOLD|Font.ITALIC,tem.getSize()));
                //System.out.println("Bold Selected");
            }
            if(bold.isSelected()==true&&italic.isSelected()==false)
            {
                
                text1.setFont(new Font(tem.getName(),Font.BOLD,tem.getSize()));
            }

            if(italic.isSelected()==true&&bold.isSelected()==false)
            {
                text1.setFont(new Font(tem.getName(),Font.ITALIC,tem.getSize()));
            }
            if(italic.isSelected()==false&&bold.isSelected()==false)
            {
                text1.setFont(new Font(tem.getName(),Font.PLAIN,tem.getSize()));
                //System.out.println("Bold Selected");
            }
    
        }
        //if(bold.isEnabled()=true&&)
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==exit)
        {
            this.setVisible(false);
          
        }
        if(ae.getSource()==reset)
        {
            size.setSelectedIndex(0);
            font.setSelectedIndex(0);
            color.setSelectedIndex(0);
            bold.setSelected(false);
            italic.setSelected(false);
            chgsize.setValue(15);
            text1.setText("Abc");
        }
        if(ae.getSource()==changetext)
        {
            String s=JOptionPane.showInputDialog("Enter to Change Text on Screen");
            text1.setText(s);
        }
        if(ae.getSource()==apply)
        {
            Font tem=text1.getFont();
            
            //Notepad np = new Notepad(Color.CYAN,Color.LIGHT_GRAY);
            //this.anp=np.getContentPane();
            
           
//            np.text.setFont(tem);
            //np.text.setForeground(fgc2);
            //np.text.setBackground(bgc2);
            
            
            Notepad np = new Notepad(fgc,bgc,tem);
            np.setVisible(true);
            setVisible(false);
        }
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent aje)
    {
        if(aje.getSource()==chgsize)
        {
            
            Font tem=text1.getFont();
            int n=chgsize.getValue();
            text1.setFont(new Font(tem.getName(),tem.getStyle(),n));            
        }
    }
    
    @Override
    public void windowOpened(WindowEvent we) 
    {
       
    }

    @Override
    public void windowClosing(WindowEvent we) 
    {
        int n=JOptionPane.showConfirmDialog(this,"ARE YOU SURE...","Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        if(n==JOptionPane.YES_OPTION)
        {
            this.setVisible(false);
        }
        if(n==JOptionPane.NO_OPTION)
        {
            text1.setText("Abc");
            italic.setSelected(false);
        }
    }

    @Override
    public void windowClosed(WindowEvent we) 
    {
        
    }

    @Override
    public void windowIconified(WindowEvent we) 
    {
    
    }

    @Override
    public void windowDeiconified(WindowEvent we) 
    {
    
    }

    @Override
    public void windowActivated(WindowEvent we) 
    {
        
    }

    @Override
    public void windowDeactivated(WindowEvent we) 
    {
    
    }    
}