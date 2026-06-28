package com.bridgeLabz.AddressBook;
class Contact{

    //instance variables of a specific user required for contacting
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;
    String email;

    public Contact(String firstName,String lastName,String address,String city,String state,int zip,long phoneNumber,String email){
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    //Printing the details of contact
    public void displayContact() {
        System.out.println("First Name: " + firstName + ",\nLast Name: " + lastName + ",\nAddress: " + address + ",\nCity: " + city + ",\nState: " + state + ",\nZip: " + zip + ",\nPhone Number: " + phoneNumber + ",\nEmail: " + email);
    }
}
public class AddressBookUC1 {
    public static void main(String[] args) {

        //creating an object of contact class;
        Contact c1=new Contact("Gayatri","Baligar","Hubli","Hubli","Karnataka",581205,9452631452L,"gayat123@gmail.com");
        //calling the dispayContat() method to display the details
        c1.displayContact();
    }
}
