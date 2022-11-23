package com.bridgelabz;

public class Contact {
    private final String firstName;
    private final String lastName;
    private final String city;
    private final String state;
    private final String email;
    private final String mobileNumber;

    public Contact(String firstName, String lastName, String city, String state, String email, String mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}
