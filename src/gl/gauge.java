/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl;

/**
 *
 * @author My
 */


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import eu.hansolo.steelseries.gauges.Radial;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;


public class gauge extends javax.swing.JFrame {
    final static Radial gauge = new Radial();
    public static void createAndShowUI(final gaugeForm g) {
        final JFrame frame = new JFrame("gslkhflks");
        Container con = frame.getContentPane();
        con.setBackground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        //frame.setBackground();
        //frame.setBackground(Color.black);
        
        
        

        JPanel panel = new JPanel() {
            @Override 
            public Dimension getPreferredSize() {
                return new Dimension(300, 300);
            }
        };

        //final Radial gauge = new Radial();
        gauge.setTitle("MPH");
        gauge.setUnitString("");

        panel.setLayout(new BorderLayout());
        panel.add(gauge, BorderLayout.CENTER);
        frame.add(panel);

        JPanel buttonsPanel = new JPanel();
        JLabel valueLabel = new JLabel("Value:");

        final JTextField valueField = new JTextField(7);
        valueField.setText("30");
        JButton button = new JButton("Set");
        
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double value = Double.valueOf(valueField.getText());
                    gauge.setValueAnimated(g.speedNum);
                } catch(NumberFormatException ex) { 
                    //TODO - handle invalid input 
                    System.err.println("invalid input");
                }
            }
        });
        
        

        //buttonsPanel.add(valueLabel);
        //buttonsPanel.add(valueField);
        //buttonsPanel.add(button);

        frame.add(buttonsPanel, BorderLayout.NORTH);

        frame.pack();
        frame.setVisible(true);
       
        
    }
    public static void UPD(double d){
            gauge.setValueAnimated(d);
    }
    
    
}
