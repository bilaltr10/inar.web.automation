package IFrameTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class NormalIframeTest extends Hooks {
    @Test
    void testNestedIframe() {
        //1. Land on home page
        //2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();

        //3.Click on Iframe link
        pages.getWebAutomationPage().clickOnIframeElement();

        BrowserUtils.scrollUpWithPageUp();

        //4.Click on Normal Iframe link
        pages.getNormalPage().clickOnNormalIFrame();

        //5.Verify that the header text "Join Inar Academy'sIntro Session" In iframe
        String expectedHeader = "Inar academy";
        String actualHeader = pages.getNormalPage().getHeaderInFrame();
        Assertions.assertEquals(expectedHeader, actualHeader, "Wrong Header !");




    }
}
