package ManegerPhoneBook;
import phoneBook.PhoneBook;

public class MangerPhoneBook{
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone("iphone","cccc");
        phoneBook.insertPhone("samsung","2222");
        phoneBook.display();

        phoneBook.removePhone("oppo");
        System.out.println("listBook after remove: ");
        phoneBook.display();

        phoneBook.updatePhone("samsung","12345");
        phoneBook.insertPhone("Vsmart","999999");
        System.out.println("ListBook after updatePhone: ");
        phoneBook.display();

        System.out.println("Search: ");
        phoneBook.searchPhone("samsung");

        System.out.println("after sort: ");
        phoneBook.sortPhone();
        phoneBook.display();
    }
}
