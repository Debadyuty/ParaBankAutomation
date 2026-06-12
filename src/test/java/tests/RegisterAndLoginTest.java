package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;
import utils.RandomDataGenerator;

public class RegisterAndLoginTest extends BaseTest {

    @Test
    public void registerAndLogin() {

        // Create page objects
        RegistrationPage reg = new RegistrationPage(driver);
        LoginPage login = new LoginPage(driver);
        HomePage home = new HomePage(driver);

        // Generate unique username
        String username = RandomDataGenerator.getUsername();
        String password = "Admin@123";

        System.out.println("Username Created: " + username);

        // Register user
        reg.registerUser(username, password);

        // Debug information
        String pageTitle =
                driver.findElement(By.tagName("h1")).getText();

        System.out.println("Page Title = " + pageTitle);

        // Verify registration
        Assert.assertTrue(
                pageTitle.contains("Welcome"),
                "Registration Failed!"
        );

        System.out.println("Registration Successful");

        // Logout
        home.logout();

        System.out.println("Logout Successful");

        // Login again
        login.login(username, password);

        // Verify login
        String bodyText =
                driver.findElement(By.tagName("body")).getText();

        Assert.assertTrue(
                bodyText.contains("Accounts Overview"),
                "Login Failed!"
        );

        System.out.println("Login Successful");
    }
}