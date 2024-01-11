package AlertTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Show_ConfirmTest extends Hooks {

    @Test
    public void showConfirmPageTest() {
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithJavaScript(0, 600);
        pages.getWebAutomationPage().clickOnAlertsElement();
        BrowserUtils.scrollDownWithJavaScript(0, -400);
        //click on confirm
        pages.getShowConfirm().clickOnShowConfirmElement();
        String expected = "Are you sure?";
        String actual = pages.getShowConfirm().getTheText();
        Assertions.assertEquals(expected, actual);
//
        pages.getShowConfirm().acceptTheAlert();
        BrowserUtils.wait(2);
        String expected2 = "Confirmed!";
        String actual2 = pages.getShowConfirm().getTheText();
        Assertions.assertEquals(expected2, actual2);
        BrowserUtils.wait(2);

        pages.getShowConfirm().acceptTheAlert();
        pages.getShowConfirm().clickOnShowConfirmElement();
        BrowserUtils.wait(2);
        pages.getShowConfirm().cancelTheAlert();


    }
}
