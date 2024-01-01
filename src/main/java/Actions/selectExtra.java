package Actions;

import Locators.extra;
import Locators.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Actions.ScrollToElement.scrollToElement;

public class selectExtra {

    extra packages = new extra();
    WebDriverWait w = new WebDriverWait(homePage.driver, Duration.ofSeconds(10));
//    Actions action = new Actions(homePage.driver);

        public void noExtra(){
            w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class,'ButtonUI__Button')])[1]")));
            packages.setContinueExtra();
            packages.getContinueExtra().click();
        }
        public void selectSeat() {
            w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@class,'Spinner')]")));
            w.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='SEAT']")));
            packages.setSelectSeat();
            scrollToElement(homePage.driver, packages.getSelectSeat());
            packages.getSelectSeat().click();
            w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@data-test,'allowed')])[1]")));
            packages.setSeat();
            packages.getSeat().click();
            packages.setSaveClose();
            packages.getSaveClose().click();
            packages.setContinueExtra();
            w.until(ExpectedConditions.elementToBeClickable(packages.getContinueExtra()));
            packages.getContinueExtra().click();
//            WebElement cancel = homePage.driver.findElement(By.xpath("//div[@role='dialog']"));
//            action.moveToLocation(1,1).click().perform();
//            packages.getContinueExtra().click();
        }

}
