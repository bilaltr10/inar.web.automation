package AlertTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Show_PropmtTest extends Hooks {

    @Test
    public void showPromptTest() {
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithJavaScript(0, 500);
        pages.getWebAutomationPage().clickOnAlertsElement();
        BrowserUtils.scrollDownWithJavaScript(0, -400);
        pages.getShowPrompt().clickOnShowPrompt();
       //verify first message is 'Are you sure'
        String expected2 = "Enter your name:";
        String actual2 = pages.getShowPrompt().getText();
        Assertions.assertEquals(expected2, actual2);
        //send keys as 'bilal' and accept the alert
        pages.getShowPrompt().sendKeys("bilal");
        pages.getShowPrompt().acceptTheAlert();
        //verify that alert message is 'Hello, bilal!'
        String expected = "Hello, bilal!";
        String actual = pages.getShowPrompt().getText();
        Assertions.assertEquals(expected, actual);

    }
}
