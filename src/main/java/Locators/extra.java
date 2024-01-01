package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class extra {

    private WebElement Seat ;
    private WebElement continueExtra ;
    private WebElement selectSeat ;
    private WebElement saveClose ;

    public WebElement getSeat() {
        return Seat;
    }

    public void setSeat() {
        Seat  = homePage.driver.findElement(By.xpath("(//button[contains(@data-test,'allowed')])[1]"));
    }

    public WebElement getContinueExtra() {
        return continueExtra;
    }

    public void setContinueExtra() {
        continueExtra = homePage.driver.findElement(By.xpath("(//button[contains(@class,'ButtonUI__Button')])[4]"));
    }

    public WebElement getSelectSeat() {
        return selectSeat;
    }

    public void setSelectSeat() {
        selectSeat = homePage.driver.findElement(By.xpath("//img[@alt='SEAT']"));
    }

    public WebElement getSaveClose() {
        return saveClose;
    }

    public void setSaveClose() {
        saveClose = homePage.driver.findElement(By.xpath("(//div/button[contains(@class,'ButtonUI__Button')])[6]"));
    }
}
