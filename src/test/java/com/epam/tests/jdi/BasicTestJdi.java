package com.epam.tests.jdi;

import org.testng.annotations.Test;

import static com.epam.jdisite.jdi.JdiSite.*;
import static com.epam.jdisite.jdi.entities.Users.DEFAULT_USER;
import static com.epam.jdisite.jdi.sections.Header.loginForm;
import static com.epam.jdisite.jdi.sections.Header.userIcon;
import static org.testng.Assert.assertTrue;

public class BasicTestJdi extends TestInitJdi {

    @Test
    public void basicTest() {
        homePage.open();
        userIcon.click();
        loginForm.submit(DEFAULT_USER);
        homePage.checkOpened();
        differentElements.open();
        differentElements.water.higlight();
        differentElements.water.check();
        assertTrue(differentElements.water.isSelected());
        differentElements.water.is().selected();
    }
}
