package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class confirmDate {
    private WebElement firstFlight;
    private WebElement flightOption;
    private WebElement continueButton;

    public void setFirstFlight() {
        this.firstFlight = homePage.driver.findElement(By.xpath("(//button//div//i[contains(@class,'IconUI__Icon')])[1]"));
    }
    public void setFlightOption() {
        this.flightOption = homePage.driver.findElement(By.xpath("(//label//parent::*//parent::*/div[5]/div[2]//button)[1]"));
    }
    public void setContinueButton() {
        this.continueButton = homePage.driver.findElement(By.xpath("//a/parent::*//div/button"));
    }
    public WebElement getFirstFlight() {
        return firstFlight;
    }
    public WebElement getFlightOption() {
        return flightOption;
    }
    public WebElement getContinueButton() {
        return continueButton;
    }
}
