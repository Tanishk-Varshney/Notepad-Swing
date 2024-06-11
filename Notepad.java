/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.notepad;

/**
 *
 * @author TANISHQ
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;



public class Notepad extends JFrame implements ActionListener
{
    JTextArea text;
    JScrollPane jspt;
    JLabel up,down;
    JButton file,edit,format,view,help;
    JMenuBar jmb;
    JMenu mfile, medit,minsert,mformat,mstatistics,mhelp,mcolor;
    JMenuItem miopen,misave,minew,misaveas,miexit,micut,micopy,mipaste,miundo,miredo,midate,mitime,miday,mifg,mibg,mifont,micl,misl,midigit,miword,misentence,miinfo,misupport;
    
    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == miexit)
        {
            int n = JOptionPane.showConfirmDialog(this, "Are you Sure You want to Exit ??","Confirm Exit ", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if (n == JOptionPane.YES_OPTION)
            {
                System.exit(0);
            }
        }
        if(ae.getSource()==miopen)
        {
            System.out.println("1");
            try{
            FileReader fin = new FileReader("notepad.java");
            BufferedReader bin = new BufferedReader (fin);
            while (true)
            {
                String s = bin.readLine();
                if (s == null)
                    break;
                System.out.print(s);
                text.append(s);
            }
            fin.close();
            }catch(Exception e) { System.out.println("Error :" + e.toString()); }
            
                           
        }
        if(ae.getSource()==misave)
        {
            System.out.println("2");
        }
        if(ae.getSource()==misaveas)
        {
            System.out.println("3");
        }
        if(ae.getSource()==minew)
        {
            System.out.println("4");
        }
        if(ae.getSource()==micut)
        {
            System.out.println("5");
        }
        if(ae.getSource()==micopy)
        {
            System.out.println("6");
        }
        if(ae.getSource()==mipaste)
        {
            System.out.println("7");
        }
        if(ae.getSource()==miundo)
        {
            System.out.println("8");
        }
        if(ae.getSource()==miredo)
        {
            System.out.println("9");
        }
        if(ae.getSource()==midate)
        {
            System.out.println("10");
        }
        if(ae.getSource()==miday)
        {
            System.out.println("11");
        }
        if(ae.getSource()==mitime)
        {
            System.out.println("12");
        }
        if(ae.getSource()==mibg)
        {
            System.out.println("13");
        }
        if(ae.getSource()==mifg)
        {
            System.out.println("14");
        }
        if(ae.getSource()==mifont)
        {
            System.out.println("15");
            FontSet fs=new FontSet();
        }
        if(ae.getSource()==micl)
        {
            System.out.println("16");
        }
        if(ae.getSource()==misl)
        {
            System.out.println("17");
        }
        if(ae.getSource()==midigit)
        {
            System.out.println("18");
        }
        if(ae.getSource()==miword)
        {
            System.out.println("19");
        }
        if(ae.getSource()==misentence)
        {
            System.out.println("20");
        }
        if(ae.getSource()==miinfo)
        {
            System.out.println("21");
        }
        if(ae.getSource()==misupport)
        {
            System.out.println("22");
        }
    }
    public Notepad()
    {
        setSize(600,800);
        this.setLocation(300, 200);
        file=new JButton("File");
        edit=new JButton("Edit");
        format=new JButton("Format");
        view=new JButton("View");
        help=new JButton("Help");
        
        up=new JLabel(" ",JLabel.RIGHT);
        up.add(file,this);up.add(edit);up.add(format);up.add(view);up.add(help);
        down=new JLabel("down",JLabel.RIGHT);
        text=new JTextArea();
        jspt=new JScrollPane(text);
        jspt.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jspt.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        
        
        jmb = new JMenuBar();
        
        mfile = new JMenu("File");
        medit = new JMenu("Edit");
        minsert = new JMenu("Insert");
        mformat = new JMenu("Format");
        mstatistics = new JMenu("Statics");
        mhelp = new JMenu("Help");
        
        miopen = new JMenuItem("Open");
        misave = new JMenuItem("Save");
        misaveas=new JMenuItem("Save As");
        minew= new JMenuItem("New");
        miexit = new JMenuItem("Exit");
        
        micut= new JMenuItem("Cut");
        micopy= new JMenuItem("Copy");
        mipaste= new JMenuItem("Paste");
        miundo= new JMenuItem("Undo");
        miredo= new JMenuItem("redo");
        
        midate=new JMenuItem("Date");
        miday=new JMenuItem("Day");
        mitime=new JMenuItem("Time");
        
        mcolor=new JMenu("Color");
        mifg=new JMenuItem("Foreground Color");
        mibg=new JMenuItem("Background Color");
        mifont=new JMenuItem("Font");
        
        micl=new JMenuItem("Capital Letters");
        misl=new JMenuItem("Small Letters");
        midigit=new JMenuItem("Digits");
        miword=new JMenuItem("Words");
        misentence=new JMenuItem("Sentences");
        
        miinfo=new JMenuItem("Information");
        misupport=new JMenuItem("Support");
        
//        mfile.setMnemonic('F');
//        miopen.setMnemonic('O');

        mfile.add(minew);mfile.add(miopen);mfile.add(misave);mfile.add(misaveas);
        mfile.addSeparator();
        mfile.add(miexit);
        
        medit.add(miundo);medit.add(miredo);
        medit.addSeparator();
        medit.add(micut);medit.add(micopy);medit.add(mipaste);
        
        minsert.add(midate);minsert.add(mitime);minsert.add(miday);
        
        mcolor.add(mifg);mcolor.add(mibg);
        mformat.add(mcolor);mformat.add(mifont);
        
        mstatistics.add(micl);mstatistics.add(misl);mstatistics.add(midigit);mstatistics.add(miword);mstatistics.add(misentence);
        
        mhelp.add(miinfo);mhelp.add(misupport);
        
        micopy.setToolTipText("It Will Copy the text in memory");
        
        jmb.add(mfile);jmb.add(medit);jmb.add(minsert);jmb.add(mformat);jmb.add(mstatistics);jmb.add(mhelp);
        
        setJMenuBar(jmb);
        miopen.addActionListener(this);
        misave.addActionListener(this);
        misaveas.addActionListener(this);
        minew.addActionListener(this);
        miexit.addActionListener(this);
        micut.addActionListener(this);
        micopy.addActionListener(this);
        mipaste.addActionListener(this);
        miundo.addActionListener(this);
        miredo.addActionListener(this);
        midate.addActionListener(this);
        miday.addActionListener(this);
        mitime.addActionListener(this);
        mibg.addActionListener(this);
        mifg.addActionListener(this);
        mifont.addActionListener(this);
        micl.addActionListener(this);
        misl.addActionListener(this);
        midigit.addActionListener(this);
        miword.addActionListener(this);
        misentence.addActionListener(this);
        miinfo.addActionListener(this);
        misupport.addActionListener(this);
        
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        con.add(jspt);
        con.add(up,BorderLayout.NORTH);
        con.add(down,BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        show();
    }

    public static void main(String[] args) {
        Notepad np=new Notepad();
    }

}
