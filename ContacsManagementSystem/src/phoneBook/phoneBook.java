package phoneBook;
import PhoneFunction.phoneFunction;
import phone.phone;
public class phoneBook extends phone implements phoneFunction{



    public phoneBook(String name, String phone) {
        super(name, phone);
        phoneBook[] phoneBooks = new phoneBook[10];
    }


    @Override
    public void insertPhone(String name, String phone) {
         phone NewPhone = new phone(name,phone);
         phoneBooks.add(NewPhone);
    }

    @Override
    public void removePhone(String name) {

    }

    @Override
    public void updatePhone(String name, String phone) {

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sortPhone() {

    }
}
