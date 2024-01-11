package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebAutomationPage extends BasePage {


    @FindBy(xpath = "//a[text()='Draggable']")
    WebElement draggableElement;

    @FindBy(xpath = "//a[text()='Droppable']")
    WebElement droppableElement;

    @FindBy(xpath = "//a[text()='Resizable']")
    WebElement resizableElement;

    @FindBy(xpath = "//a[text()='Selectable']")
    WebElement selectableElement;

    @FindBy(xpath = "//a[@class='text-fifth Sortable-content nav-link']")
    WebElement sortableElement;

    @FindBy(xpath = "//a[text()='Accordion']")
    WebElement accordionElement;

    @FindBy(xpath = "//a[text()='Autocomplete']")
    WebElement autoCompleteElement;

    @FindBy(xpath = "//a[text()='Button']")
    WebElement buttonElement;

    @FindBy(xpath = "//a[text()='Checkbox Radio']")
    WebElement checkBoxRadio;

    @FindBy(xpath = "//a[text()='Control Group']")
    WebElement controlGroupElement;

    @FindBy(xpath = "//a[text()='Datepicker']")
    WebElement datePickerElement;

    @FindBy(xpath = "//a[text()='Dialog']")
    WebElement dialogElement;
    @FindBy(xpath = "//a[text()='Menu']")
    WebElement menuElement;
    @FindBy(xpath = "//a[text()='Progress Bar']")
    WebElement progressBarElement;
    @FindBy(xpath = "//a[text()='Slider']")
    WebElement sliderElement;
    @FindBy(xpath = "//a[text()='Spinner']")
    WebElement spinnerElement;
    @FindBy(xpath = "//a[text()='Tabs']")
    WebElement tabsElement;
    @FindBy(xpath = "//a[text()='Tooltip']")
    WebElement tooltipElement;
    @FindBy(xpath = "//a[text()='Effects']")
    WebElement effectsElement;
    @FindBy(xpath = "//a[text()='Alerts']")
    WebElement alertsElement;

    @FindBy(xpath = "//a[text()='Iframe']")
    WebElement iframeElement;
    @FindBy(xpath = "//a[text()='Breadcrumbs']")
    WebElement breadCrumbsElement;
    @FindBy(xpath = "//a[text()='Dropdown']")
    WebElement dropDownElement;


    public void clickOnDraggableElement() {
        draggableElement.click();
    }

    public void clickOnDroppableElement() {
        droppableElement.click();
    }

    public void clickOnResizableElement() {
        resizableElement.click();
    }

    public void clickOnSelectableElement() {
        selectableElement.click();
    }

    public void clickOnSortableElement() {
        sortableElement.click();
    }

    public void clickOnAccordionElement() {
        accordionElement.click();
    }

    public void clickOnAutoCompleteElement() {
        autoCompleteElement.click();
    }

    public void clickOnButtonElement() {
        buttonElement.click();
    }

    public void clickOnCheckBoxRadio() {
        checkBoxRadio.click();
    }

    public void clickOnControlGroupElement() {
        controlGroupElement.click();
    }

    public void clickOnDatePickerElement() {
        datePickerElement.click();
    }

    public void clickOnDialogElement() {
        dialogElement.click();
    }

    public void clickOnMenuElement() {
        menuElement.click();
    }

    public void clickOnProgressBarElement() {
        progressBarElement.click();
    }

    public void clickOnSliderElement() {
        sliderElement.click();
    }

    public void clickOnSpinnerElement() {
        spinnerElement.click();
    }

    public void clickOnTabsElement() {
        tabsElement.click();
    }

    public void clickOnTooltipElement() {
        tooltipElement.click();
    }

    public void clickOnEffectsElement() {
        effectsElement.click();
    }

    public void clickOnAlertsElement() {
        alertsElement.click();
    }

    public void clickOnIframeElement() {
        iframeElement.click();
    }

    public void clickOnBreadCrumbsElement() {
        breadCrumbsElement.click();
    }

    public void clickOnropDownElement() {
        dropDownElement.click();
    }


}
