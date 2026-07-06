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

    //edit Contact

    public void editContact(String firstname, Contact1 contact, Scanner sc){
        if(contact.firstName.equalsIgnoreCase(firstname)){
            System.out.print("Contact found");
            contact.address=sc.nextLine();
            contact.city=sc.nextLine();
            contact.state=sc.nextLine();
            contact.zip=sc.nextInt();
            contact.phoneNumber=sc.nextLong();
            sc.nextLine();
            String email=sc.nextLine();
            System.out.println("Updates Details are: ");
            contact.displayContact();;
        }else{
            System.out.print("Contact not found");
        }
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
        addressBook.addContact(contact);

        System.out.println("Enter the first name to edit the contact: ");
        String name =sc.nextLine();
        addressBook.editContact(name,contact,sc);
        // Add Contact

        sc.close();
    }
}
