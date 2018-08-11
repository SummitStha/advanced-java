// A GUI based Simple Interest Calculator.

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleInterest implements ActionListener{
	JFrame f1;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3, t4;
	JButton b1, b2;
	SimpleInterest(){
		f1 = new JFrame();
		f1.setSize(500, 500);
		f1.setLayout(new GridLayout(5,5));
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Principal");
		l2 = new JLabel("Time");
		l3 = new JLabel("Rate");
		l4 = new JLabel("Simple Interest");

		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);

		b1 = new JButton("Reset");
		b2 = new JButton("Calculate");
		
		f1.add(l1); f1.add(t1); 
		f1.add(l2); f1.add(t2);
		f1.add(l3); f1.add(t3);
		f1.add(l4); f1.add(t4);
		f1.add(b1); f1.add(b2);

		b1.addActionListener(this);
		b2.addActionListener(this);

		f1.setVisible(true);
	}
	
	public static void main(String[] args){
		new SimpleInterest();
	}

	public void actionPerformed(ActionEvent e){
		double p = Double.parseDouble(t1.getText());
		double t = Double.parseDouble(t2.getText());
		double r = Double.parseDouble(t3.getText());
		
		double interest = (p*t*r)/100;
		
		if(e.getSource() == b1)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		else if(e.getSource() == b2)
		{
			t4.setText(interest + "");
		}
	}
}
