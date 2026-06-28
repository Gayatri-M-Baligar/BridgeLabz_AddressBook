package com.bridgeLabz.AddressBook;
import java.util.Scanner;
class Contact1 {

    // Instance variables
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;
    String email;

    // Parameterized Constructor
    public Contact1(String firstName, String lastName, String address,
                   String city, String state, int zip,
                   long phoneNumber, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Display Contact Details
    public void displayContact() {

        System.out.println("First Name : " + firstName);
        System.out.println("Last Name : " + lastName);
        System.out.println("Address : " + address);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Zip : " + zip);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email : " + email);
    }
}
class AddressBook {

    Contact1 contact;

    // Add Contact
    public void addContact(Contact1 contact) {

        this.contact = contact;

        System.out.println("\nContact Added Successfully.\n");

        contact.displayContact();
    }
}



public class AddressBookUC2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name : ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name : ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address : ");
        String address = sc.nextLine();

        System.out.print("Enter City : ");
        String city = sc.nextLine();

        System.out.print("Enter State : ");
        String state = sc.nextLine();

        System.out.print("Enter Zip : ");
        int zip = sc.nextInt();

        System.out.print("Enter Phone Number : ");
        long phoneNumber = sc.nextLong();

        sc.nextLine();

        System.out.print("Enter Email : ");
        String email = sc.nextLine();

        // Create Contact Object
        Contact1 contact = new Contact1(firstName, lastName, address,
                city, state, zip, phoneNumber, email);

        // Create AddressBook Object
        AddressBook addressBook = new AddressBook();

        // Add Contact
        addressBook.addContact(contact);

        sc.close();
    }
}
