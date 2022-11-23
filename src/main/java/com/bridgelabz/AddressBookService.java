package com.bridgelabz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressBookService {

    private final List<Contact> contactList;

    public AddressBookService() {
        contactList = new ArrayList<>();
    }

    public AddressBookService(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public ServiceType getServiceType(IOService ioType) {
        ServiceType serviceType;
        serviceType = new FileIOServiceImpl();
        return serviceType;
    }

    public void writeContactData(IOService ioType) {
        ServiceType serviceType = getServiceType(ioType);
        try {
            serviceType.writeData(contactList);
        } catch (IOException e) {
            System.out.println("Catch");
        }
    }

    public void readContactData(IOService ioType) {
        ServiceType serviceType = getServiceType(ioType);
        try {
            serviceType.readData();
        } catch (IOException e) {
            System.out.println("Catch");
        }
    }

    public long countData(IOService ioType) {
        ServiceType serviceType = getServiceType(ioType);
        try {
            return serviceType.countEntries();
        } catch (IOException e) {
            System.out.println("Catch");
        }
        return 0;
    }
}
