package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class addNewContact {
    private WebDriver wb;

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kobya\\IdeaProjects\\chromedriver.exe");
        wb = new ChromeDriver();
        wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wb.get("http://localhost/addressbook");
        login("admin", "secret");

    }


    private void login(String username, String password) {
        wb.findElement(By.name("user")).click();
        wb.findElement(By.name("user")).clear();
        wb.findElement(By.name("user")).sendKeys(username);
        wb.findElement(By.name("pass")).clear();
        wb.findElement(By.name("pass")).sendKeys(password);
        wb.findElement(By.xpath("//input[@value='Login']")).click();
    }

    @Test
    public void testGroupCreation() throws Exception {
        gotoPageAddNewContact();
        dataInputContact(new inputDataContact("Sergey", "Sasha", "Ivanov", "sergey41", "hi!", "RSHB", "g. Moscow", "Russia", "+79003331234"));
        dataStorageContact();
        chekingCreationPage();
        logoutSite();
    }

    private void gotoPageAddNewContact() {
        wb.get("http://localhost/addressbook/edit.php");
    }

    private void logoutSite() {
        wb.findElement(By.linkText("Logout")).click();
    }

    private void chekingCreationPage() {
        wb.findElement(By.linkText("home")).click();
    }

    private void dataStorageContact() {
        wb.findElement(By.name("submit")).click();
    }

    private void dataInputContact(inputDataContact inputDataContact) {
        wb.findElement(By.name("firstname")).click();
        wb.findElement(By.name("firstname")).clear();
        wb.findElement(By.name("firstname")).sendKeys(inputDataContact.firstname());
        wb.findElement(By.name("middlename")).clear();
        wb.findElement(By.name("middlename")).sendKeys(inputDataContact.middlename());
        wb.findElement(By.name("lastname")).clear();
        wb.findElement(By.name("lastname")).sendKeys(inputDataContact.lastname());
        wb.findElement(By.name("nickname")).clear();
        wb.findElement(By.name("nickname")).sendKeys(inputDataContact.nickname());
        wb.findElement(By.name("title")).click();
        wb.findElement(By.name("title")).clear();
        wb.findElement(By.name("title")).sendKeys(inputDataContact.title());
        wb.findElement(By.name("company")).clear();
        wb.findElement(By.name("company")).sendKeys(inputDataContact.company());
        wb.findElement(By.name("address")).clear();
        wb.findElement(By.name("address")).sendKeys(inputDataContact.address());
        wb.findElement(By.name("home")).clear();
        wb.findElement(By.name("home")).sendKeys(inputDataContact.home());
        wb.findElement(By.name("mobile")).clear();
        wb.findElement(By.name("mobile")).sendKeys(inputDataContact.mobile());
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        wb.quit();
        }


    private boolean isElementPresent(By by) {
        try {
            wb.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wb.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}

