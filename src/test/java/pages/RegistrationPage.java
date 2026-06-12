package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zip = By.id("customer.address.zipCode");
    By phone = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By repeatedPassword = By.id("repeatedPassword");
    By registerBtn = By.xpath("//input[@value='Register']");

    public void registerUser(String uname, String pwd) {

        driver.findElement(By.id("customer.firstName"))
              .sendKeys("Debadyuty");

        driver.findElement(By.id("customer.lastName"))
              .sendKeys("Gayen");

        driver.findElement(By.id("customer.address.street"))
              .sendKeys("Kolkata");

        driver.findElement(By.id("customer.address.city"))
              .sendKeys("Kolkata");

        driver.findElement(By.id("customer.address.state"))
              .sendKeys("West Bengal");

        driver.findElement(By.id("customer.address.zipCode"))
              .sendKeys("700061");

        driver.findElement(By.id("customer.phoneNumber"))
              .sendKeys("8582859898");

        driver.findElement(By.id("customer.ssn"))
              .sendKeys("123456");

        driver.findElement(By.id("customer.username"))
              .sendKeys(uname);

        driver.findElement(By.id("customer.password"))
              .sendKeys(pwd);

        driver.findElement(By.id("repeatedPassword"))
              .sendKeys(pwd);

        driver.findElement(By.xpath("//input[@value='Register']"))
              .click();
    
    }
}