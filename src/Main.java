import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main implements ActionListener
{
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JLabel label;
	private int count = 0;
	
	public Main()
	{
		frame = new JFrame();
		panel = new JPanel();
		
 		button = new JButton("Click Here");
		button.addActionListener(this);
		
		label = new JLabel("Number of Clicks : 0");
		
		panel.setBorder(BorderFactory.createEmptyBorder(120, 120, 40, 120));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Example");
		frame.pack();
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		++count;
		label.setText("Number of Clicks : " + count);
	}
	
	
	public static void main(String[] args)
	{
		new Main();
	}

	
}

