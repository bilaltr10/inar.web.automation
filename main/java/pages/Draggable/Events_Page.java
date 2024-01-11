package pages.Draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.time.Duration;

import static java.time.Clock.tick;

public class Events_Page extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Events')]")
    private WebElement eventsWebelement;

    @FindBy(id = "draggable12")
    private WebElement draggableWebelement;

    @FindBy(id = "event-start")
    private WebElement eventStartedElement;
    @FindBy(xpath = "//*[@id=\"event-start\"]/span[2]")
    private WebElement countOfEventStartInvokedElement;

    @FindBy(xpath = "//*[@id=\"event-drag\"]/span[2]")
    private WebElement countOfDragInvokedElement;

    @FindBy(xpath = "//*[@id=\"event-stop\"]/span[2]")
    private WebElement countOfStopInvoked;

    private int xOffset;
    private int yOffset;

    public void clickOnEventsPage() {
        eventsWebelement.click();
    }

    public void dropAndDragWebElement(int xOffset, int yOffset) {
        this.xOffset = xOffset;
        this.yOffset = yOffset;
        actions.dragAndDropBy(draggableWebelement, xOffset, yOffset).perform();
    }

    public int numberOfStartInvocation() {
        return Integer.parseInt(countOfEventStartInvokedElement.getText());
    }

    public int numberOfDragInvokation() {
        return Math.abs(xOffset + yOffset);
    }

    public int numberOfStopInvocation() {
        return Integer.parseInt(countOfStopInvoked.getText());
    }




}

