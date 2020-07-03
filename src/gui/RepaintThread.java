package gui;

public class RepaintThread extends Thread{

	public void run() {
		while (true) {
			GUI.draw.repaint();
		}
	}
}
