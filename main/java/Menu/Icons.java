package Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class Icons extends BasePage {

    @FindBy(xpath = "//*[text()='Icons']")
    private WebElement iconsElement;

    @FindBy(id = "//*[@id=\"menu-w-icons\"]/li[1]")
    private WebElement saveElement;


    @FindBy(id = "//*[@id=\"menu-w-icons\"]/li[2]")
    private WebElement zoomInElement;

    @FindBy(id = "//*[@id=\"menu-w-icons\"]/li[3]")
    private WebElement zoomOutElement;

    @FindBy(xpath = "//*[@id=\"menu-w-icons\"]/li[5]")
    private WebElement playBackElement;

    @FindBy(xpath = "//*[@id=\"menu-w-icons\"]/li[5]")
    private WebElement menuInfoElement;
    public void clickOnIconsElement() {
        iconsElement.click();
    }


    private boolean isListPresentUnderDiv(WebElement divElement) {
        try {
            // Check if there is a ul or ol element under the specified div
            divElement.findElement(By.xpath(".//ul | .//ol"));
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // If no ul or ol element is found, return false
            return false;
        }
    }

    public boolean isSaveConvertibleIntoSelectedMenu() {
       if (isListPresentUnderDiv(saveElement))
            return saveElement.findElement(By.xpath(".//ul | .//ol")).isEnabled();
       return false;
    }

    public boolean isPlayBackConvertibleIntoSelectedMenu() {
       if (isListPresentUnderDiv(playBackElement))
            return playBackElement.findElement(By.xpath(".//ul | .//ol")).isEnabled();
       return false;
    }

    public boolean isZoomInElementConvertibleIntoSelectedMenu() {
        if (isListPresentUnderDiv(saveElement))
            return zoomInElement.findElement(By.xpath(".//ul | .//ol")).isEnabled();
        return false;
    }

    public boolean isZoomOutElementConvertibleIntoSelectedMenu() {
        if (isListPresentUnderDiv(saveElement))
            return zoomOutElement.findElement(By.xpath(".//ul | .//ol")).isEnabled();
        return false;
    }

    public boolean isMenuInfoElementConvertibleIntoSelectedMenu() {
        if (isListPresentUnderDiv(saveElement))
            return menuInfoElement.findElement(By.xpath(".//ul | .//ol")).isEnabled();
        return false;
    }
}