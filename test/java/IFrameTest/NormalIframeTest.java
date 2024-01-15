package IFrameTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class NormalIframeTest extends Hooks {

	@Test
	void testNestedIframe() {
		// 1. Land on home page
		// 2. Click on webautomation link
		pages.getHomePage().clickOnWebAutomationLink();

		BrowserUtils.scrollDownWithPageDown();

		// 3.Click on Iframe link
		pages.getWebAutomationPage().clickOnIframeElement();
		// BrowserUtils.scrollUpWithPageUp();
		BrowserUtils.scrollDownWithJavaScript(0, -500);

		// 4.Click on Normal Iframe link
		pages.getNormalPage().clickOnNormalIFrame();

		// 5.Verify that the header text "Join Inar Academy'sIntro Session" In iframe
		String expectedHeader = "Inar academy";
		pages.getNormalPage().switchToIFrame();
		String actualHeader = pages.getNormalPage().getHeaderInFrame();
		Assertions.assertEquals(expectedHeader, actualHeader, "Wrong Header !");

		// 6.Verify that the link text "More information..." In frame
		String expectedLinkText = "More information...";
		String actualLinkText = pages.getNormalPage().getLinkTextInFrame();
		Assertions.assertEquals(expectedLinkText, actualLinkText, "Wrong Link Text !");

		// 7.Verify that the link is "https://www.iana.org/domains/example"
		String expectedLink = "https://www.iana.org/domains/example";
		String actualLink = pages.getNormalPage().getLinkInFrame();
		Assertions.assertEquals(expectedLink, actualLink, "Wrong Link !");

	}

}
