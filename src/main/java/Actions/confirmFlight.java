package Actions;

import Locators.confirmDate;
import Locators.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Actions.ScrollToElement.scrollToElement;

public class confirmFlight {
    confirmDate confirm = new confirmDate();

    public void selectClass(){
        WebDriverWait w = new WebDriverWait(homePage.driver, Duration.ofSeconds(10));
        WebElement firstFlight = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button//div//i[contains(@class,'IconUI__Icon')])[1]")));
//        confirm.setFirstFlight();
//        WebElement firstFlight = confirm.getFirstFlight();
        scrollToElement(homePage.driver,firstFlight);
        firstFlight.click();
        WebElement selectOption1 = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//label//parent::*//parent::*/div[5]/div[2]//button)[1]")));
        confirm.setFlightOption();
//        WebElement selectOption1 = confirm.getFlightOption();
        scrollToElement(homePage.driver,selectOption1);
        selectOption1.click();
        confirm.setContinueButton();
        WebElement contin = confirm.getContinueButton();
        w.until(ExpectedConditions.elementToBeClickable(contin));
        contin.click();
    }

}
