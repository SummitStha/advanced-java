import java.util.*;
import java.io.*;
import java.net.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TCPClient implements ActionListener {

	JFrame f1;
	JLabel l1;
	JTextField t1;
	JButton b1;

	TCPClient(){
		f1 = new JFrame();
		f1.setSize(300,300);
		f1.setLayout(new FlowLayout());
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t1 = new JTextField(10);
		f1.add(t1);
		b1 = new JButton("Send");
		b1.addActionListener(this);
		f1.add(b1);
		f1.setVisible(true);

	}


	public static void main(String args[]){
		new TCPClient();
	}

	public void actionPerformed(ActionEvent e){
		try{
			Socket s = new Socket("<host-name>", 6789);

			//Scanner input = new Scanner(System.in);
			//System.out.println("Enter Your Message: ");
			//String str1 = input.nextLine();
			String str1 = t1.getText();
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeBytes(str1 + "\n");
			
			Scanner serverInput = new Scanner(s.getInputStream());
			String str2 = serverInput.nextLine();
			//System.out.println("From Server: " + str2);
			l1 = new JLabel(str2);
			f1.add(l1);
			f1.setVisible(true);

			dout.close();
			s.close();
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
}
