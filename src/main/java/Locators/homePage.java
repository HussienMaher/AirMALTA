package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homePage {
    public static ChromeDriver driver = new ChromeDriver();

     private String url;
     private WebElement closeMessage;
     private WebElement departure;
     private WebElement departureCity;
     private WebElement destination;
     private WebElement destinationCity;
     private WebElement departureDate;
     private WebElement departureDay;
     private WebElement returnDate;
     private WebElement returnDay;
     private WebElement findFlight;


    public void setUrl() {
        this.url = "https://airmalta.com/en";
    }
    public void setCloseMessage() {
        this.closeMessage = driver.findElement(By.xpath("//div[@id='onetrust-close-btn-container']//button[@aria-label='Close']"));
    }
     public void setDeparture() {
        departure = driver.findElement(By.xpath("(//div[@class='ellipsis'])[1]"));
    }

    public void setDepartureCity() {
        departureCity = driver.findElement(By.xpath("//input[@name='Origin1']"));
    }

    public void setDestination() {
        destination =driver.findElement(By.xpath("//div[@class='route-selection-destination']//div[@class='input-holder airport-selection ']"));
    }

    public void setDestinationCity() {
        destinationCity = driver.findElement(By.xpath("//div[@class='airport-option '][1]"));
    }

    public void setDepartureDate() {
        departureDate = driver.findElement(By.xpath("//div[@class='input-holder date startDate no-border']"));
    }

    public void setDepartureDay() {
        departureDay = driver.findElement(By.xpath("(//div[@class='DayPicker-Day' and @aria-disabled='false'])[2]"));
    }

//    public void setReturnDate() {
//        returnDate = driver.findElement(By.xpath("(//div[@class='input-holder date endDate show-border']"));
//    }

    public void setReturnDay() {
        returnDay =driver.findElement(By.xpath("(//div[@class='DayPicker-Body'])[2]//div[@aria-disabled='false'][4]"));
    }

    public void setFindFlight() {
        findFlight = driver.findElement(By.xpath("//div[@class='input-holder buttons']//button[@type='submit']"));
    }

    public WebElement getCloseMessage() {
        return closeMessage;
    }
    public String getUrl() {
        return url;
    }
    public WebElement getDeparture() {
        return departure;
    }

    public WebElement getDepartureCity() {
        return departureCity;
    }

    public WebElement getDestination() {
        return destination;
    }

    public WebElement getDestinationCity() {
        return destinationCity;
    }

    public WebElement getDepartureDate() {
        return departureDate;
    }

    public WebElement getDepartureDay() {
        return driver.findElement(By.xpath("(//div[@class='DayPicker-Day' and @aria-disabled='false'])[2]"));
    }

    public WebElement getReturnDate() {
        return returnDate;
    }

    public WebElement getReturnDay() {
        return returnDay;
    }

    public WebElement getFindFlight() {
        return findFlight;
    }


}
