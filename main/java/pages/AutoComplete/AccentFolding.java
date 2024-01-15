package pages.AutoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccentFolding extends BasePage {

    @FindBy(xpath = "//a[text()='Accent Folding']")
    private WebElement accentFoldingElement;

    @FindBy(id = "developer-accentFolding")
    private WebElement developerNamesElement;

    @FindBy(xpath = "//ul[@id='ui-id-40']/li/div")
    private List<WebElement> namesOfDeveloper;


    public void clickOnAccentFoldingElement() {
        accentFoldingElement.click();
    }

    public void addInput(String keys) {
        clearInput();
        developerNamesElement.sendKeys(keys);
        BrowserUtils.wait(1.5);
    }

    public void clearInput() {
        developerNamesElement.clear();
    }

    public List<String> namesOfDevelopers() {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < namesOfDeveloper.size(); i++) {
            list.add(namesOfDeveloper.get(i).getText());
        }
return list;

    }


}
