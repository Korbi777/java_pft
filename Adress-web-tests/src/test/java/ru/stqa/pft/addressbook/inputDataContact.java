package ru.stqa.pft.addressbook;

public record inputDataContact(String firstname, String middlename, String lastname, String nickname, String title,
                               String company, String address, String home, String mobile) {
}