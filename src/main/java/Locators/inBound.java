package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class inBound {
    private WebElement firstReturn;
    private WebElement firstReturnOption;
    private WebElement confirmInBound;

    public void setFirstReturn() {
        this.firstReturn = homePage.driver.findElement(By.xpath("(//button//div//i[contains(@class,'IconUI__Icon')])[1]"));
    }
    public void setFirstReturnOption() {
        this.firstReturnOption = homePage.driver.findElement(By.xpath("(//label//parent::*//parent::*/div[5]/div[2]//button)[1]"));
    }
    public void setConfirmInBound() {
        this.confirmInBound = homePage.driver.findElement(By.xpath("//a/parent::*//div/button"));
    }
    public WebElement getFirstReturn() {
        return firstReturn;
    }
    public WebElement getFirstReturnOption() {
        return firstReturnOption;
    }
    public WebElement getConfirmInBound() {
        return confirmInBound;
    }
}

