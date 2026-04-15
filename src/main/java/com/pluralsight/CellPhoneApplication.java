package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Gets user input
        System.out.print("What is the serial number: ");
        int serialNumber = userInput.nextInt();
        userInput.nextLine();

        System.out.print("what model is the phone: ");
        String model = userInput.nextLine();

        System.out.print("who is the carrier: ");
        String carrier = userInput.nextLine();

        System.out.print("What is the phone number: ");
        String phoneNumber = userInput.nextLine();

        System.out.print("who is the owner of the phone: ");
        String owner = userInput.nextLine();

        // This sends user input to cellphone class
        CellPhone phone = new CellPhone(serialNumber,model,carrier,phoneNumber,owner);

        // retrieves certain stored attribute from cellphone class
        System.out.println(phone.getOwner());

    }
}
