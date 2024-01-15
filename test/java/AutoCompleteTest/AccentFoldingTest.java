package AutoCompleteTest;

import BaseTest.Hooks;
import org.checkerframework.checker.lock.qual.Holding;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.List;

public class AccentFoldingTest extends Hooks {

	@Test
	public void accentFoldingTest() {

		pages.getHomePage().clickOnWebAutomationLink();
		pages.getWebAutomationPage().clickOnAutoCompleteElement();
		pages.getAccentFolding().clickOnAccentFoldingElement();

		// send 'jo' as keys
		pages.getAccentFolding().addInput("jo");
		String[] expected = new String[] { "Jörn Zaefferer", "John Resig" };
		List<String> actual = pages.getAccentFolding().namesOfDevelopers();

		// verify that when 'jo' sent as key two different names showed
		for (int i = 0; i < actual.size(); i++) {
			Assertions.assertEquals(expected[i], actual.get(i));
		}
		// verify that when 'jö' sent as keys only one name appears
		pages.getAccentFolding().addInput("jö");
		String expected2 = "Jörn Zaefferer";
		List<String> actual2 = pages.getAccentFolding().namesOfDevelopers();
		for (int i = 0; i < actual2.size(); i++) {
			Assertions.assertEquals(expected2, actual2.get(i));
		}

	}

}
