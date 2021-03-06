package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.InputDataContact;

public class AddNewContactTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getContactHelper().gotoPageAddNewContact();
        app.getContactHelper().dataInputContact(new InputDataContact("Sergey", "Sasha", "Ivanov", "sergey41", "hi!", "RSHB", "g. Moscow", "Russia", "+79003331234"));
        app.getContactHelper().dataStorageContact();
        app.checkingCreationPage();
        app.getContactHelper().logOut();
    }
}

