package com.epam.tests.selenium;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BasicTestSelenium extends TestInitSelenium {

    @Test
    public void basicTest(){
        homePage.open();
        homePage.login("epam", "1234");
        differentElementsPage.open();
        differentElementsPage.water.click();
        assertTrue(differentElementsPage.water.isSelected());
    }
}
