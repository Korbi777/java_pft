package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class deleteContactTest extends TestBase{

    @Test
    public void testDeleteContact() {
        app.gotoPageHome();
        app.getGroupHelper().selectedGroup();
        app.getContactHelper().deleteContact();
        app.getGroupHelper().closingAlertWindow();
        app.getGroupHelper().returnToGroupPage();
    }
}
