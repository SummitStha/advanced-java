import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginInterface implements ActionListener{
	JFrame f1;
	JTextField t1;
	JPasswordField t2;
	JLabel l1, l2;
	JButton b1;

	LoginInterface(){
		f1 = new JFrame();
		f1.setSize(300, 300);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(new FlowLayout());
		l1 = new JLabel("Username");
		l2 = new JLabel("Password");

		t1 = new JTextField(10);
		t2 = new JPasswordField(10);

		b1 = new JButton("Login");

		f1.add(l1); f1.add(t1); 
		f1.add(l2); f1.add(t2);
		f1.add(b1);

		b1.addActionListener(this);
		f1.setVisible(true);

	}
	public static void main(String[] args){
		new LoginInterface();
	}
	public void actionPerformed(ActionEvent e){
		String uname = t1.getText();
		String pwd = new String(t2.getPassword());
		if(uname.equals("admin") && pwd.equals("admin")){
			new LoggedInFrame();
		}
	}
}
