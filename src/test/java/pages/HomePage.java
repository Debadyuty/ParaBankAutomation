package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By logoutLink = By.linkText("Log Out");

    public void logout() {
        driver.findElement(logoutLink).click();
    }
}