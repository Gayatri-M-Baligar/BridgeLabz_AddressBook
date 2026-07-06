package com.bridgeLabz.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

class Contact5 {

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
    public Contact5(String firstName, String lastName, String address,
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

        System.out.println("--------------------------------");
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

class AddressBook5 {

    // Stores multiple contacts
    ArrayList<Contact5> contactList = new ArrayList<>();

    // Add Contact
    public void addContact(Contact5 contact) {

        contactList.add(contact);

        System.out.println("\nContact Added Successfully.");
    }

    // Display all contacts
    public void displayContacts() {

        if (contactList.isEmpty()) {

            System.out.println("No Contacts Found.");
            return;
        }

        System.out.println("\nAddress Book Contacts");

        for (Contact5 contact : contactList) {

            contact.displayContact();
        }
    }
}

public class AddressBookUC5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AddressBook5 addressBook = new AddressBook5();

        char choice;

        do {

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
            Contact5 contact = new Contact5(firstName, lastName, address,
                    city, state, zip, phoneNumber, email);

            // Add Contact
            addressBook.addContact(contact);

            System.out.print("\nDo you want to add another contact? (Y/N) : ");
            choice = sc.next().charAt(0);
            sc.nextLine();

        } while (choice == 'Y' || choice == 'y');

        // Display all contacts
        addressBook.displayContacts();

        sc.close();
    }
}