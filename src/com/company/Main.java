package com.company;
import java.util.Scanner;

public class Main {
    private static String firstInitial;
    private static  String lastName;
    private static  int houseNumber;
    private static  String streetName;
    private static  String streetType;
    private static  String city;

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter your first name initial: ");
	firstInitial = scanner.nextLine();

	System.out.print("Enter your Last name: ");
	lastName = scanner.nextLine();

	System.out.print("Enter your House Number: ");
	houseNumber = scanner.nextInt();

	System.out.print("Enter your Street Name: ");
	streetName = scanner.next();

	System.out.print("Enter your Street Type: ");
	streetType = scanner.next();

	System.out.print("Enter your city: ");
	city = scanner.nextLine();

	System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
	System.out.println(streetName + " " + streetType + " " + city);
    }
}
