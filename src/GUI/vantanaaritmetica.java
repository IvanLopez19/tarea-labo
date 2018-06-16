/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import calculadoralabo.factoryproducer;
import java.awt.Dimension;

/**
 *
 * @author Ivan Lopez
 */
public class vantanaaritmetica extends JPanel{
    public int WIDTH = 300, WIDTHF=120, WIDTHB=80;
    public int HEIGTH = 300, HEIGTHF=30, HEIGTHB=30;
    public JTextField text1,text2,text3;
    public JButton buttons,buttonr,buttonm,buttond,buttonc;
    
    public vantanaaritmetica(){
        text1= new JTextField();
        text1.setBounds(new Rectangle(100,100,WIDTHF,HEIGTHF));
        
        text2= new JTextField();
        text2.setBounds(new Rectangle(300,100,WIDTHF,HEIGTHF));
        
        text3= new JTextField();
        text3.setBounds(new Rectangle(100,200,WIDTHF,HEIGTHF));
        
        buttons= new JButton("suma");
        buttons.setBounds(new Rectangle(100,15,WIDTHB,HEIGTHB));
        
        buttonr= new JButton("resta");
        buttonr.setBounds(new Rectangle(200,15,WIDTHB,HEIGTHB));
        
        buttonm= new JButton("multiplicacion");
        buttonm.setBounds(new Rectangle(100, 50,WIDTHB,HEIGTHB));
        
        buttond= new JButton("division");
        buttond.setBounds(new Rectangle(200, 50,WIDTHB,HEIGTHB));
        
        buttonc= new JButton("conversion");
        buttonc.setBounds(new Rectangle(400,50,WIDTHB,HEIGTHB));
        
        text1.setEditable(true);
        text2.setEditable(true);
        text3.setEditable(false);
        
        buttons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b;
                String c;
                a=Integer.parseInt(text1.getText());
                b=Integer.parseInt(text2.getText());
                c=factoryproducer.getFactory(1).getaritmetica("suma").operar(a, b);
                text3.setText(c);
            }
        });
        
        buttonr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b;
                String c;
                a=Integer.parseInt(text1.getText());
                b=Integer.parseInt(text2.getText());
                c=factoryproducer.getFactory(1).getaritmetica("resta").operar(a, b);
                text3.setText(c);
            }
        });
        
        buttonm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b;
                String c;
                a=Integer.parseInt(text1.getText());
                b=Integer.parseInt(text2.getText());
                c=factoryproducer.getFactory(1).getaritmetica("multiplicacion").operar(a, b);
                text3.setText(c);
            }
        });
        
        buttonr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b;
                String c;
                a=Integer.parseInt(text1.getText());
                b=Integer.parseInt(text2.getText());
                c=factoryproducer.getFactory(1).getaritmetica("division").operar(a, b);
                text3.setText(c);
            }
        });
        
        buttonc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a;
                String c;
                a=Integer.parseInt(text1.getText());
                c=factoryproducer.getFactory(2).getconversor().convertir(a);
                text3.setText(c);
            }
        });
        
        add(buttons);
        add(buttonr);
        add(buttonm);
        add(buttond);
        add(buttonc);
        add(text1);
        add(text2);
        add(text3);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
    }
}
