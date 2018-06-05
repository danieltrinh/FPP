package Lesson6Homework;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ColorButtons extends JFrame {

	private final static int BTN_WIDTH = 150;
	private final static int BTN_HEIGHT = 150;

	private Object[][] colorsAndMeanings = new Object[][] { { "RED", Color.RED,
			"Red signifies passion, vitality, enthusiasm and security. It is the light with the longest wavelength." },
			{ "ORANGE", Color.ORANGE,
					"This light or color is a combination of yellow and red. It is a dynamic color representing creativity, practicality, playfulness as well as equilibrium or control." },
			{ "YELLOW", Color.YELLOW,
					"This is the color of the sunshine itself. It represents clarity of thought, wisdom, orderliness and energy." },
			{ "GREEN", Color.GREEN,
					"This is the middle color of the rainbow and denotes fertility, growth, balance, health and wealth." },
			{ "BLUE", Color.BLUE,
					"This the fifth color of the rainbow which makes us think of the Unknown. The sky and the wide oceans are in this color and hence it has been associated with Spirituality and Divinity." },
			{ "WHITE", Color.WHITE,
					"It is believed that where Blue is calming, Indigo is sedating. Indigo is mystical as it bridges the Gap between Finite and Infinite. Indigo colored gem stones are often used for spiritual attainment, psychic abilities, self awareness and enhancement of Intuition." },
			{ "PINK", Color.PINK,
					"The last color of the rainbow is a mix of red and blue. It is considered the highest element of spirituality. It can ignite one’s imagination and be an inspiration to artists. Dark tones of violet are associated with sorrow. Deeper shades of violet or purple denote high spiritual mastery." }, };

	ColorButtons(String name) {
		super(name);
		Container panel = getContentPane();
		setSize(1150, 300);
		setResizable(true);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton[] btns = new JButton[7];

		JButton temp;
		String colorText;
		for (int i = 0; i < btns.length; i++) {
			temp = new JButton();

			temp.setPreferredSize(new Dimension(BTN_WIDTH, BTN_HEIGHT));
			temp.setBackground((Color) colorsAndMeanings[i][1]);
			colorText = (String) colorsAndMeanings[i][2];

			temp.addActionListener(new ColorEvent(colorText));

			btns[i] = temp;
			panel.add(btns[i]);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	// inner class with constructor to display color text
	class ColorEvent implements ActionListener {
		private String colorText;

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog((JButton) e.getSource(), colorText);
		}

		public ColorEvent(String text) {
			colorText = text;
		}
	};

	public static void main(String[] args) {
		ColorButtons cb = new ColorButtons("String Utility");
		cb.setVisible(true);
	}
}
