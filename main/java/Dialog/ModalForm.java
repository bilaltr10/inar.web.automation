package Dialog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModalForm extends BasePage {

    @FindBy(xpath = "//a[text()='Modal Form']")
    private WebElement modalFormElement;

    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountElement;

    public void clickOnModalFormElement() {
        modalFormElement.click();
    }

    @FindBy(id = "name")
    private WebElement nameElement;

    @FindBy(id = "surname")
    private WebElement surnameElement;

    @FindBy(id = "email")
    private WebElement emailElement;
    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitElement;
    @FindBy(css = ".ui-widget.ui-widget-content.mb-4")
    private WebElement userDataElement;

    public void clickOnCreateAccountElement() {
        createAccountElement.click();
        BrowserUtils.wait(1);
    }

    public void cleanTheInfos() {
        createAccountElement.click();
        nameElement.clear();
        surnameElement.clear();
        emailElement.clear();
    }

    public void setTheAccountInfos(String name, String surname, String email) {
        nameElement.sendKeys(name);
        surnameElement.sendKeys(surname);
        emailElement.sendKeys(email);
        submitElement.click();
        BrowserUtils.wait(1);
    }

    public List<String> getUserData() {
        List<String> userData = new ArrayList<>();
        WebElement tbody = userDataElement.findElement(By.tagName("tbody"));
        for (WebElement row : tbody.findElements(By.tagName("tr"))) {
            String userInfo = "";
            for (WebElement cell : row.findElements(By.tagName("td"))) {
                userInfo += cell.getText();
            }
            userData.add(userInfo);
        }
        return userData;

    }


}
