package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.InputDataContact;

public class AddNewContactTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.gotoPageAddNewContact();
        app.dataInputContact(new InputDataContact("Sergey", "Sasha", "Ivanov", "sergey41", "hi!", "RSHB", "g. Moscow", "Russia", "+79003331234"));
        app.dataStorageContact();
        app.checkingCreationPage();
        app.getContactHelper().logOut();
    }
}

