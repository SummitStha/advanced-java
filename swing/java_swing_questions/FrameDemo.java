import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameDemo implements ActionListener{
	JFrame f1;
	JMenuBar bar;
	JMenu menu;
	JMenuItem mi1, mi2;
	JButton b1, b2, b3, b4, b5;
	FrameDemo(){
		f1 = new JFrame();
		f1.setSize(300, 300);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(new FlowLayout());
		bar = new JMenuBar();
		menu = new JMenu("File");
		mi1 = new JMenuItem("New");
		mi2 = new JMenuItem("Exit");
		menu.setMnemonic('F');
		menu.add(mi1);
		menu.addSeparator();
		menu.add(mi2);
		bar.add(menu);
		f1.setJMenuBar(bar);
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		f1.setVisible(true);
	}
	public static void main(String[] args){
		new FrameDemo();
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==mi1){
			new Calculator();
		}
		else if(e.getSource()==mi2){
			f1.dispose();
		}
	}
}
