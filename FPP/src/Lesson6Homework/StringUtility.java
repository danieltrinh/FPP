/* QUESTION 1 */
package Lesson6Homework;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class StringUtility extends JFrame{
	
	private JButton countBtn = new JButton("Count Letters");
	private JButton reverseBtn = new JButton("Reverse Letters");
	private JButton removeBtn = new JButton("Remove Duplicates");
	private JTextField inputFld = new JTextField();
	private JTextField outputFld = new JTextField();
	
	private static final int BTN_WIDTH = 150;
	private static final int BTN_HEIGHT = 30;
	
	private static final int FLD_WIDTH = 200;
	private static final int FLD_HEIGHT = 30;
	
	StringUtility(String name)
	{
		super(name);
		Container panel = getContentPane();
		
		setSize(500,300);
		setResizable (false);
		
		panel.setLayout(null);
		
		countBtn.setBounds(30, 50, BTN_WIDTH, BTN_HEIGHT);
		panel.add(countBtn);
		countBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = inputFld.getText();
				outputFld.setText( countChars(input));
			}
			
			private String countChars (String s)
			{
				return String.valueOf(s.length());
			}
		});
		
		reverseBtn.setBounds(30, 100, BTN_WIDTH, BTN_HEIGHT);
		panel.add(reverseBtn);
		reverseBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = inputFld.getText();
				outputFld.setText( reverseChars (input));
			}
			
			private String reverseChars(String s)
			{
				StringBuilder rs = new StringBuilder();
				for(int i = s.length()-1; i >= 0; i--)
				{
					rs.append(s.charAt(i));
				}
				return rs.toString();
			}
		});
		
		removeBtn.setBounds(30, 150, BTN_WIDTH, BTN_HEIGHT);
		panel.add(removeBtn);
		removeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String input = inputFld.getText();
				outputFld.setText( removeDuplicates (input));
			}

			private String removeDuplicates(String s) {
				StringBuilder sb = new StringBuilder(s);
				int newSize = sb.length();
				
				for(int i = 0; i< newSize; i++)
				{
					for (int j = i+1; j < newSize; j++)
					{
						if(sb.charAt(i) == sb.charAt(j))
						{
							sb.setCharAt(j, sb.charAt(newSize-1));
							newSize--;
							j--;
						}
					}
				}
				String result = sb.substring(0, newSize);
				return result;
			}
		});
		
		JLabel l1 = new JLabel("Input");		
		l1.setBounds(200, 40, FLD_WIDTH, FLD_HEIGHT);
		panel.add(l1);
		inputFld.setBounds(200, 70, FLD_WIDTH, FLD_HEIGHT);
		panel.add(inputFld);
		
		JLabel l2 = new JLabel("Output");		
		l2.setBounds(200, 100, FLD_WIDTH, FLD_HEIGHT);
		panel.add(l2);
		outputFld.setBounds(200, 130, FLD_WIDTH, FLD_HEIGHT);
		panel.add(outputFld);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}

	public static void main(String[] args) {
		StringUtility su = new StringUtility("String Utility");
		su.setVisible(true);
	}
	
}
