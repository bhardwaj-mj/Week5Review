package com.bridgelabz;

import java.io.IOException;
import java.util.List;

public interface ServiceType {
    void writeData(List<Contact> contactList) throws IOException;
    void readData()throws IOException;
    long countEntries()throws IOException;
}
