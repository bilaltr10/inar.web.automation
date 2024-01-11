package pages.Draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Constrain_Movement extends BasePage {
    @FindBy(xpath = "//a[contains(text(),'Constrain Movement')]")
    WebElement constrainMovementElement;
    @FindBy(id = "containment-wrapper")
    WebElement containmentWrapperElement;
    @FindBy(id = "draggable5")
    private WebElement onlyVerticallyMovementElement;
    @FindBy(id = "draggable6")
    private WebElement onlyHorizontallyMovementElement;
    @FindBy(id = "draggable7")
    private WebElement containedWithinTheBoxElement;
    @FindBy(id = "draggable8")
    private WebElement containedWithinParentElement;

    public void clickOnConstrainMovement() {
        constrainMovementElement.click();
    }

    public void enterTheOffsetOfOnlyVerticallyMovementElement(int xOffset, int yOffset) {
        actions.dragAndDropBy(onlyVerticallyMovementElement, xOffset, yOffset).build().perform();
    }

    public void enterTheOffsetOfOnlyHorizontallyMovementElement(int xOffset, int yOffset) {
        actions.dragAndDropBy(onlyHorizontallyMovementElement, xOffset, yOffset).build().perform();
    }

    public int getLocationOfDraggableX(int thElement) {
        return switch (thElement) {
            case 2 -> onlyHorizontallyMovementElement.getLocation().x;
            case 3 -> containedWithinTheBoxElement.getLocation().x;
            case 4 -> containedWithinParentElement.getLocation().x;
            default -> onlyVerticallyMovementElement.getLocation().x;
        };
    }


    public int getLocationOfDraggableY(int thElement) {
        return switch (thElement) {
            case 2 -> onlyHorizontallyMovementElement.getLocation().y;
            case 3 -> containedWithinTheBoxElement.getLocation().y;
            case 4 -> containedWithinParentElement.getLocation().y;
            default -> onlyVerticallyMovementElement.getLocation().y;
        };
    }

    public void switchToDomElement() {
        DRIVER.switchTo().frame(containmentWrapperElement);
    }

    public void enterTheOffsetOfContainedWithinTheBoxElement(int xOffset, int yOffset) {
        switchToDomElement();
        actions.dragAndDropBy(containedWithinTheBoxElement, xOffset, yOffset).perform();
    }

}

