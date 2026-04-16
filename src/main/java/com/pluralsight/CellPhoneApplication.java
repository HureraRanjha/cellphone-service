package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication
{
    public static void main(String[] args)
    {
        CellPhone usersPhone1 = new CellPhone();
        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        usersPhone1.setSerialNumber(Integer.parseInt(myScanner.nextLine()));

        System.out.print("What model is the phone? ");
        usersPhone1.setModel(myScanner.nextLine());

        System.out.print("Who is the carrier? ");
        usersPhone1.setCarrier(myScanner.nextLine());

        System.out.print("What is the phone number? ");
        usersPhone1.setPhoneNumber(myScanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        usersPhone1.setOwner(myScanner.nextLine());

        System.out.printf("Serial: %d\nModel: %s\nCarrier: %s\nPhoneNum: %s\nOwner: %s", usersPhone1.getSerialNumber(), usersPhone1.getModel(), usersPhone1.getCarrier(), usersPhone1.getPhoneNumber(), usersPhone1.getOwner());
    }
}
