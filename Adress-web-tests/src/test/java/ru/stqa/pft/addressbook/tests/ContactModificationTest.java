package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.inputDataContact;

public class ContactModificationTest extends TestBase{
    @Test
    public void testContactModification() {
        app.gotoPageHome();
        app.getContactHelper().initContactModification();
        app.dataInputContact(new inputDataContact("Victor", "Sasha", "Andreev", "sergey41", "hi!", "RSHB", "g. Moscow", "Russia", "+79003331234"));
        app.getGroupHelper().submitGroupModification();
    }
}
