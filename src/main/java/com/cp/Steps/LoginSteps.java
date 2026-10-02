package com.cp.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {

        driver.get("https://www.saucedemo.com/");

        System.out.println("SauceDemo login page opened");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        System.out.println("Username and password entered");
    }

    @When("user clicks the login Button")
    public void user_clicks_the_login_button() {

        driver.findElement(By.id("login-button")).click();

        System.out.println("Login button clicked");
    }

    @Then("user should be navigated to homepage")
    public void user_should_be_navigated_to_homepage() {

        String pageTitle = driver.findElement(By.className("title")).getText();

        System.out.println("Page title: " + pageTitle);

        if (pageTitle.equals("Products")) {
            System.out.println("Login successful - Products page displayed");
        } else {
            System.out.println("Login failed");
        }
    }

    @When("user gets the page url")
    public void user_gets_the_page_url() {

        String url = driver.getCurrentUrl();

        System.out.println("Current URL: " + url);
    }

    @When("user gets the page title")
    public void user_gets_the_page_title() {

        String title = driver.getTitle();

        System.out.println("Page Title: " + title);
    }

    @After
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}