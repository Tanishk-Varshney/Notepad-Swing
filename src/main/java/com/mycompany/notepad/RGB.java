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
import javax.swing.*;
import java.awt.event.*;
        
public class RGB extends JFrame implements AdjustmentListener,WindowListener,ActionListener//,ItemListener
{
    JLabel top,r,g,b;
    JScrollBar r1,r2,g1,g2,b1,b2;
    JRadioButton fg,bg;
    JTextField tr1,tg1,tb1,tr2,tg2,tb2,text1;
    ButtonGroup cg;
    JButton apply,exit;
    String fgcolor,bgcolor,a;
    Color bgc,fgc,bgc2,fgc2;
    JTextField tcr1,tcg1,tcb1,cr2,cg2,cb2;
    Color fc,bc;
    Font tem;
    public RGB(String abc,Color fc,Color bc,Font tem)
    {
        this.bc=bc;
        this.fc=fc;
        this.tem=tem;
         a=abc;
        setSize(340,350);
        System.out.println(a);
        top=new JLabel("COLOR APPLICATION",JLabel.CENTER);
        top.setFont(new Font("Monospaced",Font.BOLD,20));
        top.setOpaque(true);
        top.setBackground(Color.red);
        top.setForeground(new Color(65,60,105));
        top.setBounds(10,10,300,30);
        
        text1=new JTextField("COLOR TEST");
        text1.setFont(new Font("Dialog",Font.BOLD,40));
        text1.setEditable(false);
        text1.setBackground(new Color(100,100,100));
        text1.setForeground(new Color(100,100,100));
        text1.setHorizontalAlignment(JLabel.CENTER);
        text1.setBounds(20,50,280,60);

        


        r=new JLabel("RED");
        r.setHorizontalAlignment(JLabel.RIGHT);
        r.setForeground(Color.red);
        r.setBackground(Color.DARK_GRAY);
        r.setOpaque(true);
        r.setBounds(10,150,50,20);
        
        r1=new JScrollBar(JScrollBar.HORIZONTAL,100,1,0,256);
        r1.setBounds(70,150,170,20);
        
        tr1=new JTextField("100");
        tr1.setBounds(250,150,30,20);
        
        tcr1=new JTextField();
        tcr1.setBackground(new Color(100,0,0));
        tcr1.setBounds(285,150,20,20);
        
        
        
        r2=new JScrollBar(JScrollBar.HORIZONTAL,100,1,0,256);
        r2.setBounds(70,150,170,20);
        
        
        tr2=new JTextField("100");
        tr2.setBounds(250,150,30,20);
        
        
        cr2=new JTextField();
        cr2.setBackground(new Color(100,0,0));
        cr2.setBounds(285,150,20,20);
        

        
        
        g=new JLabel("GREEN");
        g.setHorizontalAlignment(JLabel.RIGHT);
        g.setForeground(Color.green);
        g.setBackground(Color.DARK_GRAY);
        g.setOpaque(true);
        g.setBounds(10,190,50,20);
        
        g1=new JScrollBar(JScrollBar.HORIZONTAL,100,1,0,256);
        g1.setBounds(70,190,170,20);
        
        tg1=new JTextField("100");
        tg1.setBounds(250,190,30,20);
        
        tcg1=new JTextField();
        tcg1.setBackground(new Color(0,100,0));
        tcg1.setBounds(285,190,20,20);
        
        
        
        g2=new JScrollBar(JScrollBar.HORIZONTAL,100,1,0,256);
        g2.setBounds(70,190,170,20);
        
        
        tg2=new JTextField("100");
        tg2.setBounds(250,190,30,20);
        
        
        cg2=new JTextField();
        cg2.setBackground(new Color(0,100,0));
        cg2.setBounds(285,190,20,20);
        



        b=new JLabel("BLUE");
        b.setHorizontalAlignment(JLabel.RIGHT);
        b.setForeground(Color.blue);
        b.setBackground(Color.DARK_GRAY);
        b.setOpaque(true);
        b.setBounds(10,230,50,20);
        
        b1=new JScrollBar(JScrollBar.HORIZONTAL,100,1,0,256);
        b1.setBounds(70,230,170,20);
        
        tb1=new JTextField("100");
        tb1.setBounds(250,230,30,20);
        
        tcb1=new JTextField();
        tcb1.setBackground(new Color(0,0,100));
        tcb1.setBounds(285,230,20,20);
        
        
        b2=new JScrollBar(JScrollBar.HORIZONTAL,100,1,0,256);
        b2.setBounds(70,230,170,20);
        
        
        tb2=new JTextField("100");
        tb2.setBounds(250,230,30,20);
        
        
        cb2=new JTextField();
        cb2.setBackground(new Color(0,0,100));
        cb2.setBounds(285,230,20,20);
        
        
        
            r1.setVisible(false);
            g1.setVisible(false);
            b1.setVisible(false);
            tr1.setVisible(false);
            tg1.setVisible(false);
            tb1.setVisible(false);
            tcr1.setVisible(false);
            tcg1.setVisible(false);
            tcb1.setVisible(false);
            r2.setVisible(false);
            g2.setVisible(false);
            b2.setVisible(false);
            tr2.setVisible(false);
            tg2.setVisible(false);
            tb2.setVisible(false);
            cr2.setVisible(false);
            cg2.setVisible(false);
            cb2.setVisible(false);
        
            
        apply=new JButton("APPLY");
        apply.setFont(new Font("Dialog",Font.BOLD,15));
        apply.setBounds(40,260,100,30);
        
        exit=new JButton("EXIT");
        exit.setFont(new Font("Dialog",Font.BOLD,15));
        exit.setBounds(180,260,100,30);
        

        

        fg=new JRadioButton("ForeGround Colour");
        fg.setBounds(25,120,140,20);
        
        
        bg=new JRadioButton("BackGround Colour");
        bg.setBounds(165,120,140,20);
        
        
        
        
         if(a.equals("bgc"))
        {
            bg.setSelected(true);
            top.setText("Background Color");
            setTitle("Background");
            
            r2.setVisible(true);
            g2.setVisible(true);
            b2.setVisible(true);
            tr2.setVisible(true);
            tg2.setVisible(true);
            tb2.setVisible(true);
            cr2.setVisible(true);
            cg2.setVisible(true);
            cb2.setVisible(true);
        }
        if(a.equals("fgc"))
        {
            fg.setSelected(true);
            top.getText();
            top.setText("Foreground Color");
            setTitle("Foreground");
            
            tcr1.setVisible(true);
            tcg1.setVisible(true);
            tcb1.setVisible(true);
            r1.setVisible(true);
            g1.setVisible(true);
            b1.setVisible(true);
            tr1.setVisible(true);
            tg1.setVisible(true);
            tb1.setVisible(true);
        }
       
        
        cg=new ButtonGroup();
        cg.add(fg);  cg.add(bg);
        
        Container con=getContentPane();
        con.setLayout(null);
        con.setBackground(Color.DARK_GRAY);
        
        con.add(top);
        con.add(r);
        con.add(g);
        con.add(b);
        con.add(r1);
        con.add(g1);
        con.add(b1);
        con.add(apply);
        con.add(exit);
        con.add(tr1);
        con.add(tg1);
        con.add(tb1);
        con.add(text1);
        
        con.add(tr2);
        con.add(tg2);
        con.add(tb2);
        con.add(r2);
        con.add(g2);
        con.add(b2);

        con.add(tcr1);
        con.add(tcg1);
        con.add(tcb1);
        con.add(cr2);
        con.add(cg2);
        con.add(cb2);

//        fg.addItemListener(this);
//        bg.addItemListener(this);
        
        r1.addAdjustmentListener(this);
        g1.addAdjustmentListener(this);
        b1.addAdjustmentListener(this);
        
        r2.addAdjustmentListener(this);
        g2.addAdjustmentListener(this);
        b2.addAdjustmentListener(this);
        apply.addActionListener(this);
        exit.addActionListener(this);
        addWindowListener(this);
        
        setLocationRelativeTo(null);
        show();
    }
    public static void main(String args[])
    {
        Font fx=new Font("Arial",Font.PLAIN,15);
        RGB app=new RGB("",Color.black,Color.CYAN,fx);
    }

//    @Override
//    public void itemStateChanged(ItemEvent ie) 
//    {
//        
//        if(ie.getSource()==bg)
//        {
//            r1.setVisible(false);
//            g1.setVisible(false);
//            b1.setVisible(false);
//            tr1.setVisible(false);
//            tg1.setVisible(false);
//            tb1.setVisible(false);
//            tcr1.setVisible(false);
//            tcg1.setVisible(false);
//            tcb1.setVisible(false);
//            
//            
//            r2.setVisible(true);
//            g2.setVisible(true);
//            b2.setVisible(true);
//            tr2.setVisible(true);
//            tg2.setVisible(true);
//            tb2.setVisible(true);
//            cr2.setVisible(true);
//            cg2.setVisible(true);
//            cb2.setVisible(true);
//            
//            
//        }
//        
//        if(ie.getSource()==fg)
//        {
//            r2.setVisible(false);
//            g2.setVisible(false);
//            b2.setVisible(false);
//            tr2.setVisible(false);
//            tg2.setVisible(false);
//            tb2.setVisible(false);
//            cr2.setVisible(false);
//            cg2.setVisible(false);
//            cb2.setVisible(false);
//            
//            
//            tcr1.setVisible(true);
//            tcg1.setVisible(true);
//            tcb1.setVisible(true);
//            r1.setVisible(true);
//            g1.setVisible(true);
//            b1.setVisible(true);
//            tr1.setVisible(true);
//            tg1.setVisible(true);
//            tb1.setVisible(true);
//            
//        }
//    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent aje) 
    {
        if(aje.getSource()==r1||aje.getSource()==g1||aje.getSource()==b1)
        {
            int ri=r1.getValue();
            String rs=String.valueOf(ri);
            tr1.setText(rs);

            int gi=g1.getValue();
            String gs=String.valueOf(gi);
            tg1.setText(gs);

            int bi=b1.getValue();
            String bs=String.valueOf(bi);
            tb1.setText(bs);
        
            String os=tr1.getText();
            int oi=Integer.parseInt(os);
            tcr1.setBackground(new Color(oi,0,0));
        
            String ps=tg1.getText();
            int pi=Integer.parseInt(ps);
            tcg1.setBackground(new Color(0,pi,0));
        
            String qs=tb1.getText();
            int qi=Integer.parseInt(qs);
            tcb1.setBackground(new Color(0,0,qi));
        
            text1.setForeground(new Color(oi,pi,qi));
        }

        if(aje.getSource()==r2||aje.getSource()==g2||aje.getSource()==b2)
        {
            int ri=r2.getValue();
            String rs=String.valueOf(ri);
            tr2.setText(rs);

            int gi=g2.getValue();
            String gs=String.valueOf(gi);
            tg2.setText(gs);

            int bi=b2.getValue();
            String bs=String.valueOf(bi);
            tb2.setText(bs);
        
            String os=tr2.getText();
            int oi=Integer.parseInt(os);
            cr2.setBackground(new Color(oi,0,0));
        
            String ps=tg2.getText();
            int pi=Integer.parseInt(ps);
            cg2.setBackground(new Color(0,pi,0));
        
            String qs=tb2.getText();
            int qi=Integer.parseInt(qs);
            cb2.setBackground(new Color(0,0,qi));
        
            text1.setBackground(new Color(oi,pi,qi));
            
        }
    }

    @Override
    public void windowOpened(WindowEvent we) 
    {
       
    }

    @Override
    public void windowClosing(WindowEvent we) 
    {
        this.setVisible(false);
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

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==apply)
        {
            
                fgc=text1.getForeground();
                bgc=text1.getBackground();
 
             if(a.equals("bgc"))
            {
 
                Notepad np=new Notepad(fc,bgc,tem);
                np.setVisible(true);
                setVisible(false);
            }
            if(a.equals("fgc"))
            {
                Notepad np=new Notepad(fgc,fc,tem);
                np.setVisible(true);
                setVisible(false);
            }   
        }
        if(ae.getSource()==exit)
        {
            
             if(a.equals("bgc"))
            {
 
                Notepad np=new Notepad(fc,bc,tem);
                np.setVisible(true);
                setVisible(false);
            }
            if(a.equals("fgc"))
            {
                Notepad np=new Notepad(bc,fc,tem);
                np.setVisible(true);
                setVisible(false);
            } 
        }
    }
    
}
