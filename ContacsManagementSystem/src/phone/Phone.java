package phone;

import phoneBook.PhoneBook;

import java.util.ArrayList;

public class Phone {
    protected String name;
    protected String phone;

    public Phone(){}

    public Phone(String name, String phone) {
        this.name = name;
        this.phone = phone;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
