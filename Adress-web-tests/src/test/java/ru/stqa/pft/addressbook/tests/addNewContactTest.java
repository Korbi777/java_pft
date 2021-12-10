package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.inputDataContact;

public class addNewContactTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.gotoPageAddNewContact();
        app.dataInputContact(new inputDataContact("Sergey", "Sasha", "Ivanov", "sergey41", "hi!", "RSHB", "g. Moscow", "Russia", "+79003331234"));
        app.dataStorageContact();
        app.chekingCreationPage();
        app.getGroupHelper().returnToGroupPage();
    }
}

