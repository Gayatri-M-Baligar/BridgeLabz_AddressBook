package com.bridgeLabz.AddressBook;

import java.util.Scanner;

class Contact3 {

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
    public Contact3(String firstName, String lastName, String address,
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

        System.out.println("\nContact Details");
        System.out.println("---------------------------");
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

class AddressBook3 {

    Contact3 contact;

    // Add Contact
    public void addContact(Contact3 contact) {

        this.contact = contact;

        System.out.println("\nContact Added Successfully.");

        contact.displayContact();
    }

    // Edit Contact
    public void editContact(String firstName, Scanner sc) {

        if (contact.firstName.equalsIgnoreCase(firstName)) {

            System.out.println("\nContact Found");
            System.out.println("Enter New Details");

            System.out.print("Enter Address : ");
            contact.address = sc.nextLine();

            System.out.print("Enter City : ");
            contact.city = sc.nextLine();

            System.out.print("Enter State : ");
            contact.state = sc.nextLine();

            System.out.print("Enter Zip : ");
            contact.zip = sc.nextInt();

            System.out.print("Enter Phone Number : ");
            contact.phoneNumber = sc.nextLong();

            sc.nextLine();

            System.out.print("Enter Email : ");
            contact.email = sc.nextLine();

            System.out.println("\nContact Updated Successfully.");

            contact.displayContact();

        } else {

            System.out.println("Contact Not Found.");
        }
    }
}

public class AddressBookUC3 {

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
        Contact3 contact = new Contact3(firstName, lastName, address,
                city, state, zip, phoneNumber, email);

        // Create AddressBook Object
        AddressBook3 addressBook = new AddressBook3();

        // Add Contact
        addressBook.addContact(contact);

        // Edit Contact
        System.out.print("\nEnter First Name to Edit Contact : ");
        String name = sc.nextLine();

        addressBook.editContact(name, sc);

    }
}