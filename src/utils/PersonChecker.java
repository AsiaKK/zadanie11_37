package utils;

import domain.Person;

import java.util.Scanner;

public class PersonChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("Set person data: ");
        System.out.println("________________");
        System.out.println("Enter first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scan.nextLine();
        System.out.println("Enter pesel: ");
        String pesel = scan.nextLine();
        System.out.println("Enter age");
        int age = scan.nextInt();
        scan.close();
        Person person1 = new Person(firstName, lastName, pesel, age);

        System.out.println("================================");
        System.out.println("You entered person data: ");
        System.out.println("first name: " + firstName);
        System.out.println("last name: " + lastName);
        System.out.println("pesel: " + pesel);
        System.out.println("age: " + age);
    }
}
