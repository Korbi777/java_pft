package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase{

    @Test
    public void testDeleteContact() {
        app.gotoPageHome();
        app.getContactHelper().selectedContact();
        app.getContactHelper().deleteContact();
        app.getContactHelper().closingAlertWindow();
        app.getContactHelper().logOut();
    }
}
