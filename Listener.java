import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//繼承JFrame、實作java.awt.event.ActionListener
public class Listener extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	public int act = 0;
	private JLabel label1,label2;
	
	public Listener(){
		setTitle("Question");
		JPanel Panel1 = new JPanel();
		Panel1.setLayout(new BorderLayout());
		
		JPanel Panel2 = new JPanel();
		Panel2.setLayout(new GridLayout(4,1));
		
		JButton myButton1 = new JButton("1:Monday");
		JButton myButton2 = new JButton("2:Tuesday");
		JButton myButton3 = new JButton("3:Wednesday");
		JButton myButton4 = new JButton("4:Thursday");
		label1= new JLabel("What day is it today?");
		label2= new JLabel("Select the answer");
		myButton1.addActionListener(this);
		myButton2.addActionListener(this);
		myButton3.addActionListener(this);
		myButton4.addActionListener(this);
		Panel2.add(myButton1);
		Panel2.add(myButton2);
		Panel2.add(myButton3);
		Panel2.add(myButton4);
		Panel1.add(Panel2,BorderLayout.CENTER);
		Panel1.add(label1,BorderLayout.NORTH);
		Panel1.add(label2,BorderLayout.SOUTH);
		add(Panel1);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 240);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() !=  "4:Thursday")
			label2.setText("false");
		else
			label2.setText("true");
	}
	public static void main(String[] args) {
		new Listener();
	}
}
