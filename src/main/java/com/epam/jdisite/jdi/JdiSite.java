package com.epam.jdisite.jdi;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.simple.Css;
import com.epam.jdisite.jdi.pages.DifferentElements;
import com.epam.jdisite.jdi.pages.HomePage;
import com.epam.jdisite.jdi.sections.Header;

@JSite("https://epam.github.io/JDI")
public class JdiSite {

    @Url("index.html")
    @Title("Home Page")
    public static HomePage homePage;

    @Url("different-elements.html")
    public static DifferentElements differentElements;

    @Css("header")
    public static Header header;
}
