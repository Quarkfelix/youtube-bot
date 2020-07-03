package gui;

import java.awt.Color;

import javax.swing.JFrame;

import io.KeyHandler;

public class GUI extends JFrame{
	public JFrame jf;
	public static Draw draw;
	
	public GUI() {
		jf = new JFrame();
		draw = new Draw();
		setup();
	}
	
	public void setup() {
		jf.setSize(200, 200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBackground(Color.BLACK);
		jf.add(draw);
		jf.addKeyListener(new KeyHandler());
		jf.setVisible(true);
	}
}
