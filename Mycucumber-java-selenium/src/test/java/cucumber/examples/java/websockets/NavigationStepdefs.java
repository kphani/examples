package cucumber.examples.java.websockets;

import cucumber.annotation.en.Given;
import org.openqa.selenium.WebDriver;

public class NavigationStepdefs {
    private final WebDriver driver;

    public NavigationStepdefs(SharedDriver webDriver) {
        this.driver = webDriver;
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    }

    @Given("^I am on the front page$")
    public void i_am_on_the_front_page() {
        driver.get("http://localhost:" + ServerHooks.PORT);
    }

    @Given("^I am on the Google page$")
    public void i_am_on_the_Google_page() {
      driver.get("http://google.co.uk");
    }
}
