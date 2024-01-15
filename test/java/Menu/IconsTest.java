package Menu;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.Draggable.Handles;
import utils.BrowserUtils;

public class IconsTest extends Hooks {

	boolean expected, actual;

	@Test
	public void iconsTest() {
		pages.getHomePage().clickOnWebAutomationLink();
		BrowserUtils.scrollDownWithJavaScript(0, 300);

		pages.getWebAutomationPage().clickOnMenuElement();
		BrowserUtils.scrollDownWithJavaScript(0, -300);

		pages.getIcons().clickOnIconsElement();
		// verify is save element converted into selectable menu items
		expected = false;
		actual = pages.getIcons().isSaveConvertibleIntoSelectedMenu();
		Assertions.assertEquals(expected, actual, "Save element doesn't have selectable menu item");
		// is zoom in element converted into selectable menu items
		expected = false;
		actual = pages.getIcons().isZoomInElementConvertibleIntoSelectedMenu();
		Assertions.assertEquals(expected, actual, "Zoom in  element doesn't have selectable menu item");
		// is zoom out element converted into selectable menu items
		expected = false;
		actual = pages.getIcons().isZoomOutElementConvertibleIntoSelectedMenu();
		Assertions.assertEquals(expected, actual, "Zoom out element doesn't have selectable menu item");
		// is playback element converted into selectable menu items
		expected = true;
		actual = pages.getIcons().isPlayBackConvertibleIntoSelectedMenu();
		Assertions.assertEquals(expected, actual, "Playback element has selectable menu item");
		// is textInfo element converted into selectable menu items
		expected = false;
		actual = pages.getIcons().isMenuInfoElementConvertibleIntoSelectedMenu();
		Assertions.assertEquals(expected, actual, "TextInfo element doesn't have selectable menu item");
	}

}