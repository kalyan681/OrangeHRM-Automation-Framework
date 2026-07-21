package com.kalyan.orangehrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddEmployeePage {

    WebDriver driver;
    WebDriverWait wait;

    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By addButton = By.xpath("//button[normalize-space()='Add']");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By saveButton = By.xpath("//button[@type='submit']");

    // Methods
    public void clickAddButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addButton));
        driver.findElement(addButton).click();
    }

    public void enterFirstName(String fname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName));
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName));
        driver.findElement(lastName).sendKeys(lname);
    }

    public void clickSave() {
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        driver.findElement(saveButton).click();
    }

    public void addEmployee(String fname, String lname) {
        clickAddButton();
        enterFirstName(fname);
        enterLastName(lname);
        clickSave();
    }
}