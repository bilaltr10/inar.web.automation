package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.*;
import utils.BrowserUtils;
import utils.Pages;

import static org.junit.jupiter.api.Assertions.*;

class Constrain_MovementTest extends Hooks {

    Pages page = new Pages();

    @BeforeEach
    public void openUpTheDraggablePage() {
        page.getHomePage().clickOnWebAutomationLink();
        page.getWebAutomationPage().clickOnDraggableElement();
        page.getConstrainMovementPage().clickOnConstrainMovement();
    }

    @Test
    public void onlyVerticallyMoveElementTest() {
        //check whether the element of draggable only vertically moves also horizontally by giving both offsets
        int startPointOfX = page.getConstrainMovementPage().getLocationOfDraggableX(1);
        int startPointOfY = page.getConstrainMovementPage().getLocationOfDraggableY(1);
        page.getConstrainMovementPage().enterTheOffsetOfOnlyVerticallyMovementElement(100, 100);
        int currentPointOfX = page.getConstrainMovementPage().getLocationOfDraggableX(1);
        int currentPointOfY = page.getConstrainMovementPage().getLocationOfDraggableY(1);
        //verify element move only vertically
        assertEquals(startPointOfX, currentPointOfX,"It is a only-vertically-movable element so it should not move in x axis ");
        assertNotEquals(startPointOfY, currentPointOfY,"It is a only-vertically-movable element so it should  move in y axis ");


        //check whether the element of draggable only horizontally moves also horizontally by giving both offsets
        int startPointOfXx = page.getConstrainMovementPage().getLocationOfDraggableX(2);
        int startPointOfYy = page.getConstrainMovementPage().getLocationOfDraggableY(2);
        page.getConstrainMovementPage().enterTheOffsetOfOnlyHorizontallyMovementElement(100, 100);
        int currentPointOfXx = page.getConstrainMovementPage().getLocationOfDraggableX(2);
        int currentPointOfYy = page.getConstrainMovementPage().getLocationOfDraggableY(2);
        //verify element move only horizontally
        BrowserUtils.wait(1);
        assertNotEquals(startPointOfXx, currentPointOfXx,"It is a only-horizontally-movable element so it should  move in x axis ");
        assertEquals(startPointOfYy+1, currentPointOfYy,"It is a only-horizontally-movable element so it should not move in y axis ");

        BrowserUtils.scrollDownWithJavaScript(0, 500);
   //     page.getConstrainMovementPage().enterTheOffsetOfContainedWithinTheBoxElement(85, 85);


    }


}