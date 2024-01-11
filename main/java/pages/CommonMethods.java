package pages;


import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebElement;

public class CommonMethods {
public static int getLocationOfX( WebElement element) {
        return element.getLocation().getX();

    }

    public static int getLocationY( WebElement element) {
        return element.getLocation().getY();
    }
}
