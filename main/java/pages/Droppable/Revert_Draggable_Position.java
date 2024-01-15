package pages.Droppable;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Revert_Draggable_Position extends BasePage {

	@FindBy(xpath = "//a[text()='Revert draggable position']")
	private WebElement revertDraggablePositionElement;

	@FindBy(id = "draggable-revert-draggable")
	private WebElement revertWhenDroppedElement;

	@FindBy(id = "draggable2-revert-draggable")
	private WebElement revertWhenNotDropped;

	@FindBy(id = "droppable-revert-draggable")
	private WebElement droppingAreaElement;

	public void clickOnRevertDraggablePositionElement() {
		revertDraggablePositionElement.click();
	}

	public void dropRevertWhenDroppedElement() {
		actions.dragAndDrop(revertWhenDroppedElement, droppingAreaElement).perform();
	}

	public void dropRevertWhenNotDropped() {
		actions.dragAndDrop(revertWhenNotDropped, droppingAreaElement).perform();
	}

	public void moveRevertWhenNotDroppedDefaultOffset() {
		actions.dragAndDropBy(revertWhenNotDropped, 100, -100).perform();
	}

	public int xOfRevertWhenDroppedElement() {
		return revertWhenDroppedElement.getLocation().getX();
	}

	public int yOfRevertWhenDroppedElement() {
		return revertWhenDroppedElement.getLocation().getY();
	}

	public int xOfRevertWhenNotDropped() {
		return revertWhenNotDropped.getLocation().getX();
	}

	public int yRevertWhenNotDropped() {
		return revertWhenNotDropped.getLocation().getY();
	}

}
