package pages.Droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonMethods;
import pages.HomePage;

public class Accept extends HomePage {

    @FindBy(xpath = "//a[text()='Accept']")
    private WebElement acceptPageElement;

    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement draggableButNonDroppableElement;

    @FindBy(id = "draggable-accept")
    private WebElement draggableAndDroppableElement;

    @FindBy(id = "droppable-accept")
    private WebElement dropAcceptanceElement;


    public void clickOnAcceptPage() {
        acceptPageElement.click();
    }


    public void moveTheDraggableButNonDroppableElementWithOffset(int xOffset, int yOffset) {
        actions.dragAndDropBy(draggableButNonDroppableElement,xOffset, yOffset).perform();
    }

    public void moveTheDraggableButNonDroppableElementDefaultOffset() {
        actions.dragAndDropBy(draggableButNonDroppableElement,15, 15).perform();
    }

    public void moveTheDraggableAndDroppableElementWithOffset(int xOffset, int yOffset) {
        actions.dragAndDropBy(draggableAndDroppableElement, xOffset, yOffset).perform();
    }

    public void moveTheDraggableAndDroppableElementWithDefaultOffset() {
        actions.dragAndDropBy(draggableAndDroppableElement, 15, 15).perform();
    }

    public void moveTheDraggableAndDroppableElementToAcceptance() {
        actions.dragAndDrop(draggableAndDroppableElement, dropAcceptanceElement).perform();
    }

    public void moveTheDraggableButNonDroppableElementToAcceptance() {
        actions.dragAndDrop(draggableButNonDroppableElement, dropAcceptanceElement).perform();
    }

    public String droppedMessage() {
        return dropAcceptanceElement.getText();
    }

    public int xOfDragAndDroppable() {
        return draggableAndDroppableElement.getLocation().getX();
    }

    public int yOfDragAndDroppable() {
        return draggableAndDroppableElement.getLocation().getY();
    }

    public int xOfDragButNotDroppable() {
        return draggableButNonDroppableElement.getLocation().getX();
    }

    public int yOfDragButNotDroppable() {
        return draggableButNonDroppableElement.getLocation().getY();
    }
}
