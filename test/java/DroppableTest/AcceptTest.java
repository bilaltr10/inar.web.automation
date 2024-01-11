package DroppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import utils.BrowserUtils;
import utils.Pages;

public class AcceptTest extends Hooks {

    Pages page = new Pages();

    @Test
    public void fromDroppableAcceptFunctionTest() {
        int initialX, initialY, currentY, currentX;
        //create two string for following test
        String actual, expected;


        page.getHomePage().clickOnWebAutomationLink();
        page.getWebAutomationPage().clickOnDroppableElement();
        page.getAcceptPage().clickOnAcceptPage();

        //verify that not droppable object is not droppable
        page.getAcceptPage().moveTheDraggableButNonDroppableElementToAcceptance();
        expected = "Dropped!";
        actual = page.getAcceptPage().droppedMessage();
        Assertions.assertNotEquals(expected, actual);

        //verify drag but not droppable element dragging with default offset
        initialX = page.getAcceptPage().xOfDragButNotDroppable();
        initialY = page.getAcceptPage().yOfDragButNotDroppable();

        page.getAcceptPage().moveTheDraggableButNonDroppableElementDefaultOffset();

        currentX = page.getAcceptPage().xOfDragButNotDroppable();
        currentY = page.getAcceptPage().yOfDragButNotDroppable();

        Assertions.assertTrue(initialX != currentX);
        Assertions.assertTrue(initialY != currentY);

        //verify drag but not droppable element dragging with given offset

        initialX = page.getAcceptPage().xOfDragButNotDroppable();
        initialY = page.getAcceptPage().yOfDragButNotDroppable();

        page.getAcceptPage().moveTheDraggableButNonDroppableElementWithOffset(45, -65);

        currentX = page.getAcceptPage().xOfDragButNotDroppable();
        currentY = page.getAcceptPage().yOfDragButNotDroppable();
        BrowserUtils.wait(3);

        Assertions.assertTrue(initialX != currentX);
        Assertions.assertTrue(initialY != currentY);

        //verify that  droppable object is droppable
        page.getAcceptPage().moveTheDraggableAndDroppableElementToAcceptance();
        expected = "Dropped!";
        actual = page.getAcceptPage().droppedMessage();
        Assertions.assertEquals(expected, actual);

        //verify drag and droppable element dragging with default values
        initialX = page.getAcceptPage().xOfDragAndDroppable();
        initialY = page.getAcceptPage().yOfDragAndDroppable();

        page.getAcceptPage().moveTheDraggableAndDroppableElementWithDefaultOffset();

        currentX = page.getAcceptPage().xOfDragAndDroppable();
        currentY = page.getAcceptPage().yOfDragAndDroppable();
        BrowserUtils.wait(3);

        Assertions.assertTrue(initialX != currentX);
        Assertions.assertTrue(initialY != currentY);

        //verify drag and droppable element dragging with offset taken from user
        initialX = page.getAcceptPage().xOfDragAndDroppable();
        initialY = page.getAcceptPage().yOfDragAndDroppable();

        page.getAcceptPage().moveTheDraggableAndDroppableElementWithOffset(-125, -85);

        currentX = page.getAcceptPage().xOfDragAndDroppable();
        currentY = page.getAcceptPage().yOfDragAndDroppable();
        BrowserUtils.wait(3);

        Assertions.assertTrue(initialX != currentX);
        Assertions.assertTrue(initialY != currentY);

    }
}
