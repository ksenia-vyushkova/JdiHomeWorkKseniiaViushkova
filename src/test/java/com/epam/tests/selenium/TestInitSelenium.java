package com.epam.tests.selenium;

import com.epam.jdisite.selenium.DifferentElementsPage;
import com.epam.jdisite.selenium.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestInitSelenium {
    private WebDriver driver;
    HomePage homePage;
    DifferentElementsPage differentElementsPage;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        differentElementsPage = new DifferentElementsPage(driver);
        driver.manage().window().maximize();
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        driver.quit();
    }
}
