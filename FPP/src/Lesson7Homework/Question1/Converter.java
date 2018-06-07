package Lesson7Homework.Question1;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Converter extends JFrame{
	private JButton convertBtn = new JButton("Convert");
	
	private JTextField mileInput = new JTextField();
	private JTextField kmOutput = new JTextField();
	private JTextField poundInput = new JTextField();
	private JTextField kgOutput = new JTextField();
	private JTextField gallonInput = new JTextField();
	private JTextField literOutPut = new JTextField();
	private JTextField fInput = new JTextField();
	private JTextField cOutput = new JTextField();
	
	private static final int WIDTH = 100;
	private static final int HEIGHT = 30;
	
	Converter(String name)
	{
		super(name);
		
		Container panel = getContentPane();
		setSize(600,350);
		setResizable (false);
		
		panel.setLayout(null);
		
		// MILE
		JLabel l1 = new JLabel("Mile");
		l1.setBounds(50, 50, WIDTH, HEIGHT);
		panel.add(l1);
		mileInput.setBounds(150, 50, WIDTH, HEIGHT);
		panel.add(mileInput);
		
		// KM 
		JLabel l2 = new JLabel("Kilometer");
		l2.setBounds(300, 50, WIDTH, HEIGHT);
		panel.add(l2);
		kmOutput.setBounds(400, 50, WIDTH, HEIGHT);
		panel.add(kmOutput);
		
		// POUND
		JLabel l3 = new JLabel("Pound");
		l3.setBounds(50, 90, WIDTH, HEIGHT);
		panel.add(l3);
		poundInput.setBounds(150, 90, WIDTH, HEIGHT);
		panel.add(poundInput);
		
		// KG 
		JLabel l4 = new JLabel("Kilogram");
		l4.setBounds(300, 90, WIDTH, HEIGHT);
		panel.add(l4);
		kgOutput.setBounds(400, 90, WIDTH, HEIGHT);
		panel.add(kgOutput);
		
		// GALLON
		JLabel l5 = new JLabel("Gallon");
		l5.setBounds(50, 130, WIDTH, HEIGHT);
		panel.add(l5);
		gallonInput.setBounds(150, 130, WIDTH, HEIGHT);
		panel.add(gallonInput);
		
		// LITERS 
		JLabel l6 = new JLabel("Liters");
		l6.setBounds(300, 130, WIDTH, HEIGHT);
		panel.add(l6);
		literOutPut.setBounds(400, 130, WIDTH, HEIGHT);
		panel.add(literOutPut);
		
		// FARENHEIT
		JLabel l7 = new JLabel("Farenheit");
		l7.setBounds(50, 170, WIDTH, HEIGHT);
		panel.add(l7);
		fInput.setBounds(150, 170, WIDTH, HEIGHT);
		panel.add(fInput);
		
		// CELCIUS 
		JLabel l8 = new JLabel("Celcius");
		l8.setBounds(300, 170, WIDTH, HEIGHT);
		panel.add(l8);
		cOutput.setBounds(400, 170, WIDTH, HEIGHT);
		panel.add(cOutput);
		
		
		convertBtn.setBounds(250, 220, WIDTH, HEIGHT);
		panel.add(convertBtn);
		convertBtn.addActionListener(
				evt -> {
					double mile = Double.parseDouble(mileInput.getText());
					double km = mile * 1.60934 ;
					kmOutput.setText(String.format("%.2f", km));
					
					double pound = Double.parseDouble(poundInput.getText());
					double kg = pound * 0.453592;
					kgOutput.setText(String.format("%.2f", kg));
					
					double gallon = Double.parseDouble(gallonInput.getText());
					double liters = gallon * 3.78541;
					literOutPut.setText(String.format("%.2f", liters));
					
					double f = Double.parseDouble(fInput.getText());
					double c = (f - 32) / 1.8;
					cOutput.setText(String.format("%.2f", c));
				}
			);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
	
	public static void main(String[] args) {
		Converter c = new Converter("Metric Conversion Assistant");
		c.setVisible(true);
	}
}
