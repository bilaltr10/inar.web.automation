package ResizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

public class TextAreaTest extends Hooks {

	Pages page = new Pages();

	int initialXOffset, initialYOffset, currentXOffset, currentYOffset;

	@Test
	public void textAreaTest() {

		page.getHomePage().clickOnWebAutomationLink();
		page.getWebAutomationPage().clickOnResizableElement();
		page.getTextArea().clickOnTexArea();

		// page down
		BrowserUtils.scrollDownWithJavaScript(0, 400);
		BrowserUtils.wait(1);

		// resize text area using bottom element
		initialXOffset = page.getTextArea().xOffSetOfElement();
		initialYOffset = page.getTextArea().yOffSetOfElement();

		page.getTextArea().resizeElementFromBottom(100, 50);

		currentXOffset = page.getTextArea().xOffSetOfElement();
		currentYOffset = page.getTextArea().yOffSetOfElement();

		// verify that text area only move vertically
		Assertions.assertEquals(initialXOffset, currentXOffset);
		Assertions.assertNotEquals(initialYOffset, currentYOffset);

		// resize text area using side element
		initialXOffset = page.getTextArea().xOffSetOfElement();
		initialYOffset = page.getTextArea().yOffSetOfElement();

		page.getTextArea().resizeElementFromSide(100, 100);

		currentXOffset = page.getTextArea().xOffSetOfElement();
		currentYOffset = page.getTextArea().yOffSetOfElement();

		// verify that text area only move vertically
		Assertions.assertNotEquals(initialXOffset, currentXOffset);
		Assertions.assertEquals(initialYOffset, currentYOffset);

		// resize text area, two-dimensionally
		initialXOffset = page.getTextArea().xOffSetOfElement();
		initialYOffset = page.getTextArea().yOffSetOfElement();

		page.getTextArea().resizeElementTwoDimension(100, 100);

		currentXOffset = page.getTextArea().xOffSetOfElement();
		currentYOffset = page.getTextArea().yOffSetOfElement();

		// verify that text area move vertically and horizontally
		Assertions.assertNotEquals(initialXOffset, currentXOffset);
		Assertions.assertNotEquals(initialYOffset, currentYOffset);

		// send keys to text
		page.getTextArea().write("bilal topal 4301");

		// verify that 'bilal topal 4301' is written
		String expectedText = "bilal topal 4301";
		String actualText = page.getTextArea().read();
		Assertions.assertEquals(expectedText, actualText, "we should see bilal topal 4301");

	}

}
