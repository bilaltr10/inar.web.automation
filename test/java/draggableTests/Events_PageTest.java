package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.Pages;

public class Events_PageTest extends Hooks {

    Pages page = new Pages();

    @Test
    public void xxx() throws InterruptedException {
        page.getHomePage().clickOnWebAutomationLink();
        page.getWebAutomationPage().clickOnDraggableElement();
        page.getEventsPage().clickOnEventsPage();

        BrowserUtils.scrollDownWithJavaScript(0, 400);
        int x = 0;
        int[] nums = new int[]{1, -1};

        for (int i = 0; i < 10; i++) {
            int d = (int) (Math.random() * 100) * nums[(int) (Math.random() * 2)];
            int f = (int) (Math.random() * 100)  * nums[(int) (Math.random() * 2)];

            page.getEventsPage().dropAndDragWebElement(d, f);
            x += page.getEventsPage().numberOfDragInvokation();

        }

        System.out.println("hello : " + page.getEventsPage().numberOfStartInvocation());
        System.out.println("hello : " + x);
        System.out.println("hello : " + page.getEventsPage().numberOfStopInvocation());


    }
}
