package infrastructure;

import gui.GUI;
import gui.RepaintThread;
import screenshot.Bot;

public class Main {
	public static GUI gui;
	public static Bot bot;
	
	public static void main(String[] args) {
		gui = new GUI();
		RepaintThread rt = new RepaintThread();
		rt.start();
		bot = new Bot();
		System.out.println("done");
	}
}
