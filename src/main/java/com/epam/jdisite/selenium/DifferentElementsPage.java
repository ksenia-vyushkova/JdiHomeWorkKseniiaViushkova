package com.epam.jdisite.selenium;

import com.epam.jdi.light.ui.html.common.Checkbox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class DifferentElementsPage {

    private WebDriver driver;

    @FindBys({
            @FindBy(css = "label.label-checkbox:nth-child(1)"),
            @FindBy(css = "input[type=checkbox]")
    })
    public WebElement water;

    public DifferentElementsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //================================methods==================================

    public void open() {
        driver.navigate().to("https://epam.github.io/JDI/different-elements.html");
    }

}
