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
import static java.awt.event.InputEvent.CTRL_DOWN_MASK;
import java.io.*;
import java.util.*;
import javax.swing.filechooser.*;




public class Notepad extends JFrame implements ActionListener,WindowListener
{
    JTextArea text;
    JScrollPane jspt;
    JLabel up,down;
    JButton file,edit,format,view,help;
    JMenuBar jmb;
    JMenu mfile, medit,minsert,mformat,mstatistics,mhelp,mcolor;
    JMenuItem miopen,misave,minew,misaveas,miexit,micut,micopy,mipaste,miundo,miredo,midate,mitime,miday,miww,mifg,mibg,mifont,micl,misl,midigit,miword,misentence,miinfo,misupport;
    Scanner sc=new Scanner(System.in);
    String filename;
    Color bgc,fgc;
    Font newfont;
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
                //filename= JOptionPane.showInputDialog(this,"Enter your File Name for Open-","Open File",JOptionPane.OK_CANCEL_OPTION);
            JFileChooser jfc  = new JFileChooser();
            FileNameExtensionFilter f1 = new FileNameExtensionFilter ("Text Files XYZ ","txt");
            FileNameExtensionFilter f2 = new FileNameExtensionFilter ("Java Files ","java");
            FileNameExtensionFilter f3 = new FileNameExtensionFilter ("Microsoft Word Files ","docx");
            jfc.setAcceptAllFileFilterUsed(false);
            
