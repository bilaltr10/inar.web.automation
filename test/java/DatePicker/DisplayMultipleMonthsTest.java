package DatePicker;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class DisplayMultipleMonthsTest extends Hooks {

	String monthAsInput = "10";

	String dayAsInput = "7";

	String yearAsInput = "2023";

	String monthAsActual, yearAsActual, dayAsActual;

	@Test
	public void displayMultipleMonthsTest() {
		//
		pages.getHomePage().clickOnWebAutomationLink();
		//
		pages.getWebAutomationPage().clickOnDatePickerElement();
		//
		pages.getDisplayMultipleMonths().clickOnDisplayMultipleMonthsElements();

		// click and verify calender visible
		pages.getDisplayMultipleMonths().clickOnWriteableDateElement();
		boolean isVisibleExpected = true;
		boolean isVisibleActual = pages.getDisplayMultipleMonths().isCalenderVisible();
		Assertions.assertEquals(isVisibleExpected, isVisibleActual,
				"When clicked on date " + "item calender should be visible");

		// verify that multi months(now =3) appear in calender page
		int expectedNumberOfVisibleMonths = 3;
		int actualNumberOfVisibleMonths = pages.getDisplayMultipleMonths().isMonthsMultiple();
		Assertions.assertEquals(expectedNumberOfVisibleMonths, actualNumberOfVisibleMonths,
				"In calender multi months should display(now 3 months)");

		// enter date to the date-field
		pages.getDisplayMultipleMonths().enterDate(monthAsInput, dayAsInput, yearAsInput);

		// verify that date on calender is selected
		boolean isDateChosenedExpected = true;
		boolean isDateChosenedActual = pages.getDisplayMultipleMonths().isCurrentDaySelected();
		Assertions.assertEquals(isDateChosenedExpected, isDateChosenedActual, "Date should be chosen");

		// verify that actual and expected date dates match
		String expectedDate = pages.getDisplayMultipleMonths().selectedDayMonthYear();
		String actualDate = Integer.parseInt(monthAsInput) + "/" + dayAsInput + "/" + yearAsInput;
		Assertions.assertEquals(expectedDate, actualDate, "Date should be " + actualDate);

		// click on prev button and verify that month on left bar is September
		pages.getDisplayMultipleMonths().clickOnPrevElement();
		String expectedMont = "September";
		String actualMonth = pages.getDisplayMultipleMonths().monthOnLeft();
		Assertions.assertEquals(expectedMont, actualMonth,
				"Clicked on prev button calender should start from September");

		// click on two time next button and verify that month on right is January
		pages.getDisplayMultipleMonths().clickOnNextElement();
		pages.getDisplayMultipleMonths().clickOnNextElement();
		String expectedMonthAfterClickedNext = "January";
		String actualMonthAfterClickedNext = pages.getDisplayMultipleMonths().monthOnRight();
		Assertions.assertEquals(expectedMonthAfterClickedNext, actualMonthAfterClickedNext,
				"Clicked two times next button so month " + "on the right side of calender should be January");

		// click on today button and verify that calender start from chosen month (Here is
		// answer is October)
		pages.getDisplayMultipleMonths().clickOnTodayElement();
		String expectedMonthAfterClickedToday = "January";
		String actualMonthAfterClickedToday = pages.getDisplayMultipleMonths().monthOnLeft();
		Assertions.assertEquals(expectedMonthAfterClickedToday, actualMonthAfterClickedToday,
				"click on today button and  calender sholud start"
						+ " from chosen current month (Today is answer is January)");

		// click on Done button and verify that calender disappear
		pages.getDisplayMultipleMonths().clickOnDoneElement();
		BrowserUtils.wait(0.5);
		boolean isCalenderExpectedVisible = false;
		boolean isCalenderActualVisible = pages.getDisplayMultipleMonths().isCalenderVisible();
		Assertions.assertEquals(isCalenderExpectedVisible, isCalenderActualVisible,
				"Clicked on done button" + "so calender should disappear");

	}

}
