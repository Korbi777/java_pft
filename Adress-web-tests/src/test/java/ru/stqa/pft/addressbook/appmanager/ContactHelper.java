package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void initContactModification() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void deleteContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void selectedContact() {
        click(By.name("selected[]"));
    }

    public void logOut() {
        click(By.linkText("Logout"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

}
