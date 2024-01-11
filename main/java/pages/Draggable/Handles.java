package pages.Draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Handles extends BasePage {

    @FindBy(xpath = "//a[text()='Handles']")
    private WebElement handlesWebElement;
    @FindBy(id = "draggable13")
    private WebElement draggable13Element;

    @FindBy(id = "draggable14")
    private WebElement draggable14Element;

    @FindBy(xpath = "//*[@id=\"draggable14\"]/p[2]")
    private WebElement draggable14NonMovableElement;
    @FindBy(xpath = "//*[@id=\"draggable14\"]/p[1]")
    private WebElement draggable14MovableElement;

    @FindBy(xpath = "//*[@id=\"draggable13\"]/p")
    private WebElement draggable13MovableElement;

    public void clickOnHandlesPage() {
        handlesWebElement.click();
    }


    public void moveElement13() {
        actions.dragAndDropBy(draggable13Element, 100, 100).perform();
    }

    public void moveElement13_2() {
        actions.dragAndDropBy(draggable13MovableElement, 100, 100).perform();
    }

    public int getLocationOfDraggable13X() {
        return draggable13Element.getLocation().x;
    }

    public int getLocationOfDraggable13Y() {
        return draggable13Element.getLocation().y;
    }


    public void moveElement14() {
        actions.dragAndDropBy(draggable14NonMovableElement, 100, 100).perform();
    }

    public void moveElement14_2() {
        actions.dragAndDropBy(draggable14MovableElement, 100, 100).perform();
    }

    public int getLocationOfDraggable14X() {
        return draggable14Element.getLocation().x;
    }

    public int getLocationOfDraggable14Y() {
        return draggable14Element.getLocation().y;
    }

}
