package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class passengerDetails {
    private WebElement title;
    private WebElement firstName;
    private WebElement lastName;
    private WebElement samePassenger;
    private WebElement prefix;
    private WebElement phoneNumber;
    private WebElement email;
    private WebElement confirmEmail;


    public WebElement getTitle() {
        return title;
    }

    public void setTitle() {
       title = homePage.driver.findElement(By.xpath("(//input[@type='text'])[1]"));
    }

    public WebElement getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        firstName = homePage.driver.findElement(By.xpath("(//input[@type='text'])[2]"));
    }

    public WebElement getLastName() {
        return lastName;
    }

    public void setLastName() {
        lastName = homePage.driver.findElement(By.xpath("(//input[@type='text'])[3]"));
    }

    public WebElement getSamePassenger() {
        return samePassenger;
    }

    public void setSamePassenger() {
        samePassenger = homePage.driver.findElement(By.xpath("(//div/label/span)[2]"));
    }

    public WebElement getPrefix() {
        return prefix;
    }

    public void setPrefix() {
        prefix = homePage.driver.findElement(By.xpath("(//input[@type='text'])[9]"));
    }

    public WebElement getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        phoneNumber = homePage.driver.findElement(By.xpath("(//input[@type='text'])[10]"));
    }

    public WebElement getEmail() {
        return email;
    }

    public void setEmail() {
        email = homePage.driver.findElement(By.id("contactDetails.emailAddress"));
    }

    public WebElement getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail() {
        confirmEmail = homePage.driver.findElement(By.id("contactDetails.emailAddressConfirm"));
    }
}
