import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FocusEventDemo implements FocusListener
{
	JFrame f1;
	JTextField t1,t2;
	FocusEventDemo(){
		f1=new JFrame();
		f1.setSize(300,300);
		f1.setLayout(new FlowLayout());
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1=new JTextField(10);
		t2=new JTextField(10);
		f1.add(t1);
		f1.add(t2);
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		f1.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FocusEventDemo();
	}
	
	public void focusGained(FocusEvent e) {
		if(e.getSource()==t1) {
			t1.setBackground(Color.LIGHT_GRAY);
		}
		else if(e.getSource()==t2) {
			t2.setBackground(Color.LIGHT_GRAY);
		}
	}
	
	public void focusLost(FocusEvent e) {
		if(e.getSource()==t1) {
			t1.setBackground(Color.WHITE);
		}
		else if(e.getSource()==t2) {
			t2.setBackground(Color.WHITE);
		}
	}
}