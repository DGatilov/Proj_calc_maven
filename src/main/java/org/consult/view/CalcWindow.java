package org.consult.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.text.BadLocationException;

public class CalcWindow extends JFrame {
   public JTextArea jTextArea_result;
   public void init() {
	   setSize( 600 /*400*/,600 /*400*/ );
	   setTitle("Калькулятор");
	   setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
	   //
	   JPanel jPanel_central = new JPanel();
	   jPanel_central.setLayout( new BorderLayout());
	   jPanel_central.setSize(600, 600);
	   //
	   JPanel jPanel_Journal = new JPanel();
	   //-----jPanel_Journal.setSize(100, 600);
	   jPanel_Journal.setToolTipText("Журнал");
	   JTextArea jTextArea_journal = new JTextArea();
	   jTextArea_journal.setText("4 * 3 = 12\n4 + 6 = 10 \n");
	   //
	   jTextArea_journal.setSize(200, 600);
	   jPanel_Journal.add(jTextArea_journal);
	   //
	   JPanel jPanel_view_0 = new JPanel();
	   jPanel_view_0.setLayout( new BoxLayout( jPanel_view_0, BoxLayout.Y_AXIS));
	   jPanel_view_0.setSize(500, 600);
	   //
	   JPanel jPanel_view = new JPanel();
	   jPanel_view.setLayout( new GridLayout(5,4));
	   jPanel_view.setSize(500, 500);
	   //
	   JButton jButt_CE = new JButton("CE");
	   jButt_CE.addActionListener( new Many_JButton());
	   jPanel_view.add( jButt_CE) ;
       //
	   JButton jButt_C = new JButton("C");
	   jButt_C.addActionListener( new Many_JButton());
	   jPanel_view.add( jButt_C) ;
	   //
	   JButton jButt_backspace = new JButton("BackSpace");
	   jButt_backspace.addActionListener( new Many_JButton());
	   jPanel_view.add( jButt_backspace) ;
	   //
	   JButton jButt_divide = new JButton("/");
	   jButt_divide.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_divide);
	   //
	   JButton jButt_7 = new JButton("7");
	   jButt_7.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_7);
	   //
	   JButton jButt_8 = new JButton("8");
	   jButt_8.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_8);
	   //
	   JButton jButt_9 = new JButton("9");
	   jButt_9.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_9);
	   //
	   JButton jButt_multiple = new JButton("*");
	   jButt_multiple.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_multiple);
	   //
	   JButton jButt_4 = new JButton("4");
	   jButt_4.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_4);
	   //
	   JButton jButt_5 = new JButton("5");
	   jButt_5.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_5);
	   //
	   JButton jButt_6 = new JButton("6");
	   jButt_6.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_6);
	   //
	   JButton jButt_minus = new JButton("-");
	   jButt_minus.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_minus);
	   //
	   JButton jButt_1 = new JButton("1");
	   jButt_1.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_1);
	   //
	   JButton jButt_2 = new JButton("2");
	   jButt_2.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_2);
	   //
	   JButton jButt_3 = new JButton("3");
	   jButt_3.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_3);
	   //
	   JButton jButt_plus = new JButton("+");
	   jButt_plus.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_plus);
	   //
	   JButton jButt_plus_minus = new JButton("�");
	   jButt_plus_minus.setActionCommand("plus_minus");
	   jButt_plus_minus.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_plus_minus);
	   //
	   JButton jButt_0 = new JButton("0");
	   jButt_0.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_0);
	   //
	   JButton jButt_comma = new JButton(",");
	   jButt_comma.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_comma);
	   //
	   JButton jButt_equal = new JButton("=");
	   jButt_equal.addActionListener( new Many_JButton());
	   jPanel_view.add(jButt_equal);
	   //
	   jTextArea_result = new JTextArea(" ");
	   jTextArea_result.setSize(600, 300);
	   jPanel_view_0.add( jPanel_view);
	   jPanel_view_0.add(jTextArea_result);
	   //
	   jPanel_central.add( jTextArea_result,BorderLayout.NORTH );
	   jPanel_central.add( jPanel_view, BorderLayout.CENTER );
	   jPanel_central.add( jTextArea_journal/*jPanel_Journal*/ , BorderLayout.EAST );  	   
	   //
	   //
	   setVisible(true);
	   //
	   add( jPanel_central );
	   jTextArea_result.setCaretPosition(1);
   }
   //
   public class Many_JButton implements ActionListener { 
	   public void actionPerformed( ActionEvent ae ) {
		   // System.out.println("getActionCommand = " + ae.getActionCommand());
		   String current_result = jTextArea_result.getText();
		   String current_command = ae.getActionCommand(); 
		   //
		   int current_position_cursor = jTextArea_result.getCaretPosition();
		   //
		   //jTextArea_result.setText( current_result + current_command );
		   try {
			jTextArea_result.getDocument().insertString(current_position_cursor, current_command, null);
		   } catch (BadLocationException e) {
			// TODO Auto-generated catch block
			System.err.println("Error at insert string to evaluate's field !");   
			e.printStackTrace();
		   }
	   }
   }
}
