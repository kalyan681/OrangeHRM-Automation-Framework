package com.kalyan.orangehrm.tests;

import com.kalyan.orangehrm.base.BaseTest;
import com.kalyan.orangehrm.pages.DashboardPage;
import com.kalyan.orangehrm.pages.LoginPage;
import com.kalyan.orangehrm.utilities.ConfigReader;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLogin() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password")
        );

        DashboardPage dashboardPage = new DashboardPage(driver);

        Assert.assertTrue(
                dashboardPage.isDashboardDisplayed(),
                "Dashboard is not displayed after login"
        );

        System.out.println("Login Test Passed Successfully");
    }
}
