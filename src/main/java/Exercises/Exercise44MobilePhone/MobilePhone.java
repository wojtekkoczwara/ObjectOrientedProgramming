package Exercises.Exercise44MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
//        int contactIndex = findContact(contact);
        Contact existingContact = queryContact(contact.getName());
        if(existingContact == null){
            myContacts.add(contact);
//            System.out.println("Contact added");
            return true;
        }
        System.out.println("Contact not found");
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int contactIndex = findContact(oldContact);
        if(contactIndex == -1){
            System.out.println("Contact not found");
            return false;
        }
        System.out.println("Contact found,can be replaced");
        myContacts.set(contactIndex, newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int contactIndex = findContact(contact);
        if(contactIndex == -1){
            System.out.println("Contact not found");
            return false;
        }
        System.out.println("Contact found,can be removed");
        myContacts.remove(contactIndex);
        return true;
    }

    private int findContact(Contact contact){
        String name = contact.getName();
        if(findContact(name) >= 0){
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }

    private int findContact(String contactName){
        Contact queriedContact = queryContact(contactName);
        if(queriedContact != null){
            return myContacts.indexOf(queriedContact);
        } else {
            return -1;
        }
    }

    public Contact queryContact(String name){
        for(int i = 0; i < myContacts.size(); i++) {
           if ( myContacts.get(i).getName().equals(name)){
               return myContacts.get(i);
           }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i + 1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
