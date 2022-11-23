package com.bridgelabz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileIOServiceImpl implements ServiceType {
    static final String FILE_PATH = "E:\\BridgeLabz\\RFP\\AddressBookReview1\\src\\AddressBook";
    @Override
    public void writeData(List<Contact> contactList) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        contactList.forEach(contact -> {
            String contactString = contact.toString().concat("\n");
            stringBuffer.append(contactString);
        });
        Files.write(Path.of(FILE_PATH), stringBuffer.toString().getBytes());
    }

    @Override
    public void readData() {
        try {
            Files.lines(Path.of(FILE_PATH)).forEach(employee -> System.out.println(employee));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public long countEntries() {
        try {
            return Files.lines(Path.of(FILE_PATH)).count();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