            jfc.addChoosableFileFilter(f1);
            jfc.addChoosableFileFilter(f2);
            jfc.addChoosableFileFilter(f3);
            
            
            int n = jfc.showOpenDialog(this);
            File f = jfc.getSelectedFile();
            FileReader fin = new FileReader(f);
            BufferedReader bin = new BufferedReader (fin);
            while (true)
            {
                String s = bin.readLine();
                if (s == null)
                    break;
                System.out.println(s);
                text.append(s);
                text.append("\n");
            }
            fin.close();
            }catch(Exception e) { System.out.println("Error :" + e.toString()); }
            setTitle(filename+" - MyTextEditor 2.0");
                           
        }
        if(ae.getSource()==misave)
        {
            System.out.println("2");
            String t = text.getText();
            String arr[] = t.split("\n");
            try
            {
                filename= JOptionPane.showInputDialog(this,"Enter your File Name for Save-","Save File",JOptionPane.OK_CANCEL_OPTION);
            
                FileWriter fout = new FileWriter (filename);
                BufferedWriter bout = new BufferedWriter(fout);
                PrintWriter pout = new PrintWriter(bout);
                
                for (int i = 0 ;i<arr.length; i++)
                {
                    pout.println(arr[i]);
                    
                }
                pout.close();
                fout.close();
                
            }catch(Exception e )
            {
                System.out.println("Error :" + e.toString());
            }
        
        }
        if(ae.getSource()==misaveas)
        {
            System.out.println("3");
        }
        if(ae.getSource()==minew)
        {
            
            text.setText("");
            setTitle("Untitiled.mte - MyTextEditor 2.0");
            System.out.println("4");
        }
        if(ae.getSource()==micut)
        {
            text.cut();
            System.out.println("5");
        }
        if(ae.getSource()==micopy)
        {
            text.copy();
            System.out.println("6");
        }
        if(ae.getSource()==mipaste)
        {
            text.paste();
            
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
            Date dt=new Date();
            //int d=dt.getDate();
            text.append(""+dt.toString());
            System.out.println("10");
        }
        if(ae.getSource()==miday)
        {
            Date dt=new Date();
            int d=dt.getDay();
            text.append(""+d);
            System.out.println("11");
        }
        if(ae.getSource()==mitime)
        {
            System.out.println("12");
        }
        if(ae.getSource()==miww)
        {
            System.out.println("word wrap");
            text.setLineWrap(true);
        }

        if(ae.getSource()==mibg)
        {
            Color col  = JColorChooser.showDialog(this, "Select Your Background Color", Color.green);
             
            text.setBackground(col);
        }        
        if(ae.getSource()==mifg)
        {
            System.out.println("14");
            Font tem=text.getFont();
            Color fc=text.getForeground();
            Color bc=text.getBackground();
            RGB rgb=new RGB("fgc",bc,fc,tem);
            setVisible(false);
        }
        if(ae.getSource()==mifont)
        {
            
            System.out.println("15");
            Color fc=text.getForeground();
            Color bc=text.getBackground();
            FontSet fs=new FontSet(fc,bc);
            setVisible(false);
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
            int count=0;
            String t = text.getText();
            String arr[] = t.split("\n");
            try
            {
                //filename= JOptionPane.showInputDialog(this,"Enter your File Name for Save-","Save File",JOptionPane.OK_CANCEL_OPTION);
            
                FileWriter fout = new FileWriter (filename);
                BufferedWriter bout = new BufferedWriter(fout);
                                
                for (int i = 0 ;i<t.length()-1; i++)
                {
                    char ch=t.charAt(i);
                    if(ch>=65&&ch<=90)
                        count++;
                    else if(ch>=97&&ch<=122)
                        count++;
                    System.out.println(count);
                }
                
                text.setText("Total no. of Words = "+count);
                fout.close();
                
            }catch(Exception e )
            {
                System.out.println("Error :" + e.toString());
                System.out.println("line :"+e.getMessage());
            }
        }
        if(ae.getSource()==misentence)
        {
            System.out.println("20");
            int lc=text.getLineCount();
            String lcs=String.valueOf(lc);
            text.setText("Total no. of lines = "+lcs);
        }
        if(ae.getSource()==miinfo)
        {
            System.out.println("21");
            
            text.setText("Developed by- TANISHQ VARSHNEY");
            text.setAlignmentX(9);
        }
        if(ae.getSource()==misupport)
        {
            System.out.println("22");
        }
    }
    public Notepad(Color f,Color b,Font Tx)
    {

        fgc=f;
        bgc=b;
        newfont=Tx;
        setTitle("Untitiled.mte - MyTextEditor 2.0");
        setSize(600,800);
        this.setLocationRelativeTo(null);
        
        file=new JButton("File");
        edit=new JButton("Edit");
        format=new JButton("Format");
        view=new JButton("View");
        help=new JButton("Help");
        
        up=new JLabel("",JLabel.RIGHT);
       // up.add(file,this);up.add(edit);up.add(format);up.add(view);up.add(help);
        down=new JLabel("",JLabel.RIGHT);
        
        
        text=new JTextArea();
        text.setBackground(bgc);
        text.setForeground(fgc);
        text.setFont(new Font(newfont.getName(),newfont.getStyle(),newfont.getSize()));
        
        
        jspt=new JScrollPane(text);
        jspt.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jspt.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        Font fo=new Font("Serif",Font.BOLD,20);
        
        jmb = new JMenuBar();
        
        mfile = new JMenu("File");
        mfile.setFont(fo);
        
        medit = new JMenu("Edit");
        medit.setFont(fo);
        
        minsert = new JMenu("Insert");
        minsert.setFont(fo);
        
        mformat = new JMenu("Format");
        mformat.setFont(fo);
        
        mstatistics = new JMenu("Statics");
        mstatistics.setFont(fo);
        
        mhelp = new JMenu("Help");
        mhelp.setFont(fo);
        
        miopen = new JMenuItem("Open");
        miopen.setAccelerator(KeyStroke.getKeyStroke('O',CTRL_DOWN_MASK));
        misave = new JMenuItem("Save");
        misave.setAccelerator(KeyStroke.getKeyStroke('C',CTRL_DOWN_MASK));
        misaveas=new JMenuItem("Save As");
        minew= new JMenuItem("New");
        minew.setAccelerator(KeyStroke.getKeyStroke('N',CTRL_DOWN_MASK));
        miexit = new JMenuItem("Exit");
        
        micut= new JMenuItem("Cut");
        micut.setAccelerator(KeyStroke.getKeyStroke('X',CTRL_DOWN_MASK));
        micopy= new JMenuItem("Copy");
        micopy.setAccelerator(KeyStroke.getKeyStroke('C',CTRL_DOWN_MASK));
        mipaste= new JMenuItem("Paste");
        mipaste.setAccelerator(KeyStroke.getKeyStroke('V',CTRL_DOWN_MASK));

        miundo= new JMenuItem("Undo");
        miundo.setAccelerator(KeyStroke.getKeyStroke('Z',CTRL_DOWN_MASK));
        miredo= new JMenuItem("redo");
        miredo.setAccelerator(KeyStroke.getKeyStroke('Y',CTRL_DOWN_MASK));
        
        midate=new JMenuItem("Date");
        miday=new JMenuItem("Day");
        mitime=new JMenuItem("Time");
        
        mcolor=new JMenu("Color");
        mifg=new JMenuItem("Foreground Color");
        mifg.setAccelerator(KeyStroke.getKeyStroke('F',CTRL_DOWN_MASK));
        mibg=new JMenuItem("Background Color");
        mibg.setAccelerator(KeyStroke.getKeyStroke('B',CTRL_DOWN_MASK));
        mifont=new JMenuItem("Font");
        miww=new JMenuItem("Word Wrap");
        
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
        mformat.add(mcolor);mformat.add(mifont);mformat.add(miww);
        
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
        miww.addActionListener(this);
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
        
        
        addWindowListener(this);
        
        Container con=getContentPane();
        con.setLayout(new BorderLayout());
        con.add(jspt);
        con.add(up,BorderLayout.NORTH);
        con.add(down,BorderLayout.SOUTH);
        
        show();
    }
    
    @Override
    public void windowOpened(WindowEvent we) 
    {
       
    }

    @Override
    public void windowClosing(WindowEvent we) 
    {
        System.exit(0);
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
    public static void main(String[] args) 
    {
        Font fx=new Font("Arial",Font.PLAIN,15);
        Color fcr=new Color(0,0,0);
        Color bcr=new Color(255,255,255);
        Notepad np=new Notepad(fcr,bcr,fx);
    }

    
}
