package test.automation;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FaceSteps {

    WebDriver driver = null;

    @Given("^User on \"([^\"]*)\" page$")
    public void user_on_page(String arg1) throws Throwable {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @When("^User submit login form with valid data$")
    public void user_submit_login_form_with_valid_data(DataTable table ) throws Throwable {

        System.out.println(table);

        List<List<String>> data = table.raw();
        System.out.println(data.get(1).get(1));

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys(data.get(1).get(1));
        driver.findElement(By.id("pass")).sendKeys(data.get(2).get(1));

    }
    @When("^User submit \"([^\"]*)\" button$")
    public void user_submit_button(String arg1) throws Throwable {
        driver.findElement(By.id("loginbutton")).click();
    }

    @Then("^user \"([^\"]*)\" on home page$")
    public void user_on_home_page(String arg1) throws Throwable {
        String name = driver.findElement(By.xpath("//span[@class='_1qv9']/span")).getText();

        System.out.println(name);
        Assert.assertTrue("Наталья".equals(name));
    }
}
/*

public class FaceSteps {

    WebDriver driver = null;

    @Given("^User on \"([^\"]*)\" page$")
    public void user_on_page(String address) throws Throwable {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }

    @When("^User click on field \"([^\"]*)\" to input data \"([^\"]*)\"$")
    public void user_clock_on_field_to_input_data(String email, String data) throws Throwable {
        WebElement email1 = driver.findElement(By.id("email"));
        email1.sendKeys("natalyakulish@gmail.com");

    }

    @When("^User click \"([^\"]*)\" button$")
    public void user_click_button(String button) throws Throwable {
        driver.findElement(By.id("loginbutton")).click();
    }

    @Then("^user \"([^\"]*)\"on home page$")
    public void user_on_home_page(String value) throws Throwable {

        String name = driver.findElement(By.xpath("//span[@class='_1qv9']/span")).getText();

        System.out.println(name);
        Assert.assertTrue("Наталья".equals(name));
    }

}
*/
