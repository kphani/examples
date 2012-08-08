package cucumber.examples.java.websockets;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: kphani
 * Date: 7/8/12
 * Time: 3:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class GoogleTabsStepdefs {

    private final WebDriver driver;

    public GoogleTabsStepdefs(SharedDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("^click gmail tab$")
    public void clickGmailTab() {
        driver.findElement(By.id("gb_23")).click();
    }

    @Then("^browser should show gmail login field$")
    public void cardShouldBeReturned() {
        //System.out.print(driver.getCurrentUrl());
        assertTrue(driver.findElement(By.linkText("Create an account")).isDisplayed());
        driver.findElement(By.linkText("Create an account")).click();


    }
}
