package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.HomePage;
import utils.BrowserUtils;

import java.util.List;

public class DisplayMultipleMonths extends HomePage {
    @FindBy(xpath = "//a[text()='Display Multiple Months']")
    private WebElement displayMultipleMonthsElements;

    @FindBy(id = "datepicker-multiple-months")
    private WebElement writeableDateElement;
    //isplayMultipleMonthsTest
    @FindBy(id = "ui-datepicker-div")
    private WebElement calenderBarElement;

    @FindBy(css = ".ui-datepicker-month")
    private List<WebElement> monthsVisibleInCalender;

    @FindBy(css = "//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody")
    private WebElement currentDateInfos;

    @FindBy(css = ".ui-datepicker-group-first")
    private WebElement currentChosenDay;

    @FindBy(css = ".ui-icon.ui-icon-circle-triangle-w")
    private WebElement prevButtonElement;

    @FindBy(css = ".ui-icon.ui-icon-circle-triangle-e")
    private WebElement nextButtonElement;

    @FindBy(xpath = "//button[text()='Done']")
    private WebElement doneElement;

    @FindBy(xpath = "//button[text()='Today']")
    private WebElement todayElement;

    public void clickOnDisplayMultipleMonthsElements() {
        displayMultipleMonthsElements.click();
    }

    public void enterDate(String month, String day, String year) {
        BrowserUtils.wait(0.75);
        String date = month + "/" + day + "/" + year;
        writeableDateElement.sendKeys(date);
        BrowserUtils.wait(0.75);

    }

    public boolean isCalenderVisible() {
        return calenderBarElement.isDisplayed();
    }

    public int isMonthsMultiple() {
        return monthsVisibleInCalender.size();
    }

    public void clickOnWriteableDateElement() {
        writeableDateElement.click();
    }

    public boolean isCurrentDaySelected() {
        return currentChosenDay.isEnabled();
    }

    public String selectedDayMonthYear() {
        return selectedMonth()+"/"+selectedDay() + "/" + selectedYear();
    }

    public String selectedMonth() {
        return Integer.parseInt(currentChosenDay.
                findElement(By.cssSelector(" .ui-datepicker-current-day")).getAttribute("data-month")) + 1 + "";
    }

    public String selectedDay() {
        return currentChosenDay.findElement(By.cssSelector(".ui-state-default.ui-state-active")).
                getAttribute("data-date");
    }

    public String selectedYear() {
        return currentChosenDay.findElement(By.cssSelector(" .ui-datepicker-current-day")).getAttribute("data-year");
    }


    public void clickOnPrevElement() {
        prevButtonElement.click();
    }

    public void clickOnNextElement() {
        nextButtonElement.click();
    }

    public void clickOnDoneElement() {
        doneElement.click();
    }

    public void clickOnTodayElement() {
        todayElement.click();
    }

    public String monthOnLeft() {
        return calenderBarElement.findElement(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-first .ui-datepicker-month")).getText();
    }

    public String monthOnMiddle() {
      return calenderBarElement.findElement(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-middle .ui-datepicker-month")).getText();
    }

    public String monthOnRight() {
        return calenderBarElement.findElement(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-last .ui-datepicker-month")).getText();
    }

}








