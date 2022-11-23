package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressBookIOServiceTest {
    @Test
    void givenThreeContacts_whenWritten_shouldReturnCount(){
        Contact contact1=new Contact("Manoj","Kumar","Safidon","Haryana","manojbhardwaj@gmail.com","9999999999");
        Contact contact2=new Contact("Nagraj","Panchal","Bidar","Karnataka","nagrajpanchal@gmail.com","8888888888");
        Contact contact3=new Contact("Romil","Ghadge","Pune","Maharashtra","romilghadge@gmail.com","7777777777");
        List<Contact> contactList=new ArrayList<>();
        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        AddressBookService addressBookService=new AddressBookService(contactList);
        addressBookService.writeContactData(IOService.FILE_IO);
        addressBookService.readContactData(IOService.FILE_IO);
        long count = 0;
        count = addressBookService.countData(IOService.FILE_IO);
        Assertions.assertEquals(3,count);

    }
}
