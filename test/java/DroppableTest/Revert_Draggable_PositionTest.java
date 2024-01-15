package DroppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

public class Revert_Draggable_PositionTest extends Hooks {

	Pages page = new Pages();

	@Test
	public void revertDraggablePositionTest() {
		int initialX, initialY, currentX, currentY;

		page.getHomePage().clickOnWebAutomationLink();
		page.getWebAutomationPage().clickOnDroppableElement();
		page.getRevertDraggablePosition().clickOnRevertDraggablePositionElement();

		// 'I revert when I am dropped element drop and verify it turns back'
		initialX = page.getRevertDraggablePosition().xOfRevertWhenDroppedElement();
		initialY = page.getRevertDraggablePosition().yOfRevertWhenDroppedElement();

		page.getRevertDraggablePosition().dropRevertWhenDroppedElement();
		BrowserUtils.wait(1);
		currentX = page.getRevertDraggablePosition().xOfRevertWhenDroppedElement();
		currentY = page.getRevertDraggablePosition().yOfRevertWhenDroppedElement();

		// verify it turned back
		Assertions.assertTrue(Math.abs(initialX - currentX) < 5);
		Assertions.assertTrue(Math.abs(initialY - currentY) < 5);

		// 'I revert when I am not dropped element will be dropped and verify it turns to
		// drop area'
		// move the element drop area
		page.getRevertDraggablePosition().dropRevertWhenNotDropped();
		BrowserUtils.wait(1);

		// move element randomly out of box
		initialX = page.getRevertDraggablePosition().xOfRevertWhenNotDropped();
		initialY = page.getRevertDraggablePosition().yRevertWhenNotDropped();

		page.getRevertDraggablePosition().moveRevertWhenNotDroppedDefaultOffset();
		BrowserUtils.wait(1);

		currentX = page.getRevertDraggablePosition().xOfRevertWhenNotDropped();
		currentY = page.getRevertDraggablePosition().yRevertWhenNotDropped();
		// verify that element turned back
		Assertions.assertTrue(Math.abs(initialX - currentX) < 5);
		Assertions.assertTrue(Math.abs(initialY - currentY) < 5);
	}

}
