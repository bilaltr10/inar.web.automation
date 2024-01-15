package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class BrowserUtils {

	private static Actions action = new Actions(Driver.getDriver());

	public static void scrollUpWithPageUp() {
		action.keyDown(Keys.PAGE_DOWN).release().build().perform();
		wait(1);
	}

	public static void scrollDownWithPageDown() {
		action.keyDown(Keys.PAGE_DOWN).release().build().perform();
		wait(1);
	}

	public static void wait(double timeOut) {
		try {
			Thread.sleep((long) (timeOut * 1000));
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public static void wait(int timeOut) {
		try {
			Thread.sleep(timeOut * 1000L);
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public static String getTitle() {
		return Driver.getDriver().getTitle();
	}

	public static void scrollDownWithJavaScript(int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
		js.executeScript("window.scrollBy(" + x + "," + y + ");");
		wait(1);
	}

}
