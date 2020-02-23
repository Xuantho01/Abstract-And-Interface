package phoneBook;
import phone.Phone;
import PhoneFunction.PhoneFunction;

import java.util.ArrayList;
import java.util.Comparator;

public class PhoneBook extends Phone implements PhoneFunction{

    public PhoneBook(){}

    protected ArrayList<Phone> listBook = new ArrayList<>();

    public PhoneBook(String name, String phone) {
        super(name, phone);
    }

   public void display(){
    for (Phone phone: listBook){
        System.out.println("name: " + phone.getName() + "\tPhone Number: " + phone.getPhone());
    }
}
    @Override
    public void insertPhone(String name, String phone) {
          PhoneBook newPhone = new PhoneBook(name,phone);
          listBook.add(newPhone);
    }

    @Override
    public void removePhone(String name) {
         for(Phone phoneRemove: listBook){
             if(phoneRemove.getName().equals(name)){
                 listBook.remove(phoneRemove);
                 break;
             }
         }
    }

    @Override
    public void updatePhone(String name, String phone) {
        for(Phone phoneUpdate: listBook){
            if(phoneUpdate.getName().equals(name)){
                phoneUpdate.setName(name);
                phoneUpdate.setPhone(phone);
                break;
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for(Phone phoneSearch: listBook){
            if(phoneSearch.getName().equals(name)){
                System.out.println("results: "+ phoneSearch.toString());
                break;
            }
        }
    }

    @Override
    public void sortPhone() {
     if(listBook.size() > 0){
         listBook.sort(
                 new Comparator<Phone>() {
                     @Override
                     public int compare(Phone o1, Phone o2) {
                         return o1.getName().compareTo(o2.getName());
                     }
                 }
         );
     }
    }
}
