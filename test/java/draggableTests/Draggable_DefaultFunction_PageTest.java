package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

class Draggable_DefaultFunction_PageTest extends Hooks {

	Pages pages = new Pages();

	@Test
	public void draggableWithDefaultOffsetTest() {
		pages.getHomePage().clickOnWebAutomationLink();
		pages.getWebAutomationPage().clickOnDraggableElement();
		BrowserUtils.scrollDownWithJavaScript(0, 400);
		BrowserUtils.wait(1);
		int x = 50;
		int y = 40;
		for (int i = 0; i < 3; i++) {
			x += 5;
			y += 5;
			int currentXOffset = pages.getDraggableDefFuncPage().getLocationOfDraggableX();
			int currentYOffset = pages.getDraggableDefFuncPage().getLoçationOfDraggableY();
			pages.getDraggableDefFuncPage().dragAndDropByOffsets(x, y);
			BrowserUtils.wait(1);
			int newXOffset = pages.getDraggableDefFuncPage().getLocationOfDraggableX();
			int newYOffset = pages.getDraggableDefFuncPage().getLoçationOfDraggableY();
			Assertions.assertTrue(newXOffset > currentXOffset);
			Assertions.assertTrue(newYOffset > currentYOffset);
		}

	}

}