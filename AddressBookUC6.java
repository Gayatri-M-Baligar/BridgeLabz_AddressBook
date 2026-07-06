package com.bridgeLabz.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Contact6 {

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
    public Contact6(String firstName, String lastName, String address,
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
        System.out.println();
    }
}

class AddressBook6 {

    ArrayList<Contact6> contactList = new ArrayList<>();

    // Add Contact
    public void addContact(Contact6 contact) {

        contactList.add(contact);
    }

    // Display Contacts
    public void displayContacts() {

        if (contactList.isEmpty()) {

            System.out.println("No Contacts Available.");
            return;
        }

        for (Contact6 contact : contactList) {

            contact.displayContact();
        }
    }
}

public class AddressBookUC6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dictionary to store multiple Address Books
        HashMap<String, AddressBook6> addressBookMap = new HashMap<>();

        char choice;

        do {

            System.out.print("Enter Address Book Name : ");
            String bookName = sc.nextLine();

            AddressBook6 addressBook = new AddressBook6();

            addressBookMap.put(bookName, addressBook);

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

            Contact6 contact = new Contact6(firstName, lastName, address,
                    city, state, zip, phoneNumber, email);

            addressBook.addContact(contact);

            System.out.print("Do you want to add another Address Book? (Y/N) : ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'Y' || choice == 'y');

        // Display all Address Books
        System.out.println("\nAddress Books in the System");

        for (String bookName : addressBookMap.keySet()) {

            System.out.println("--------------------------------");
            System.out.println("Address Book : " + bookName);
            System.out.println("--------------------------------");

            addressBookMap.get(bookName).displayContacts();
        }

        sc.close();
    }
}