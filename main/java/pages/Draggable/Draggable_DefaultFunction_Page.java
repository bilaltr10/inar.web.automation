package pages.Draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Draggable_DefaultFunction_Page extends BasePage {

	@FindBy(id = "draggable")
	WebElement draggableElement;

	public void dragAndDrop() {
		actions.dragAndDropBy(draggableElement, 150, 100).

			perform();

	}

	public void dragAndDropByOffsets(int xOffset, int yOffset) {
		actions.dragAndDropBy(draggableElement, xOffset, yOffset).perform();

	}

	public int getLocationOfDraggableX() {
		return draggableElement.getLocation().x;
	}

	public int getLoçationOfDraggableY() {
		return draggableElement.getLocation().y;
	}

}
