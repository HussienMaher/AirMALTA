package Actions;

import Locators.homePage;
import Locators.inBound;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Actions.ScrollToElement.scrollToElement;

public class returnFlight {
    inBound inboundFlight = new inBound();
    WebDriverWait w = new WebDriverWait(homePage.driver, Duration.ofSeconds(10));
    public void returnFlight(){
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button//div//i[contains(@class,'IconUI__Icon')])[1]")));
        inboundFlight.setFirstReturn();
//        w.until(ExpectedConditions.visibilityOf(inboundFlight.getFirstReturn()));
        scrollToElement(homePage.driver, inboundFlight.getFirstReturn());
        inboundFlight.getFirstReturn().click();
        inboundFlight.setFirstReturnOption();
        w.until(ExpectedConditions.visibilityOf(inboundFlight.getFirstReturnOption()));
        scrollToElement(homePage.driver, inboundFlight.getFirstReturnOption());
        inboundFlight.getFirstReturnOption().click();
        inboundFlight.setConfirmInBound();
        w.until(ExpectedConditions.elementToBeClickable(inboundFlight.getConfirmInBound()));
        inboundFlight.getConfirmInBound().click();
    }
}

