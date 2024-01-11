package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

public class HandlesTest extends Hooks {

    Pages page = new Pages();

    int xOffsetAsStart;
    int yOffsetAsStart;
    int xOffsetAsCurrent;
    int yOffSetAsCurrent;

    public void metot() {

    }

    @Test
    public void xxx() {

        page.getHomePage().clickOnWebAutomationLink();
        page.getWebAutomationPage().clickOnDraggableElement();
        BrowserUtils.wait(2);
        page.getTheHandlesPage().clickOnHandlesPage();
        BrowserUtils.scrollDownWithJavaScript(0,300);
        // Element -13 must move;
        xOffsetAsStart = page.getTheHandlesPage().getLocationOfDraggable13X();
        yOffsetAsStart = page.getTheHandlesPage().getLocationOfDraggable13Y();
        page.getTheHandlesPage().moveElement13();
        BrowserUtils.wait(2);
        xOffsetAsCurrent = page.getTheHandlesPage().getLocationOfDraggable13X();
        yOffSetAsCurrent = page.getTheHandlesPage().getLocationOfDraggable13Y();

        Assertions.assertNotEquals(xOffsetAsStart, xOffsetAsCurrent);
        Assertions.assertNotEquals(yOffsetAsStart, yOffSetAsCurrent);

        xOffsetAsStart = page.getTheHandlesPage().getLocationOfDraggable13X();
        yOffsetAsStart = page.getTheHandlesPage().getLocationOfDraggable13Y();
        page.getTheHandlesPage().moveElement13_2();
        BrowserUtils.wait(2);
        xOffsetAsCurrent = page.getTheHandlesPage().getLocationOfDraggable13X();
        yOffSetAsCurrent = page.getTheHandlesPage().getLocationOfDraggable13Y();

        Assertions.assertNotEquals(xOffsetAsStart, xOffsetAsCurrent);
        Assertions.assertNotEquals(yOffsetAsStart, yOffSetAsCurrent);

        BrowserUtils.wait(2);

        xOffsetAsStart = page.getTheHandlesPage().getLocationOfDraggable14X();
        yOffsetAsStart = page.getTheHandlesPage().getLocationOfDraggable14Y();
        page.getTheHandlesPage().moveElement14();
        BrowserUtils.wait(2);
        xOffsetAsCurrent = page.getTheHandlesPage().getLocationOfDraggable14X();
        yOffSetAsCurrent = page.getTheHandlesPage().getLocationOfDraggable14Y();

        Assertions.assertEquals(xOffsetAsStart, xOffsetAsCurrent);
        Assertions.assertEquals(yOffsetAsStart, yOffSetAsCurrent);


        xOffsetAsStart = page.getTheHandlesPage().getLocationOfDraggable14X();
        yOffsetAsStart = page.getTheHandlesPage().getLocationOfDraggable14Y();
        page.getTheHandlesPage().moveElement14_2();
        BrowserUtils.wait(2);
        xOffsetAsCurrent = page.getTheHandlesPage().getLocationOfDraggable14X();
        yOffSetAsCurrent = page.getTheHandlesPage().getLocationOfDraggable14Y();

        Assertions.assertNotEquals(xOffsetAsStart, xOffsetAsCurrent);
        Assertions.assertNotEquals(yOffsetAsStart, yOffSetAsCurrent);
    }


}
