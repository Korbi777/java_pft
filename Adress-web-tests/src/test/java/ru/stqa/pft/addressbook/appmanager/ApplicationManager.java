package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.inputDataContact;

import java.util.concurrent.TimeUnit;


public class ApplicationManager {

    WebDriver wd;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\kobya\\IdeaProjects\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        wd.get("http://localhost/addressbook/");
        sessionHelper.login("admin", "secret");
    }

    public void goGroupPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void gotoPageAddNewContact() {
        wd.get("http://localhost/addressbook/edit.php");
    }

    public void chekingCreationPage() {
        wd.findElement(By.linkText("home")).click();
    }

    public void dataStorageContact() {
        wd.findElement(By.name("submit")).click();
    }

    public void dataInputContact(inputDataContact inputDataContact) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(inputDataContact.firstname());
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(inputDataContact.middlename());
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(inputDataContact.lastname());
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(inputDataContact.nickname());
        wd.findElement(By.name("title")).click();
        wd.findElement(By.name("title")).clear();
        wd.findElement(By.name("title")).sendKeys(inputDataContact.title());
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(inputDataContact.company());
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(inputDataContact.address());
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(inputDataContact.home());
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(inputDataContact.mobile());
    }

    public void stop() {
        wd.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            wd.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}