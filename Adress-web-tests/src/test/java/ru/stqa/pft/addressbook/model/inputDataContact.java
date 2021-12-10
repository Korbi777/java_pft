package ru.stqa.pft.addressbook.model;

public record inputDataContact(String firstname, String middlename, String lastname, String nickname, String title,
                               String company, String address, String home, String mobile) {
}