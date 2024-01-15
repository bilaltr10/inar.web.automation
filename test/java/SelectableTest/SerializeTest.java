package SelectableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SerializeTest extends Hooks {

	@Test
	void testSelectableDefFunc() throws InterruptedException {
		// 1. Open the browser and navigate to the URL+
		// 2. Click on webautomation link
		pages.getHomePage().clickOnWebAutomationLink();

		// 3. Click on Selectable button
		pages.getWebAutomationPage().clickOnSelectableElement();
		// 4. Click on Serialize button
		pages.getSerializePage().clickOnSerializeElement();

		// 5. Click on Item 5
		pages.getSerializePage().clickItems(5);

		// 6. Verify that Item 5 is selected
		assertTrue(pages.getSerializePage().isSelected(5), "Not selected");

		// 7. Verify that "You've selected: #5" is displayed
		String expectedResult = "You've selected: #5.";
		String actualResult = pages.getSerializePage().getText();
		assertEquals(expectedResult, actualResult, "Wrong Text!");

		// 8. Click on Item 6
		pages.getSerializePage().clickItems(3);

		// 9. Verify that Item 6 is selected
		assertTrue(pages.getSerializePage().isSelected(6), "Not selected");

		// 10. Verify that "You've selected: #6" is displayed
		String expectedResult2 = "You've selected: #6.";
		String actualResult2 = pages.getSerializePage().getText();
		assertEquals(expectedResult2, actualResult2, "Wrong Text!");

		// BrowserUtils.scrollUpWithPageUp();
		BrowserUtils.wait(1.0);

		// 11. Click on Item 1, Item 3 by holding down the Ctrl key
		pages.getSerializePage().clickItemsWithCtrl(1, 3);

		// 12. Verify that Item 1, Item 3 are selected
		assertTrue(pages.getSerializePage().isSelected(1), "Not selected");
		assertTrue(pages.getSerializePage().isSelected(3), "Not selected");

		// 13. Verify that "You've selected: #1 #3 #6" is displayed(6 selected because
		// Item 6 is still selected)
		String expectedResult3 = "You've selected: #1 #3 #6.";
		String actualResult3 = pages.getSerializePage().getText();
		assertEquals(expectedResult3, actualResult3, "Wrong Text!");

		// 14. Click on Item 1, Item2, Item 3 by holding mouse down and dragging
		pages.getSerializePage().clickWithMouse(1, 3);

		// 15. Verify that Item 1, Item 2, Item 3 are selected
		assertTrue(pages.getSerializePage().isSelected(1), "Not selected");
		assertTrue(pages.getSerializePage().isSelected(2), "Not selected");
		assertTrue(pages.getSerializePage().isSelected(3), "Not selected");

		// 6. Verify that "You've selected: #1 #2 #3" is displayed
		String expectedResult4 = "You've selected: #1 #2 #3.";
		String actualResult4 = pages.getSerializePage().getText();
		assertEquals(expectedResult4, actualResult4, "Wrong Text!");

	}

}
