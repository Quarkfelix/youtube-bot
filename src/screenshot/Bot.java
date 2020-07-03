package screenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Bot extends Thread{
	public Robot bot;
	
	public void run() {
		try {
			bot = new Robot();
			while (true) {
				bot.mouseMove(1860, 160);
				click();
				bot.mouseMove(1800, 620);
				click();
				bot.mouseMove(800, 640);
				click();
				bot.mouseMove(50, 300);
				click();
				bot.mouseMove(820, 470);
				click();
				username();
				bot.mouseMove(820, 530);
				click();
				//go to video
				Thread.sleep(8000);
				
				bot.mouseMove(800, 70);
				click();
				write("https://www.youtube.com/watch?v=p3_kJtApYKM");
				bot.mouseMove(500, 460);
				click();
				
				Thread.sleep(10000);
				liken();
				Thread.sleep(10000);
			}
			
		} catch (AWTException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void click() {
		bot.delay(700);
		bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(123);
		bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		bot.delay(300);
	}
	
	public void username() {
		bot.delay(700);
		for (int i = 0; i < 20; i++) {
			int numb = (int)((Math.random()) * 25 + 65);
			bot.keyPress(numb);
			bot.delay(100);
			bot.keyRelease(numb);
			bot.delay(200);
		}	
	}
	
	private void liken() {
		bot.mouseMove(1005, 1000);
		click();
	}
	
	private void write(String text) {
		for (int i = 0; i < 100; i++) {
			try {
				type(text.charAt(i));
				System.out.println(text.charAt(i));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.delay(100);
		bot.keyRelease(KeyEvent.VK_ENTER);
		bot.delay(100);
	}
	
	private void type(char c) {
		int delay = 100;
		try {
			switch (c) {
			case ':':
				bot.keyPress(KeyEvent.VK_SHIFT);
				bot.keyPress(KeyEvent.VK_COLON);
				bot.keyRelease(KeyEvent.VK_COLON);
				bot.keyRelease(KeyEvent.VK_SHIFT);
				break;
			
			case '/':
				bot.keyPress(KeyEvent.VK_SHIFT);
				bot.keyPress(KeyEvent.VK_SLASH);
				bot.keyRelease(KeyEvent.VK_SLASH);
				bot.keyRelease(KeyEvent.VK_SHIFT);
				break;
			
			case '=':
				bot.keyPress(KeyEvent.VK_SHIFT);
				bot.keyPress(KeyEvent.VK_EQUALS);
				bot.keyRelease(KeyEvent.VK_EQUALS);
				bot.keyRelease(KeyEvent.VK_SHIFT);
				break;
				
			case '_':
				bot.keyPress(KeyEvent.VK_SHIFT);
				bot.keyPress(KeyEvent.VK_UNDERSCORE);
				bot.keyRelease(KeyEvent.VK_UNDERSCORE);
				bot.keyRelease(KeyEvent.VK_SHIFT);
				break;
				
			case '?':
				bot.keyPress(KeyEvent.VK_SHIFT);
				bot.keyPress(KeyEvent.VK_BACK_SLASH);
				bot.keyRelease(KeyEvent.VK_BACK_SLASH);
				bot.keyRelease(KeyEvent.VK_SHIFT);
				break;
				
			default:
				if (Character.isUpperCase(c)) {
					bot.keyPress(KeyEvent.VK_SHIFT);
				}
				bot.keyPress(java.awt.event.KeyEvent.getExtendedKeyCodeForChar(c));
				bot.delay(delay);
				bot.keyRelease(java.awt.event.KeyEvent.getExtendedKeyCodeForChar(c));
				bot.delay(delay);
				bot.keyRelease(KeyEvent.VK_SHIFT);
				break;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
