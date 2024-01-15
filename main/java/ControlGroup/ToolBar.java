package ControlGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.awt.event.ActionListener;
import java.util.List;

public class ToolBar extends BasePage {

    @FindBy(xpath = "//a[text()='Toolbar']")
    private WebElement toolbarElement;

    @FindBy(id = "page")
    WebElement pageElement;

    @FindBy(css = ".d-flex.flex-row.mb-4")
    private WebElement allTheToolsAtTop;

    @FindBy(xpath = "//button[normalize-space()='B']")
    private WebElement boldElement;

    @FindBy(xpath = "//button[normalize-space()='I']")
    private WebElement italicElement;

    @FindBy(xpath = "//button[normalize-space()='U']")
    private WebElement underlineElement;

    @FindBy(xpath = "//button[normalize-space()='Print']")
    private WebElement printElement;

    public void clickOnToolBar() {
        toolbarElement.click();
    }


    public void setZoom(String keys) {
        Select select = new Select(allTheToolsAtTop.findElement(By.cssSelector(" .form-select.me-2.bg-primary.text-fifth.fs-4:nth-child(1)")));
        select.selectByVisibleText(keys);
     //   allTheToolsAtTop.findElement(By.cssSelector(" .form-select.me-2.bg-primary.text-fifth.fs-4:nth-child(1)")).sendKeys(keys);
    }

    public void setHighlightColor(String colorAsHighlight) {
        allTheToolsAtTop.findElement(By.cssSelector(" " +
                ".form-select.me-2.bg-primary.text-fifth.fs-4:nth-child(2)")).sendKeys(colorAsHighlight);
    }

    public void setColorOfText(String colorOfText) {
        allTheToolsAtTop.findElement(By.cssSelector(" " +
                ".form-select.me-2.bg-primary.text-fifth.fs-4:nth-child(3)")).sendKeys(colorOfText);
    }

    public void clickOnBoldElement() {
        boldElement.click();
    }

    public void clickOnItalicElement() {
        italicElement.click();
    }

    public void clickOnUnderlineElement() {
        underlineElement.click();
    }

    public void clickOnPrintElement() {
        printElement.click();
    }

    public List<String> pageStyle() {
        String styleOfText =pageElement.getAttribute("style");
        return List.of(styleOfText.split(";"));
    }

    public String currentZoom() {
        return pageStyle().get(0).substring(pageStyle().get(0).indexOf(":") + 2);
    }

    public String currentFontStyle() {
        return pageStyle().get(4).substring(pageStyle().get(4).indexOf(":") + 2);

    }

    public String currentTextDecoration() {
        return pageStyle().get(5).substring(pageStyle().get(5).indexOf(":") + 2);
    }

    public String currentBackGroundColor() {
        return pageStyle().get(6).substring(pageStyle().get(6).indexOf(":") + 2);
    }

    public String currentFontWeight() {
        return pageStyle().get(3).substring(pageStyle().get(3).indexOf(":") + 2);
    }

    public String currentColor() {
        return pageStyle().get(7).substring(pageStyle().get(7).indexOf(":") + 2);
    }


}
