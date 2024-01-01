package Actions;

import Locators.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import static Actions.ScrollToElement.scrollToElement;

public class findFlight {
    homePage h = new homePage();
    public void setHomeUrl(){
        h.setUrl();
    }

    public void openWebsite(){
        setHomeUrl();
        String url = h.getUrl();
        homePage.driver.get(url);
        homePage.driver.manage().window().maximize();
        h.setCloseMessage();
        h.getCloseMessage().click();
    }
    public void selectDeparture() {
        h.setDeparture();
        h.getDeparture().click();
        h.setDepartureCity();
        h.getDepartureCity().sendKeys("Vienna International");
        homePage.driver.findElement(By.xpath("//div[@class='airport-option ']")).click();
//        departure.click();
//        h.setDepartureCity();
//        WebElement departureCity = h.getDepartureCity();
//        departureCity.click();
    }
    public void selectDestination() {
        h.setDestination();
        WebElement destination = h.getDestination();
        destination.click();
        h.setDestinationCity();
        WebElement destinationCity = h.getDestinationCity();
        destinationCity.click();
    }
    public void selectDepartureDate() {
        h.setDepartureDate();
        WebElement departureDate = h.getDepartureDate();
        departureDate.click();

        h.setDepartureDay();
        WebElement departureDay = h.getDepartureDay();
        scrollToElement(homePage.driver, departureDay);

        try {
            h.getDepartureDay().click();
        } catch (StaleElementReferenceException e) {
            h.getDepartureDay().click();
        }
    }

    public void selectReturnDate(){
//        h.setReturnDate();
//        WebElement returnDate = h.getReturnDate();
//        returnDate.click();
        h.setReturnDay();
        WebElement returnDay = h.getReturnDay();
        scrollToElement(homePage.driver, returnDay);
        returnDay.click();
        }

    public void submit(){
        h.setFindFlight();
        WebElement findFlight = h.getFindFlight();
        findFlight.click();
    }
}
