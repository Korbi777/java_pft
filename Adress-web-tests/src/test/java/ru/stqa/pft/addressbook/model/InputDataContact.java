package ru.stqa.pft.addressbook.model;

public class InputDataContact {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String home;
    private final String mobile;

    public InputDataContact(String firstname, String middlename, String lastname, String nickname, String title, String company,
                            String address, String home, String mobile){
        this.firstname=firstname;
        this.middlename=middlename;
        this.lastname=lastname;
        this.nickname=nickname;
        this.title=title;
        this.company=company;
        this.address=address;
        this.home=home;
        this.mobile=mobile;
    }
    public String getFirstname() {return firstname;}
    public String getMiddlename() {return middlename;}
    public String getLastname() {return lastname;}
    public String getNickname() {return nickname;}
    public String getTitle() {return title;}
    public String getCompany() {return company;}
    public String getAddress() {return address;}
    public String getHome() {return home;}
    public String getMobile() {return mobile;}
}