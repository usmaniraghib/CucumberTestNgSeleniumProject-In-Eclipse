package com.raghib.cucumber.stepdefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.raghib.selenium.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchBoxSteps extends BaseClass {
	public static WebDriver driver;
	public static String browserName = "chrome";
	public static String browserVersion = "116";

	public static String url = "https://www.google.com";
	public static String googleSearchBox = "//*[@id='APjFqb']";
	public static String linkPath = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/a/h3";

	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I launch chrome browser");
		driver = BaseClass.getDriver(browserName, browserVersion);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}

	@When("I open google home page")
	public void i_open_orange_hrm_home_page() {
		System.out.println("I open google home page");
		driver.get(url);
	}

	@Then("I verify the search box of the page")
	public void i_verify_that_the_logo_present_on_page() {
		System.out.println("I verify the search box of the page");
		WebElement element = driver.findElement(By.xpath(googleSearchBox));

		Duration duration = Duration.ofSeconds(30);

		WebDriverWait wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(googleSearchBox)));

		element.sendKeys("selenium");
		element.sendKeys(Keys.ENTER);

		WebDriverWait wait1 = new WebDriverWait(driver, duration);
		wait1.until(ExpectedConditions.elementToBeClickable((By.xpath(linkPath)))).click();
	}

	@Then("I close the browser")
	public void close_browser() {
		System.out.println("I close the browser");
		BaseClass.quitDriver();
	}
}
