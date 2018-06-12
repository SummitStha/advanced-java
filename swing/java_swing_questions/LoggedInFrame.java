import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoggedInFrame implements ActionListener{
	JFrame f1;
	JButton b1;
	JTextField t1;
	JLabel l1;
	int count=0;
	LoggedInFrame(){
		f1 = new JFrame();
		f1.setSize(300, 300);
		f1.setLayout(new GridLayout(5,2));
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Number of times button is clicked");

		t1 = new JTextField();

		b1 = new JButton("Click Me");

		f1.add(l1); f1.add(t1); 
		f1.add(b1);

		b1.addActionListener(this);
		f1.setVisible(true);
	}
	public static void main(String[] args){
		new LoggedInFrame();
	}
	public void actionPerformed(ActionEvent e){
		count++;
		t1.setText(count + "");
	}
}
