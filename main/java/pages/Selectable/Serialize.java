package pages.Selectable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Serialize extends BasePage {
    @FindBy(xpath = "//a[text()='Serialize']")
    private WebElement serializeElement;

    @FindBy(css = "#selectable-serialize > li")
    private List<WebElement> webElements;
    @FindBy(css = "#feedback-serialize")
    private WebElement text1;

    @FindBy(id = "select-result")
    private WebElement text2;

    public void clickOnSerializeElement(){
        serializeElement.click();
    }

    public void clickItems(int index) {
        webElements.get(index - 1).click();
    }

    public void clickItemsWithCtrl(int i1, int i2) throws InterruptedException {
        actions.keyDown(Keys.CONTROL).click(webElements.get(i1 - 1)).release().build().perform();
        actions.keyDown(Keys.CONTROL).click(webElements.get(i2 - 1)).release().build().perform();
        actions.keyUp(Keys.CONTROL).build().perform();

    }

    public boolean isSelected(int item) {
        return webElements.get(item - 1).getAttribute("class").contains("ui-selected");

    }

    public String getText() {
        return text1.getText();
    }

    public void clickWithMouse(int i1, int i2) {
        actions.clickAndHold(webElements.get(i1 - 1)).moveToElement(webElements.get(i2 - 1)).release().build().perform();
    }
}
















