package Actions;

import org.openqa.selenium.*;

public class ScrollToElement {

    public static void scrollToElement(WebDriver driver, WebElement element) {

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        }

 }

