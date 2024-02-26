package com.revature.steps;

import com.revature.pages.GoogleHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.revature.runners.GoogleRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoogleSearchStepImpl {

    private WebDriver driver = GoogleRunner.driver;
    private GoogleHomePage googleHomePage = GoogleRunner.googleHomePage;


    @Given("User is on Google Home Page")
    public void user_is_on_google_home_page() {
        driver.get("https://www.google.com");
    }
    @When("User types in {string}")
    public void user_types_in_mario(String input) {
        googleHomePage.serachInput.sendKeys(input);
    }
    @When("User hits Enter")
    public void user_hits_enter() {
        googleHomePage.serachInput.sendKeys(Keys.ENTER);
    }
    @Then("User should see results for {string}")
    public void user_should_see_results_for_mario(String searchResultTitle) {
       assertEquals(searchResultTitle, driver.getTitle());
    }

}
