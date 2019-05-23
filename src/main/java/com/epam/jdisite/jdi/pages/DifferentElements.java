package com.epam.jdisite.jdi.pages;

import com.epam.jdi.light.elements.composite.WebPage;

import com.epam.jdi.light.ui.html.common.Checkbox;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class DifferentElements extends WebPage {
    //@UI("[type='checkbox'][1]")  //checks ok, asserts ok
    //@XPath("(//*[@type='checkbox'])[1]")  //checks ok, asserts ok
    //@Css("label:nth-child(1) > input[type=checkbox]")  //checks ok, asserts ok
    //@ByText("Water")  //checks ok, fails on assertion
    //@WithText("ater") //checks ok, fails on assertion
    //@FindBy(css = "label:nth-child(1) > input[type=checkbox]")  //jdi findBy //checks ok, asserts ok
    /*@FindBys({
            @FindBy(css = "label.label-checkbox:nth-child(1)"),
            @FindBy(css = "input[type=checkbox]")
    })*/ //jdi findBys //checks ok, fails on assertion

    /*@FindBys({
            @FindBy(css = "label.label-checkbox:nth-child(1)"),
            @FindBy(css = "input[type=checkbox]")
    })*/ //selenium FindBys - not working...
    // @FindBy(css = "label:nth-child(1) > input[type=checkbox]") //selenium findBy //checks ok, asserts ok

    @FindBys({
            @FindBy(css = "label.label-checkbox:nth-child(1)"),
            @FindBy(css = "input[type=checkbox]")
    })
    public Checkbox water;
}
